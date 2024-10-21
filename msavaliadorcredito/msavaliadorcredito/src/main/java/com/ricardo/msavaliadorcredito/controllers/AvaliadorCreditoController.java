package com.ricardo.msavaliadorcredito.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes-credito")
@Slf4j
public class AvaliadorCreditoController {

    @GetMapping
    public String status(){
        log.info("Obtendo o status do microservice de avaliacoes de credito");
        return "ok";
    }
}
