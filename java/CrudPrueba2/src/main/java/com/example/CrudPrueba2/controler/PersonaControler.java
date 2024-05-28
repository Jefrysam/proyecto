/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CrudPrueba2.controler;
import com.example.CrudPrueba2.entity.Persona;
import com.example.CrudPrueba2.service.personaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author jeffry Guerrero
 */
@RestController
@RequestMapping(path = "api/v1/persona")  /*PATH / URL */
public class PersonaControler {
    
    @Autowired
    private final  personaService PersonaService;

    public PersonaControler() {
        this.PersonaService = null;   /*<-----CONSTRUCTOR*/
    }
    @GetMapping    
    public List<Persona>getAll(){
        return PersonaService.getPersona();  /*<-----SOLICITA LA INFORMACION*/
    }
    @PostMapping    
    public void saveUpdate(@RequestBody Persona persona){
        PersonaService.saveOrUpdate(persona);
    }
    @DeleteMapping("/{personaId}")    
    public void saveUpdate(@PathVariable("personaId") Long personaId){
        PersonaService.delete(personaId);
    }
    @GetMapping("/{personaId}")  
    public Optional<Persona> getById(@PathVariable("personaId") Long personaId){  /*<---BUSCA POR ID*/
        return PersonaService.getPersona(personaId);
    }
    
    
}
