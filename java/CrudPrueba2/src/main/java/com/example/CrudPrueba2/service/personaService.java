/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CrudPrueba2.service;

import com.example.CrudPrueba2.entity.Persona;
import com.example.CrudPrueba2.repository.personaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jeffry Guerrero
 */
@Service    
public class personaService {
    /*LAS OPERACIONES NESESARIAS DEL CRUD*/
    @Autowired
    personaRepository PersonaRepository;
    public List<Persona>getPersona(){
        return PersonaRepository.findAll();
    } 
    public Optional<Persona>getPersona(Long id){
        return PersonaRepository.findById(id);
    }  
    
    public void saveOrUpdate(Persona persona){
        PersonaRepository.save(persona);
    }
    public void delete(Long id){
        PersonaRepository.deleteById(id);
    }
    
    
}
