package com.christian.primeraweb;

import com.christian.primeraweb.entities.Persona;
import com.christian.primeraweb.repository.PersonaRepository;
import com.christian.primeraweb.service.impl.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication



public class PrimeraWebSpringbootApplication{

    @Autowired //inyeccion de dependencia
    private PersonaService personaService;

	public static void main(String[] args) {
		SpringApplication.run(PrimeraWebSpringbootApplication.class, args);

	}
/*
	@Override
	public void run(String... args) throws Exception {
	personaService.crearPersona(new Persona(5L,"Salome",15));
	personaService.crearPersona(new Persona(6L,"Juan",2));
	personaService.crearPersona(new Persona(7L,"Mario",33));
	personaService.crearPersona(new Persona(8L,"Maria",25));

	//mostramos el numero de persona
	System.out.println("Numero de personas de la tabla: "+ personaService.contarPersonas());

	//mostramos la lista de personas
	List<Persona> personas = personaService.obtenerTodas();
	personas.forEach(p -> System.out.println("Nombre de la persona " + p.getNombre()));
	}
	*/

}
