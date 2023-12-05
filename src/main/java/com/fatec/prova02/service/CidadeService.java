package com.fatec.prova02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.prova02.model.Cidade;
import com.fatec.prova02.repository.CidadeRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CidadeService {
    
    @Autowired
    private CidadeRepository repository;

    public List<Cidade> getCidades(){
        return repository.findAll();
    }

    public Cidade getCidadeById(int id){
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Cidade não cadastrada!"));
    }

    public Cidade saveCidade(Cidade cidade){
        return repository.save(cidade);
    }

}
