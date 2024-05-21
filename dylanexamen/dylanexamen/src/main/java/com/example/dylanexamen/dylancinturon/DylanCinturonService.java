package com.example.dylanexamen.dylancinturon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DylanCinturonService {

    @Autowired
    private DylanCinturonRepository dylanCinturonRepository;

    //create
    public DylanCinturon save(DylanCinturon entity)
    {
        return dylanCinturonRepository.save(entity);
    }


    //findbyid
    public DylanCinturon findById(Long id)
    {
        return dylanCinturonRepository.findById(id).orElse(null);
    }

    //delete

    public void deleteById( long id)
    {
        dylanCinturonRepository.deleteById(id);
        {
            dylanCinturonRepository.deleteById(id);
        }
    }

    public void deleteByColor( String color)
    {
        dylanCinturonRepository.deleteByColor(color);
        {
            dylanCinturonRepository.deleteByColor(color);
        }
    }

    //select all
    public List<DylanCinturon> findAll()
    {
        return dylanCinturonRepository.findAll();
    }
    
}
