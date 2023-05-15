package com.portfolio.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.model.Form;

public interface formRepo extends JpaRepository<Form,Long > 
{

}
