package com.christian.primeraweb.service.impl;

import com.christian.primeraweb.entities.Persona;
import com.christian.primeraweb.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //notacion
public class PersonaServiceImpl implements PersonaService {

    @Autowired //inyyeccion de dependencia
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> obtenerTodas() {
        return personaRepository.findAll(); //retornamos una lista
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null); //retornamos un id y si no lo encuenta regresa un nulo
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona persona) {
        Persona personaBBDD = personaRepository.findById(id).orElse(null);

        if(personaBBDD != null){
            personaBBDD.setNombre(persona.getNombre());
            personaBBDD.setEdad(persona.getEdad());
            return personaRepository.save(personaBBDD);
        }
        return null;
    }

    @Override
    public void eliminarPersona(Long id) {
      personaRepository.deleteById(id);
    }

    @Override
    public long contarPersonas() {
        return personaRepository.count();
    }
}
