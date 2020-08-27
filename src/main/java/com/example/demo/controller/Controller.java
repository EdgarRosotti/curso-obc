package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

    @GetMapping("/cliente")
    public String getClientes(){
        return "Vai algum dia retornar do BD todos os clientes!";
    }


    @GetMapping("/cliente/{codigo}")
    public String getCliente(@PathVariable int codigo) {
        

        if(codigo > 0)
            return "Vai algum dia retornar um cliente " + codigo;
        else
            return "Código inválido v2" + codigo;
    }
}