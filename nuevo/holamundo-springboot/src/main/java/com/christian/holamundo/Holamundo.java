package com.christian.holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class Holamundo {


    @GetMapping
    @ResponseBody
    public String mostrarMensaje3(){
        return "Hola Mundo es Spring Boot";
    }

    @GetMapping("/holamundo2")
    @ResponseBody
    public String mostrarMensaje2(){
        return "Hola Mundo es Spring Boot 2";
    }

    @GetMapping("/holamundo1")
    @ResponseBody
    public String mostrarMensaje1(){
        return "Hola Mundo es Spring Boot 1";
    }
}
