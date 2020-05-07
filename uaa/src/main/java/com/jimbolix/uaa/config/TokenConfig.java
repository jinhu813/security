package com.jimbolix.uaa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/**
 * @Author: ruihui.li
 * @Date: 2020/5/7 10:30
 * @Description: 
 */
@Configuration
public class TokenConfig {
    @Bean
    public TokenStore tokenStore(){
        return new InMemoryTokenStore();
    }
}