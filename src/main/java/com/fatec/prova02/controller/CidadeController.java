package com.fatec.prova02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
