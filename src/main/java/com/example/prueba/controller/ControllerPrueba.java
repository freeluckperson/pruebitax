package com.example.prueba.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Api")
public class ControllerPrueba {
    @GetMapping
    @ResponseBody
    public String getPrueba() {
        return "Esta es una prueba de apiRest en spring boot";
    }

    @GetMapping("/Segunda")
    public ResponseEntity<String> getPrueba2() {
        return ResponseEntity.ok("Esta es la segunda prueba de apiRest en spring boot");
    }
}
