package com.estudo.helpdesk.config;

import com.estudo.helpdesk.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    private DBService dbService;
    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String value;
    @Bean
    public boolean instanciarDB(){
        if(value.equals("create")){ this.dbService.instanciarDB(); }
        return false;
    }

}
