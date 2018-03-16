package com.gyc.trade.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServicceApplication {
    public static void main( String[] args ){
    	SpringApplication.run(ServicceApplication.class, args);
    }
    
    @RequestMapping(value="/hello/{name}",method = RequestMethod.GET)
    public String hello(@PathVariable(name="name") String name){
        return "hello-"+name;
    }
}
