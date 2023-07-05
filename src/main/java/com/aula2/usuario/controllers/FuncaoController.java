package com.aula2.usuario.controllers;

import com.aula2.usuario.model.Funcao;
import com.aula2.usuario.repositories.FuncaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/funcoes")
public class FuncaoController {

    @Autowired
    private FuncaoRepository repository;

    @GetMapping
    public List<Funcao> findAll(){
        return repository.findAll();
    }
}
