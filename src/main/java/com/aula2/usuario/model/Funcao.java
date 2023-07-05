package com.aula2.usuario.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Funcao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String autoridade;

    @ManyToMany(mappedBy = "funcoes")
    private List<Usuario> usuarios;
    public Funcao(){

    }
    public Funcao(Long id, String autoridade) {
        this.id = id;
        this.autoridade = autoridade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutoridade() {
        return autoridade;
    }

    public void setAutoridade(String autoridade) {
        this.autoridade = autoridade;
    }
}
