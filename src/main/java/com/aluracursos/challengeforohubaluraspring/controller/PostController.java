package com.aluracursos.challengeforohubaluraspring.controller;


import com.aluracursos.challengeforohubaluraspring.modelos.DatosRegistroTopico;
import com.aluracursos.challengeforohubaluraspring.modelos.DatosRespuestaTopico;
import com.aluracursos.challengeforohubaluraspring.modelos.Topico;
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
    public ResponseEntity<DatosRespuestaTopico> registrarTopico(@RequestBody DatosRegistroTopico datosRegistroTopico){
        System.out.println("el request llega correctamente"+ datosRegistroTopico);
        Topico topico = new Topico(datosRegistroTopico);
        DatosRespuestaTopico datosRespuestaTopico = new DatosRespuestaTopico(topico.getTitulo(),topico.getMensaje(), topico.getAutor());
        return ResponseEntity.ok().body(datosRespuestaTopico);
    }
}
