package com.aula2.usuario.repositories;

import com.aula2.usuario.model.Funcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncaoRepository extends JpaRepository<Funcao,Long> {
}
