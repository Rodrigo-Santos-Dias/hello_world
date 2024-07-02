package com.genaration.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/objetivos")
public class ObjetivosSemanaController {
    @GetMapping
    public List objetivos() {
        List<String> objetivos = new ArrayList<>();

        objetivos.add("Spring-Boot");
        objetivos.add("Java");
        objetivos.add("Tasks PI");
        return objetivos;
    }
}
