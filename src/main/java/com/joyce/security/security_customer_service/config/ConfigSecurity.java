//package com.joyce.security.config;
//
//import com.joyce.security.model.MySecurityConfigProperties;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.oauth2.client.registration.ClientRegistration;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
//import org.springframework.security.oauth2.core.AuthorizationGrantType;
//import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
//
///**
// * @author: Joyce Zhu
// * @date: 2021/2/2
// */
//@Slf4j
//@Configuration
//public class ConfigSecurity {
//
//    @Bean("clientRegistrationRepository")
//    public ClientRegistrationRepository registrationRepository(
//            @Qualifier("mySecurityConfigProperties") MySecurityConfigProperties properties
//    ) {
//        log.info("register bean ClientRegistrationRepository... properties = {}", properties);
//
//        ClientRegistration client = ClientRegistration.withRegistrationId(properties.getClientId())
//                .authorizationUri(properties.getAuthorizationUri())
//                .clientSecret(properties.getClientSecret())
//                .tokenUri(properties.getTokenUri())
//                .redirectUri(properties.getRedirectUri())
//                .scope(properties.getScopes().split(","))
//                .clientName(properties.getClientName())
////                .clientAlias(properties.getClientAlias())
//                .authorizationGrantType(new AuthorizationGrantType(properties.getAuthorizedGrantType()))
//                .userInfoUri(properties.getUserInfoUri())
//                .clientAuthenticationMethod(ClientAuthenticationMethod.BASIC)
//                .build();
//
//        InMemoryClientRegistrationRepository repository = new InMemoryClientRegistrationRepository(client);
//        return repository;
//    }
//
//}
