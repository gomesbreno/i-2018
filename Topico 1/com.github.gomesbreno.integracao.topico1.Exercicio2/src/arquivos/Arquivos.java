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
        System.out.println("Digite o nome de um arquivo mais sua extenção, contido no pacote deste projeto. Exemplo: exemplo1.jpeg");
        String arquivo = leitor.nextLine();

        try {            
            FileInputStream fis = new FileInputStream(arquivo);
            DataInputStream dis = new DataInputStream(fis);

            int valor = dis.readInt();            
            dis.close();
            String hex = Integer.toHexString(valor);            
            System.out.println(hex);

        } catch (IOException ex) {            
            System.out.println("Não foi possível encontrar ou ler o arquivo ");

        }
    }

}
