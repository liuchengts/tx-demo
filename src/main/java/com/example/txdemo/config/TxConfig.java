package com.example.txdemo.config;

import com.example.txdemo.common.TxSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TxConfig {

    @Bean
    TxSupport txSupport() {
        return new TxSupport();
    }
}
