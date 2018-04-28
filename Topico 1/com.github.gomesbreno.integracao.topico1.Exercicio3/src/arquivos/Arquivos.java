/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Breno
 */
public class Arquivos {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.UnsupportedEncodingException
     */
    public static void main(String[] args) throws FileNotFoundException,
            UnsupportedEncodingException {
        System.out.println("Digite o nome do arquivo que deseja ler, com sua exteção. Exemplo: arquivo.txt");
        Scanner leitor = new Scanner(System.in);
        String arquivo = leitor.nextLine();

        try {
            //FileReader fr = new FileReader(arquivo);
            //BufferedReader br = new BufferedReader(fr);
            FileInputStream fis = new FileInputStream(arquivo);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

            br.close();

        } catch (IOException ex) {
            System.out.println(ex);
            System.out.println("Não foi possível ler ou encontrar o arquivo especificado!");
        }
    }

}
