package com.aluracursos.challengeforohubaluraspring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class PostController {

    @GetMapping
    public String helloWorld(){
        return "Hello world from Buenaventura, Cunduacan";
    }

//    @PostMapping
//    public void
}