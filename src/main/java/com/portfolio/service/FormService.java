package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.model.Form;
import com.portfolio.repo.formRepo;


@Service
public class FormService {

    @Autowired
    private formRepo repo;

    public Form save(Form form) {
        return repo.save(form);
    }
}
