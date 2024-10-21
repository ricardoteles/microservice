package com.ricardo.mscartoes.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cartoes")
@Slf4j
public class CartaoController {

    @GetMapping
    public String status(){
        log.info("Obtendo o status do microservice de cartoes");
        return "ok";
    }
}
