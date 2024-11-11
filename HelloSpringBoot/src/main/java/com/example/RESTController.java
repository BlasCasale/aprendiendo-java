package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    este controlador rest tengo que hacerlo dentro del mismo package
    para que el main pueda ejecutar este controlador
 */
@RestController
@Slf4j
public class RESTController {

    @GetMapping("/")
    public String theBeggins() {
        return "Hello with Spring Boot and its my first response";
    }
}
