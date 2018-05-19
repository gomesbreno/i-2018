/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulacaodexml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Breno
 */
public class ManipulacaoDeXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("aluno", Aluno.class);
        xstream.alias("alunos", List.class);

        try {
            System.out.println("Digite o nome do arquivo que CSV que deseja ler, sem a extensão .csv");
            Scanner leitor = new Scanner(System.in);
            String arquivo = leitor.nextLine();

            Alunos alunos = lerArquivoCSV(arquivo);

            ArrayList<Aluno> listadeAlunos = new ArrayList<Aluno>();//evitando a repetição da tag da propria classe  
            listadeAlunos = alunos.alunos;

            String xml = xstream.toXML(listadeAlunos);
            gerarArquivoXML(xml, arquivo);
            System.out.println("Novo arquivo xml gerado com sucesso!!!");

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível encontrar o arquivo");
        }

    }

    public static void gerarArquivoXML(String xml, String nomeDoArquivo) {
        PrintWriter print = null;
        try {
            File file = new File(nomeDoArquivo + ".xml");
            print = new PrintWriter(file);

            print.write(xml);
            print.flush();
            print.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado" + ex.getLocalizedMessage());
        } finally {
            print.close();
        }

    }

    public static Alunos lerArquivoCSV(String arquivo) throws IOException {

        String arquivoCSV = arquivo + ".csv";
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ",";
        Alunos alunos = new Alunos();
        try {
            br = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null) {

                String[] tupla = linha.split(csvDivisor);

                Aluno aluno = new Aluno();
                aluno.nome = tupla[0];
                aluno.email = tupla[1];
                alunos.alunos.add(aluno);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return alunos;
    }

}
