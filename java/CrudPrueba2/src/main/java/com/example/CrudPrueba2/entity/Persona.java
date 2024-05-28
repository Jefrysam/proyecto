/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CrudPrueba2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author jeffry
 */
@Data
@Entity
@Table(name = "tbl_usuarios")

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long usuarioID;
    private String nombre;
    private String apellido;
    private int edad;
    
}
