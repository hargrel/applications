package com.agency.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/static/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/basic/**").hasRole("BASIC")
				.antMatchers("/standard/**").hasRole("STANDARD")
				.antMatchers("/restricted/**").hasRole("RESTRICTED").and()
				.formLogin().and().logout().logoutSuccessUrl("/").and()
				.exceptionHandling().accessDeniedPage("/error");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication().withUser("Basic").password("password")
				.roles("BASIC").and().withUser("Standard").password("password")
				.roles("STANDARD", "BASIC").and().withUser("Restricted")
				.password("password").roles("RESTRICTED", "STANDARD", "BASIC");
	}

}
