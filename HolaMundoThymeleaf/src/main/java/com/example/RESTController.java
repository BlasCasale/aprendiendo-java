package com.example;

import com.example.domain.Individual;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        String hello = "ya cambio";
        model.addAttribute("hello", hello);
        model.addAttribute("helloApp", helloApp);

        Individual individual = new Individual();
        individual.setName("Blas");
        individual.setLastName("Casale");
        individual.setAge(27);
        individual.setMail("fake@mail.com");
        individual.setCellphone("123456");

        Individual individual2 = new Individual();

        individual2.setName("Jazmín");
        individual2.setLastName("Aranda");
        individual2.setAge(26);
        individual2.setMail("jazaranda22@gmail.com");
        individual2.setCellphone("123456");

        //List<Individual> individuals = new ArrayList();
        //individuals.add(individual);
        //individuals.add(individual2);
        List individuals = Arrays.asList(individual, individual2);

        model.addAttribute("individuals", individuals);
        return "index";
    }
}
