package com.christian.primeraweb.controller;


import com.christian.primeraweb.entities.Persona;
import com.christian.primeraweb.service.impl.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller //esterotipo
@RequestMapping("/personas")
public class PersonaController {

    @Autowired  //inyeccion de dependencias
    private PersonaService personaService;

    @GetMapping //que indica que es un listado en metodos http
    //la clase model se utiliza para tranferir objetos del controller a la vista
    public  String listarPersonas(Model model){
        List<Persona> persona = personaService.obtenerTodas();
        model.addAttribute("ListaPersonas",persona); //key-valor
        return "listar";
    }

    @GetMapping("/nueva")
    //metodo para agregar una persona en un formulario
    public String agregarPersona(Model model){
        model.addAttribute("persona",new Persona());
        model.addAttribute("action","/personas/nueva");
        return "nuevaPersona";
    }

    @PostMapping("/nueva") //indica que va a guardar a la bd
    public String guardarNuevaPersona(@ModelAttribute Persona persona){
        personaService.crearPersona(persona);
        return "redirect:/personas";
    }

    @GetMapping("/editar/{id}")  //editar persona
    public String mostrarFormularioEditarPersona(@PathVariable Long id,@ModelAttribute Persona persona,Model model){
        model.addAttribute("persona",persona);
        model.addAttribute("action","/personas/editar/"+id);
        return "nuevaPersona";
    }

    @PostMapping("/editar/{id}")
    public String actualizarPersona(@PathVariable Long id,@ModelAttribute Persona persona){
        personaService.actualizarPersona(id,persona);
        return "redirect:/personas";
    }

    @GetMapping("eliminar/{id}")
    public String EliminarPersona(@PathVariable Long id){
        personaService.eliminarPersona(id);
        return "redirect:/personas";

    }
}
