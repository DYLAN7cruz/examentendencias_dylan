package com.example.dylanexamen.dylanestudiantes;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface DylanEstudiantesRepository extends CrudRepository<DylanEstudiantes, Long> {

    List<DylanEstudiantes> findAll();
    @Transactional
    void deleteByNombre(String nombre);
    
}
