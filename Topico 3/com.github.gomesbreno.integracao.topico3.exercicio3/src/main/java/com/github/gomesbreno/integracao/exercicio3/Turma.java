/*
 * Copyright (c) 2018.
 * Breno
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gomesbreno.integracao.exercicio3;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Definir os atributos do objeto Turma
 */
@XmlRootElement()  
@XmlType(propOrder = {"listOfEstudantes"})
public class Turma {

    public Turma() {
    }

    private ArrayList<Estudante> listOfEstudantes;

    public ArrayList<Estudante> getListOfEstudantes() {
        return listOfEstudantes;
    }

    @XmlElementWrapper(name = "listaDeEstudantes")
    @XmlElement(name = "estudante")
    public void setListOfEstudantes(ArrayList<Estudante> listOfEstudantes) {
        this.listOfEstudantes = listOfEstudantes;
    }
}