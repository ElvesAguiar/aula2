package com.aula2.usuario.services;

import com.aula2.usuario.model.Usuario;
import com.aula2.usuario.repositories.FuncaoRepository;
import com.aula2.usuario.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private FuncaoRepository funcaoRepository;

    public List<Usuario> findAll(){
        return repository.findAll();
    }

    public Usuario create(Usuario usuario){
        Usuario entity = new Usuario();
        entity.setNome(usuario.getNome());
        entity.setEmail(usuario.getEmail());
        entity.setSenha(usuario.getSenha());
        repository.save(entity);

        return entity;

    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Usuario findById(Long id){
       return repository.findById(id).get();
    }


    public Usuario update(Usuario usuario,Long id){
        Usuario entity = repository.getReferenceById(id);
        entity.setNome(usuario.getNome());
        entity.setEmail(usuario.getEmail());
        entity.setSenha(usuario.getSenha());
        repository.save(entity);
        return entity;

    }
}
