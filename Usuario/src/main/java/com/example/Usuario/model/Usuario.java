package com.example.Usuario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String email;

    //constructor vacio obligatorio para jpa
    public Usuario(){}

    public Usuario(String nombre,String email){
        this.nombre = nombre;
        this.email = email;
    }

}
