package com.christian.primeraweb.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//anotacion entiti para que pueda mapear los atributo a una tabla en la bd
@Entity
@Table(name ="tbl_personas")
@Data //getter - setter
@AllArgsConstructor //genera el constructor con todos los campos
@NoArgsConstructor //genera un constructor sin ningun campo
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nombre;
    private int edad;
}
