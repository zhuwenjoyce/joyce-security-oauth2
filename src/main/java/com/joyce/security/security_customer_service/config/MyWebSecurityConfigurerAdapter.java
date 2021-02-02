//package com.joyce.security.security_customer_service.config;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import com.joyce.security.security_customer_service.service.MyUserDetailsService;
//
///**
// * @author: Joyce Zhu
// * @date: 2021/2/2
// */
//@Slf4j
//@Configuration
//public class MyWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
//
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        log.info("config security bean....");
////        http.authorizeRequests()
////                .anyRequest().authenticated()
////                .and()
////                .oauth2Login();
////    }
//
////    /**
////     * config custom login page
////     */
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                // any request URL will redirect to /oauth_login
////                .antMatchers("/css/*.css")
////                .permitAll()
////                // .anyRequest().authenticated()是对http所有的请求必须通过授权认证才可以访问
////                .anyRequest()
////                // .authenticated() 用户登录后可访问
////                .authenticated()
////
////                // 自定义登录页。指定登录页的路径。这个formLogin().permitAll()方法允许所有用户基于表单登录访问/login这个page
////                .and()
////                .formLogin()
////                .loginPage("/login/oauth_login")
////                .permitAll()
////                //指定登录成功后跳转到/index页面
////                .defaultSuccessUrl("/index")
////                //指定登录失败后跳转到/login?error页面
////                .failureUrl("/login?error")
////                .and()
////                //开启cookie储存用户信息，并设置有效期为14天，指定cookie中的密钥
////                .rememberMe().tokenValiditySeconds(1209600).key("mykey")
////                .and()
////                .logout()
////                //指定登出的url
////                .logoutUrl("/login/logout")
////                //指定登场成功之后跳转的url
////                .logoutSuccessUrl("/index")
////                .permitAll()
////
//////                .and()
//////                .oauth2Login()
//////                .loginPage("/login/oauth_login22")
////        ;
////    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        super.configure(web);
//    }
//
//    // 自定义user service方式一
//    @Override
//    //重写了configure参数为AuthenticationManagerBuilder的方法
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //并根据传入的AuthenticationManagerBuilder中的userDetailsService方法来接收我们自定义的认证方法。
//        //且该方法必须要实现UserDetailsService这个接口。
//        auth.userDetailsService(new com.joyce.security.security_customer_service.service.MyUserDetailsService())
//                //密码使用BCryptPasswordEncoder()方法验证，因为这里使用了BCryptPasswordEncoder()方法验证。所以在注册用户的时候在接收前台明文密码之后也需要使用BCryptPasswordEncoder().encode(明文密码)方法加密密码。
//                .passwordEncoder(new BCryptPasswordEncoder());
//    }
//
//
//}
