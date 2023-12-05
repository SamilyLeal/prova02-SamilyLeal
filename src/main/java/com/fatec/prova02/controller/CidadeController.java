package com.fatec.prova02.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fatec.prova02.model.Cidade;
import com.fatec.prova02.service.CidadeService;

@RestController
@RequestMapping("cidades")
public class CidadeController {
    
    @Autowired
    private CidadeService service;

    @GetMapping()
    public ResponseEntity<List<Cidade>> getCidades(){
        return ResponseEntity.ok(service.getCidades());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cidade> getCidadeById(@PathVariable int id){
        return ResponseEntity.ok(service.getCidadeById(id));
    }

    @PostMapping()
    public ResponseEntity<Cidade> saveCidade(@RequestBody @Validated Cidade cidade){
        URI location = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(cidade.getId())
            .toUri();

        return ResponseEntity.created(location).body(service.saveCidade(cidade));
    }
}
