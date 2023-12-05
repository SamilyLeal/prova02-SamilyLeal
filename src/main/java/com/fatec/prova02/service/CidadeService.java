package com.fatec.prova02.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.prova02.model.Cidade;
import com.fatec.prova02.repository.CidadeRepository;

@Service
public class CidadeService {
    
    @Autowired
    private CidadeRepository repository;

    public List<Cidade> getCidades(){
        return repository.findAll();
    }

    public Optional<Cidade> getCidadeById(int id){
        return repository.findById(id);
    }

    public Cidade saveCidade(Cidade cidade){
        return repository.save(cidade);
    }

}
