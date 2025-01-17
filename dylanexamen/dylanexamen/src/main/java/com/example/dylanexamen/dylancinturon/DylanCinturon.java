package com.example.dylanexamen.dylancinturon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DylanCinturon {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String color;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    
}
