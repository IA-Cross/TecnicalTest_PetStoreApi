package com.tectest.tectest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/** Spring bean configuration for HTTP clients. */
@Configuration
public class AppConfig {

    /** Creates a RestTemplate bean for consuming external APIs. */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}