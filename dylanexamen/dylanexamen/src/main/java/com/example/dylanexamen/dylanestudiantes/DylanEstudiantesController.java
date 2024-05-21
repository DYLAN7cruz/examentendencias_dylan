package com.example.dylanexamen.dylanestudiantes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dylanestudiantes")
public class DylanEstudiantesController {

    @Autowired
    private DylanEstudiantesService dylanEstudiantesService;

    //create
    @PostMapping("/")
    public DylanEstudiantes save(@RequestBody DylanEstudiantes entity)
    {
        return dylanEstudiantesService.save(entity);
    }

    //select by id
    @GetMapping("/{id}")
    public DylanEstudiantes findById(@PathVariable Long id)
    {
        return dylanEstudiantesService.findById(id);
    }

    //update
    @PutMapping("/")
    public DylanEstudiantes Update(@RequestBody DylanEstudiantes entity)
    {
        return dylanEstudiantesService.save(entity);
    }
    

    //Delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id)
    {
        dylanEstudiantesService.deleteById(id);
    }


    //Delete
    @DeleteMapping("/nombre/{nombre}")
    public void deleteByNombre(@PathVariable String nombre)
    {
        dylanEstudiantesService.deleteByNombre(nombre);
    }

    //select all
    @GetMapping("/")
    public List<DylanEstudiantes> findAll()
    {
        return dylanEstudiantesService.findAll();
    }
    
}
