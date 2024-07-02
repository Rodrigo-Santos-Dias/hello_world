package com.genaration.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bsm")
public class BsmController {
    @GetMapping
    public List bsm() {
        List<String> bsms = new ArrayList<>();

        bsms.add("Pesistência");
        bsms.add("Orientação ao Futuro");
        bsms.add("Orientaçao ao detalhe");
        bsms.add("Comunicaçao");
        bsms.add("Proatividade");
        return bsms;
    }
}
