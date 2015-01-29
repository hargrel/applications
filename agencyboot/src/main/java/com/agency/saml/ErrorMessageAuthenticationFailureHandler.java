package com.agency.saml;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class ErrorMessageAuthenticationFailureHandler implements
		AuthenticationFailureHandler {

	protected final Log logger = LogFactory.getLog(getClass());

	private String defaultErrorUrl;
	private Map<String, String> urlMapping;
		
	@Override
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
		
		Throwable t = exception.getCause();
		if(urlMapping.containsKey(t.getMessage())) {
			response.sendRedirect(urlMapping.get(t.getMessage()));
		} else {
			response.sendRedirect(defaultErrorUrl);
		}
	}
	
	public String getDefaultErrorUrl() {
		return defaultErrorUrl;
	}

	public void setDefaultErrorUrl(String defaultErrorUrl) {
		this.defaultErrorUrl = defaultErrorUrl;
	}
	
	public Map<String, String> getUrlMapping() {
		return urlMapping;
	}

	public void setUrlMapping(Map<String, String> urlMapping) {
		this.urlMapping = urlMapping;
	}	
}