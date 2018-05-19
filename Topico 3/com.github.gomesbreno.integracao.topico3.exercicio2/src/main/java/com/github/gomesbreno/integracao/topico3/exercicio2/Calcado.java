/*
 * Copyright (c) 2018.
 * Breno
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gomesbreno.integracao.topico3.exercicio2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Arrays;

/**
 * Desserializa, a partir de arquivo .XML, objetos do tipo Sapato e Tenis
 */
@JacksonXmlRootElement(localName = "calcados")
public class Calcado {
    @JacksonXmlElementWrapper(localName = "tenis", useWrapping = false)
    private Tenis[] tenis;

    @JacksonXmlElementWrapper(localName = "sapato", useWrapping = false)
    private Sapato[] sapato;

    public Calcado() {
    }

    public Calcado(Tenis[] tenis, Sapato[] sapato) {
        this.tenis = tenis;
        this.sapato = sapato;
    }

    public Tenis[] getTenis() {
        return tenis;
    }

    public void setTenis(Tenis[] tenis) {
        this.tenis = tenis;
    }

    public Sapato[] getSapato() {
        return sapato;
    }

    public void setSapato(Sapato[] sapato) {
        this.sapato = sapato;
    }

    /**
     * Método responsável por definir a formatação dos objetos Tenis e Sapato
     *
     * @return String - Propriedades formatadas de Sapato
     */
    @Override
    public String toString() {
        return "Calçados:\nTenis --> " + Arrays.toString(tenis) +
                "\nSapato --> " + Arrays.toString(sapato) +
                "}";
    }
}