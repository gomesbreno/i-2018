/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacao;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Breno
 */
public class Serializacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {

        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o usuário do github do qual deseja obter informações");
        String gitUser = reader.nextLine();

        String url = "https://api.github.com/users/" + gitUser;
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        if (responseCode == 200) {
            System.out.println("Response Code: " + responseCode);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println(response.toString());

            //JSONObject myResponde =  new JSONObject(response.toString());
            Gson gson = new Gson();
            Person user = gson.fromJson(response.toString(), Person.class);

            String fileName = "data.bin";
            try {
                ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
                os.writeObject(user);//escrevendo
                os.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Serializado e salvo no arquivo");

            try {
                ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
                Person p = (Person) is.readObject();//lendo
                System.out.println("A pessoa que foi lida tem nome: " + p.name + " e o link para a sua foto no github é:" + p.avatar_url);
                is.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Ocorreu algum problema de conexão");
        }

    }

}
