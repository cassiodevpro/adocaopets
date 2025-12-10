package com.adocaopets.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pet {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)    
private Integer id;
@Column(name = "nome")
private String nome;
@Column(name = "especie")
private String especie;
@Column(name = "raca")
private String raca;
@Column(name = "idade")
private Integer idade;
@Column(name = "porte")
private String porte;
@Column(name = "descricao")
private String descricao;
@Column(name = "vacinas")
private String vacinas;
@Column(name = "disponivel")
private Boolean disponivel;
@Column(name = "data_entrada")
private LocalDate dataEntrada;
@Column(name = "data_adocao")
private LocalDate dataAdocao;



public Pet(){

}

    public Pet(LocalDate dataAdocao, LocalDate dataEntrada, String descricao, Boolean disponivel, String especie, Integer id, Integer idade, String nome, String porte, String raca, String vacinas) {
        this.dataAdocao = dataAdocao;
        this.dataEntrada = dataEntrada;
        this.descricao = descricao;
        this.disponivel = disponivel;
        this.especie = especie;
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.porte = porte;
        this.raca = raca;
        this.vacinas = vacinas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getVacinas() {
        return vacinas;
    }

    public void setVacinas(String vacinas) {
        this.vacinas = vacinas;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(LocalDate dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    

}

