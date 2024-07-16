package com.aluracursos.challengeforohubaluraspring.controller;


import com.aluracursos.challengeforohubaluraspring.modelos.DatosRegistroTopico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class PostController {

    //solicitudes get
    @GetMapping
    public String helloWorld(){
        return "Hello world from ForoHub";
    }


    //solicitudes post
    @PostMapping
    public void registrarTopico(@RequestBody DatosRegistroTopico datosRegistroTopico){
        System.out.println("el request llega correctamente"+ datosRegistroTopico);

    }
}
