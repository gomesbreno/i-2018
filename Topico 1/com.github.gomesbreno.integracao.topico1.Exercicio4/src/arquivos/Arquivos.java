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
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
        Scanner leitor = new Scanner(System.in);

        try {                        
            System.out.println("Digite o nome do arquivo que desseja entrar dados. Exemplo: arquivo.txt");
            String arquivo = leitor.nextLine();
            System.out.println("Digite o texto que deseja:");
            String texto = leitor.nextLine();

            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);            
            bw.newLine();
            bw.write(texto);
            bw.close();
            fw.close();           

        } catch (IOException ex) {
            System.out.println("Não foi possível encontrar o arquivo");
        }      
    }

}
