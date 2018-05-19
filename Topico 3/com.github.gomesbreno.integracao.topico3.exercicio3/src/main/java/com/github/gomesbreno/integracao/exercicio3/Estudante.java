/*
 * Copyright (c) 2018.
 * Breno
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gomesbreno.integracao.exercicio3;

/**
 * Definir os atributos do objeto Endereco
 */
public class Estudante {

    public Estudante() {
    }

    private String nome;
    private Endereco endereco;

    public Estudante(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}