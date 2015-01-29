package com.agency.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SamlConfig {

/*
	private static final String DEFAULT_IDP = "qgcidm";

	private File spMetadata = new File("saml/ws18004202uSP.xml");	
	private File idpMetadata = new File("saml/amazonIdP.xml");
	
	@Autowired
	private ParserPool parserPool;

	@Bean
	public CachingMetadataManager metadata() throws MetadataProviderException {
		FilesystemMetadataProvider spMetadataProvider = new FilesystemMetadataProvider(
				spMetadata);
		spMetadataProvider.setParserPool(parserPool);
		
		ExtendedMetadata extendedMetadata = new ExtendedMetadata();
		extendedMetadata.setLocal(true);
		extendedMetadata.setAlias("ws18004202uSP");
		extendedMetadata.setSecurityProfile("metaiop");
		extendedMetadata.setSslSecurityProfile("pkix");
		extendedMetadata.setSigningKey("apollo");
		extendedMetadata.setEncryptionKey("apollo");
		extendedMetadata.setRequireArtifactResolveSigned(false);
		extendedMetadata.setRequireLogoutRequestSigned(true);
		extendedMetadata.setRequireLogoutResponseSigned(false);
		extendedMetadata.setIdpDiscoveryEnabled(false);

		ExtendedMetadataDelegate extendedMetadataDelegate = new ExtendedMetadataDelegate(
				spMetadataProvider, extendedMetadata);
		
		FilesystemMetadataProvider idpMetadataProvider = new FilesystemMetadataProvider(
				idpMetadata);
		idpMetadataProvider.setParserPool(parserPool);
		
		List<MetadataProvider> providers = new ArrayList<MetadataProvider>();
		providers.add(extendedMetadataDelegate);
		providers.add(idpMetadataProvider);
		
		CachingMetadataManager cachingMetadataManager = new CachingMetadataManager(providers);
		cachingMetadataManager.setDefaultIDP(DEFAULT_IDP);

		return cachingMetadataManager;
	}

	
	@Bean
	public SAMLAuthenticationProvider samlAuthenticationProvider() {
		return new SAMLAuthenticationProvider();
	}
	
	@Bean
	public WebSSOProfileConsumerHoKImpl hokWebSSOprofileConsumer() {
		return new WebSSOProfileConsumerHoKImpl();
	}

	@Bean
	public SAMLLogger samlLogger() {
		return new SAMLDefaultLogger();
	}
	
	@Bean(initMethod="initialize")
	public StaticBasicParserPool parserPool() {
		return new StaticBasicParserPool();
	}
	
	@Bean
	public ParserPoolHolder parserPoolHolder() {
		return new ParserPoolHolder();
	}
	
	@Bean
	public JKSKeyManager keyManager() {
		Resource storeFile = new ClassPathResource("saml/saml-keystore.jks");
		String storePass = "nalle123";
		Map<String,String> passwords = new HashMap<>();
		passwords.put("apollo", "nalle123");
		String defaultKey = "apollo";
		
		return new JKSKeyManager(storeFile, storePass, passwords, defaultKey);
	}

*/

}
