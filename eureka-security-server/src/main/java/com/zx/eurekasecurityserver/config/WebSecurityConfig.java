package com.zx.eurekasecurityserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Spring Security 默认开启了所有 CSRF 攻击防御，需要禁用 /eureka 的防御
        http.csrf().ignoringAntMatchers("/eureka/**");
        //访问eureka控制台和/actuator时能做安全控制
        super.configure(http);
//            http.csrf().disable();//禁用CSRF
//            http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }
}
