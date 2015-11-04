/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Campitos Ley <campitos-ley.com>
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@Controller
public class Aplicacion {
    
    @RequestMapping("/")
    public String hola(){
        return "inicio.html";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);
    }
    
}
