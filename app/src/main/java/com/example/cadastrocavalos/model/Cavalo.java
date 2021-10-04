package com.example.cadastrocavalos.model;

import java.util.Date;

public class Cavalo {

    private String nome;
    private String raca;
    private Date dataNascimento;
    private String genero;
    private boolean castrado;

    public Cavalo() {
    }

    public Cavalo(String nome, String raca, Date dataNascimento, String genero, boolean castrado) {
        this.nome = nome;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.castrado = castrado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
}
