package com.fatec.prova02.model;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "CIDADE_TB")
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotBlank(message = "Campo nome não preenchido!")
    String nome;

    @NotBlank(message = "Campo estado não preenchido!")
    String estado;

    @Range(min = 1)
    int habitantes;

    @Range(min = 1)
    int anos;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getHabitantes() {
        return habitantes;
    }
    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
    public int getAnos() {
        return anos;
    }
    public void setAnos(int anos) {
        this.anos = anos;
    }

    
}
