package com.christian.RestApiv2.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Usuario1")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;
    String name;
    String apellido;
    String correo;

    public User(){
        super();
    }

    public User(Integer id, String name, String apellido, String correo) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        this.correo = correo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
