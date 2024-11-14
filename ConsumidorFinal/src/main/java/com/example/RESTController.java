package com.example;

import com.example.dao.IIndividualDao;
import com.example.domain.Individual;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private IIndividualDao indDao;

    @GetMapping("/")
    public String theBeggins(Model model) {
        
        Iterable<Individual> individuals = indDao.findAll();

        model.addAttribute("individuals", individuals);
        return "index";
    }
}