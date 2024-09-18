package com.christian.primeraweb.service.impl;

import com.christian.primeraweb.entities.Persona;

import java.util.List;

public interface PersonaService {

    //se crea una lista y se le pone el nombre
    List<Persona> obtenerTodas();

    //creacion de un metodo
    Persona obtenerPorId(Long id);

    //creacion de metodo para crear o insertar una persona
    Persona crearPersona(Persona persona);

    //metodo para actualizar
    Persona actualizarPersona(Long id, Persona persona);

    //para eliminar una persona metodo
    void eliminarPersona(Long id);

    long contarPersonas();
}
