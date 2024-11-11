package com.example;

import com.example.domain.Individual;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/*
    este controlador rest tengo que hacerlo dentro del mismo package
    para que el main pueda ejecutar este controlador
 */
@Controller
@Slf4j
public class RESTController {
    
    @Value("${index.helloApp}")
    private String helloApp;
    
    @GetMapping("/")
    public String theBeggins(Model model) {
        Individual individual = new Individual();
        individual.setName("Blas");
        individual.setLastName("Casale");
        individual.setAge(27);
        individual.setMail("fake@mail.com");
        individual.setCellphone("123456");
        String hello = "ya cambio";
        model.addAttribute("hello", hello);
        model.addAttribute("helloApp", helloApp);
        return "index";
    }
}
