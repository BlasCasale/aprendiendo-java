package com.example.service;

import com.example.dao.IIndividualDao;
import com.example.domain.Individual;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IndividualServiceImplements implements IndividualService {

    @Autowired
    private IIndividualDao individualDao;

    @Override
    @Transactional(readOnly = true)
    public List<Individual> individualList() {
        return (List<Individual>) individualDao.findAll();
    }

    @Override
    @Transactional
    public void save(Individual individual) {
        individualDao.save(individual);
    }

    @Override
    @Transactional
    public void delete(Individual individual) {
        individualDao.delete(individual);
    }

    @Override
    @Transactional(readOnly = true)
    public Individual find(Individual individual) {
        return individualDao.findById(individual.getId()).orElse(null);
    }
    
    @Override
    @Transactional
    public Individual saveApi(Individual individual) {
        individualDao.save(individual);
        return individual;
    }

}
