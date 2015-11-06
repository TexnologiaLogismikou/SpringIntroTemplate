/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.springcustomintro;

import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author KuroiTenshi
 */
@Controller
public class GeneralController {
    /**
     * Starts the program with a specified and not the default port
     * @return
     */
    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer(){
        return (container-> { container.setPort(9090);});
    }
    
    /**
     * Ending the current session of the program manually
     */
    @RequestMapping("/end-session")
    public void terminateSession() {
        System.out.println("Session terminated by the user");
        System.exit(0);
    }
}
