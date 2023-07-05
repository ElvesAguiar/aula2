package com.aula2.usuario.controllers;

import com.aula2.usuario.model.Usuario;
import com.aula2.usuario.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> findAll(){
        return service.findAll();
    }

    @PostMapping
    public Usuario create (@RequestBody Usuario usuario){
        return service.create(usuario);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }


    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PutMapping(value = "/{id}")
    public Usuario update(@RequestBody Usuario usuario,@PathVariable Long id){
        return service.update(usuario,id);
    }

}
