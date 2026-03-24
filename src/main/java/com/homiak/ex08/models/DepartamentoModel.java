package com.homiak.ex08.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_departamento")
public class DepartamentoModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_dep")
    private String nome;

    @Column(name = "local_dep")
    private String localizacao;

    public Long getId() { return id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
}