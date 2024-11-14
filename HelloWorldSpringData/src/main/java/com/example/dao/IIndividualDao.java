package com.example.dao;

import com.example.domain.Individual;
import org.springframework.data.repository.CrudRepository;

public interface IIndividualDao extends CrudRepository<Individual, Long> {

}
