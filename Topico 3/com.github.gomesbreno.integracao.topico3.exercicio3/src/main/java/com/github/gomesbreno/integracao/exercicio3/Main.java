/*
 * Copyright (c) 2018.
 * Breno
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gomesbreno.integracao.exercicio3;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/** 
 * Gerar um arquivo XML a partir dos objetos pré-definidos
 * ou gerar objetos a partir de um arquivo XML de entrada
 */
public class Main {

    /**
     * Invoca os metodos de serialização e desserialização
     *
     * @param args
     */
    public static void main(String[] args) {
        
        List<Estudante> estudanteList = new ArrayList<Estudante>();
        Estudante breno = new Estudante("Breno de Melo");
        estudanteList.add(breno);
        Estudante marco = new Estudante("Marco Aurélio");
        estudanteList.add(marco);

        
        Endereco endereco = new Endereco("89327-673", "rua madri 32", "s/n", "casa");
        breno.setEndereco(endereco);

        endereco = new Endereco("97351-412", "Rua madri 27", "s/n", "Casa");
        marco.setEndereco(endereco);
        
        Turma turma = new Turma();
        turma.setListOfEstudantes((ArrayList<Estudante>) estudanteList);

        Scanner leitor = new Scanner(System.in);
        System.out.print("1 - Serializa objeto\n2 - Desserializa objeto\nAlternativa: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:                
                serializaObjeto(turma);
                break;

            case 2:                
                desserializaObjeto();
                break;
        }
    }

    /**
     * Serializar o objeto passado como parametro
     *
     * @param turma
     */
    private static void serializaObjeto(Turma turma) {
        try {            
            JAXBContext jaxbContext = JAXBContext.newInstance(Turma.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
           
            Scanner leitor = new Scanner(System.in);
            System.out.print("Nome do arquivo a ser gerado: ");
            String arquivoSaída = leitor.next();
            File XMLfile = new File(arquivoSaída + ".xml");
            
            jaxbMarshaller.marshal(turma, XMLfile);

            System.out.println("Objeto serializado com sucesso!");

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     *Gerar objeto a partir de arquivo XML de entrada
     */
    private static void desserializaObjeto() {
        try {
            
            JAXBContext context = JAXBContext.newInstance(Turma.class);
            
            Unmarshaller un = context.createUnmarshaller();
            
            Scanner leitor = new Scanner(System.in);
            System.out.print("Nome do arquivo de entrada: ");
            String arquivoEntrada = leitor.next();
            Turma turma = (Turma) un.unmarshal(new FileReader(arquivoEntrada + ".xml"));

            System.out.println("Objeto desserializado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

