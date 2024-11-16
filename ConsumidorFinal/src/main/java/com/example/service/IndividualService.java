package com.example.service;

import com.example.domain.Individual;
import java.util.List;

public interface IndividualService {

    public List<Individual> individualList();

    public void save(Individual individual);

    public Individual saveApi(Individual individual);

    public void delete(Individual individual);

    public Individual find(Individual individual);
}
