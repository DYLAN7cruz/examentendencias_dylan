package com.example.dylanexamen.dylancinturon;

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
@RequestMapping("/dylancinturon")
public class DylanCinturonController {

    @Autowired
    private DylanCinturonService dylanCinturonService;

    //create
    @PostMapping("/")
    public DylanCinturon save(@RequestBody DylanCinturon entity)
    {
        return dylanCinturonService.save(entity);
    }

    //select by id
    @GetMapping("/{id}")
    public DylanCinturon findById(@PathVariable Long id)
    {
        return dylanCinturonService.findById(id);
    }

    //update
    @PutMapping("/")
    public DylanCinturon Update(@RequestBody DylanCinturon entity)
    {
        return dylanCinturonService.save(entity);
    }
    

    //Delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id)
    {
        dylanCinturonService.deleteById(id);
    }

    @DeleteMapping("/color/{color}")
    public void deleteByColor(@PathVariable String color)
    {
        dylanCinturonService.deleteByColor(color);
    }

    //select all
    @GetMapping("/")
    public List<DylanCinturon> findAll()
    {
        return dylanCinturonService.findAll();
    }
    
}
