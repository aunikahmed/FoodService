package com.aunik.restfullService.config;

import com.aunik.restfullService.domain.Employee;
import com.aunik.restfullService.domain.Menu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by muzaddid on 11/16/14.
 */
@Configuration
public class CoreConfig {
    @Bean
    public Employee employee(){
        return new Employee();
    }

    @Bean
    public Menu menu(){
        Menu menu =new Menu();
        menu.setName("Special");
        return menu;
    }
}
