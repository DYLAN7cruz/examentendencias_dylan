package com.example.dylanexamen.dylanestudiantes;

import java.sql.Date;

import com.example.dylanexamen.dylancinturon.DylanCinturon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class DylanEstudiantes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nombre;
    private Date fecha_inscripcion;
    private Integer edad;
    private Boolean estado;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFecha_inscripcion() {
        return fecha_inscripcion;
    }
    public void setFecha_inscripcion(Date fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


    @ManyToOne
    private DylanCinturon dylanCinturon;


    public DylanCinturon getDylanCinturon() {
        return dylanCinturon;
    }
    public void setDylanCinturon(DylanCinturon dylanCinturon) {
        this.dylanCinturon = dylanCinturon;
    }

    
    
}
