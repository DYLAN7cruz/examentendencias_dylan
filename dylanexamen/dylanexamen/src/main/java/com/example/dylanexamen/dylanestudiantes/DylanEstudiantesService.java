package com.example.dylanexamen.dylanestudiantes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DylanEstudiantesService {

    @Autowired
    private DylanEstudiantesRepository dylanEstudiantesRepository;

    //create
    public DylanEstudiantes save(DylanEstudiantes entity)
    {
        return dylanEstudiantesRepository.save(entity);
    }


    //findbyid
    public DylanEstudiantes findById(Long id)
    {
        return dylanEstudiantesRepository.findById(id).orElse(null);
    }

    //delete

    public void deleteById( long id)
    {
        dylanEstudiantesRepository.deleteById(id);
        {
            dylanEstudiantesRepository.deleteById(id);
        }
    }

    //delete

    public void deleteByNombre( String nombre)
    {
        dylanEstudiantesRepository.deleteByNombre(nombre);
        {
            dylanEstudiantesRepository.deleteByNombre(nombre);
        }
    }

    //select all
    public List<DylanEstudiantes> findAll()
    {
        return dylanEstudiantesRepository.findAll();
    }
    
}
