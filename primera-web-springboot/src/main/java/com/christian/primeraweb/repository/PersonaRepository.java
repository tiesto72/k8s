package com.christian.primeraweb.repository;

import com.christian.primeraweb.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  //estereotipos
public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
