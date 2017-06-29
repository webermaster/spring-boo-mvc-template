package com.slalom.spring.boot.mvc.template.test.config;

import com.slalom.spring.boot.mvc.template.test.util.HeadersFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kevin.weber on 6/28/2017.
 */
@Import({Local.class})
@Configuration
public class Config {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public HeadersFactory headersFactory(@Value("${username}") String username, @Value("${password}") String password) {
        return new HeadersFactory(username, password);
    }
}
