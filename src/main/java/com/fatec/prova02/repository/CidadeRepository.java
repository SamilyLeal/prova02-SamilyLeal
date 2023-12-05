package com.fatec.prova02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.prova02.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {}
