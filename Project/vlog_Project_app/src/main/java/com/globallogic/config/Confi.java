package com.globallogic.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Confi {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
