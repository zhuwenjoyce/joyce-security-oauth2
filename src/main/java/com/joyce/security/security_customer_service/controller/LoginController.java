package com.joyce.security.security_customer_service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Joyce Zhu
 * @date: 2021/2/2
 */
@Slf4j
@Controller
public class LoginController {

    private static String authorizationRequestBaseUri = "oauth2/authorization";
    Map<String, String> oauth2AuthenticationUrls = new HashMap<>();

//    @Autowired
//    private ClientRegistrationRepository clientRegistrationRepository;

    @GetMapping("/login/oauth_login")
    public String getLoginPage(Model model) {
        log.info("request URL /login/oauth_login");
        return "login"; // show index.html page
    }

    @GetMapping("/login/index")
    public String indexPage(Model model) {
        log.info("request URL /login/index");
        return "index"; // show index.html page
    }

    @ResponseBody
    @RequestMapping("/login/auth/uri")
    public String authUri(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
        log.info("request URL /login/auth/uri");
        return "saml";
    }

    @ResponseBody
    @RequestMapping("/login/token/uri")
    public String tokenUri(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
        log.info("request URL /login/token/uri");
        return "saml";
    }

    @ResponseBody
    @RequestMapping("/login/redirect/uri")
    public String redirectUri(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
        log.info("request URL /login/redirect/uri");
        return "saml";
    }

    @ResponseBody
    @RequestMapping("/login/myid/saml/login")
    public String myidSamlLogin(ModelMap model, HttpServletRequest request, HttpServletResponse response, String SAMLResponse) {
        log.info("request URL /login/myid/saml/login, SAMLResponse = {}", SAMLResponse);
        return "saml";
    }
}
