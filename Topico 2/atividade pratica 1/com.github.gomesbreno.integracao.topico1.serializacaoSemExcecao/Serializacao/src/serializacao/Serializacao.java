/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Breno
 */
public class Serializacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person breno = new Person();
        breno.name = "Breno";
        breno.age = "21";
        
        String fileName = "data.bin";
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
            os.writeObject(breno);//escrevendo
            os.close();
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
           e.printStackTrace();
        }
        System.out.println("Serializado e salvo no arquivo");
        
        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
            Person p = (Person) is.readObject();//lendo
            System.out.println("A pessoa que foi lida tem nome: "+p.name+" e idade:"+p.age);
            is.close();
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
           e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
        
            
        
        
    }
    
}
