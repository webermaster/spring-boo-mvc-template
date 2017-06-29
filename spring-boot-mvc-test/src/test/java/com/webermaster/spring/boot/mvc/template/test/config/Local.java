package com.webermaster.spring.boot.mvc.template.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by kevin.weber on 6/28/2017.
 */
@PropertySource("classpath:local.properties")
@Profile("local")
@Configuration
public class Local {
}
