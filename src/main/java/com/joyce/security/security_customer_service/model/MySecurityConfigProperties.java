package com.joyce.security.security_customer_service.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: Joyce Zhu
 * @date: 2021/2/2
 */
@Component("mySecurityConfigProperties")
@Data
@ConfigurationProperties(prefix = "joyce.security")
public class MySecurityConfigProperties {

    private String clientId;
    private String authorizationUri;
    private String clientSecret;
    private String tokenUri;
    private String redirectUri;
    private String scopes;
    private String clientName;
    private String authorizedGrantType;
    private String userInfoUri;

}
