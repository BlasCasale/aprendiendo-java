package com.example;

import com.example.domain.Individual;
import com.example.service.IndividualService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
    este controlador rest tengo que hacerlo dentro del mismo package
    para que el main pueda ejecutar este controlador
 */
@RestController // con esto se estandariza la respuesta JSON
@Slf4j
public class RESTController {

  @Autowired
  private IndividualService individualService;

  @GetMapping("/")
  public String theBeggins(Model model) {

    List<Individual> individuals = individualService.individualList();

    model.addAttribute("individuals", individuals);
    return "index";
  }

  @GetMapping("/getAll")
  public List<Individual> getAllIndividual() {
    return individualService.individualList();
  }

  @GetMapping("/append")
  public String append(Individual individual) {
    return "append";
  }

  @PostMapping("/save")
  public String save(@Valid Individual individual, Errors error) {
    if (error.hasErrors()) {
      return "append";
    }
    individualService.save(individual);
    return "redirect:/";
  }

  @PostMapping("/saveApi")
  public ResponseEntity<?> saveApi(@Valid @RequestBody Individual individual) {
    try {
      individualService.saveApi(individual);
      return ResponseEntity.ok(individual);
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al guardar el individuo: " + e.getMessage());
    }
  }

  public ResponseEntity<?> saveApi(@Valid @RequestBody Individual individual, BindingResult result) {
    if (result.hasErrors()) {
      return ResponseEntity.badRequest().body(result.getAllErrors());
    }
    Individual savedIndividual = individualService.saveApi(individual);
    return new ResponseEntity<>(savedIndividual, HttpStatus.CREATED);
  }

  @GetMapping("/append/{id}")
  public String edit(Individual individual, Model model
  ) {
    individual = individual = individualService.find(individual);
    model.addAttribute("individual", individual);
    return "append";
  }

  @GetMapping("/delete/{id}")
  public String delete(Individual individual
  ) {
    individualService.delete(individual);
    return "redirect:/";
  }
  //@GetMapping("/delete")
  //public String delete(Individual individual) {
  //    individualService.delete(individual);
  //    return "redirect:/";
  //}
}
