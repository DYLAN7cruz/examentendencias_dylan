package com.example.dylanexamen.dylancinturon;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface DylanCinturonRepository extends CrudRepository<DylanCinturon, Long> {

    List<DylanCinturon> findAll();
    @Transactional
    void deleteByColor(String color);
    
}
