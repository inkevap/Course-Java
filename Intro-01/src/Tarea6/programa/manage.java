package Tarea6.programa;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class manage {
    public static ArrayList<String> getUsername(HashMap<String,String> hash){
        ArrayList<String> arrayResult= new ArrayList<>(10);
        arrayResult.addAll(hash.keySet());
        return arrayResult;
    }
    public static ArrayList<String> getPass(HashMap<String,String> hash){
        ArrayList<String> arrayResult= new ArrayList<>(10);
        arrayResult.addAll(hash.values());
        return arrayResult;
    }

    public static void save(String usernameFile, String passFile,
                            ArrayList<String> usernames, ArrayList<String> passwords ){
        try{
            PrintStream saveUser = new PrintStream(usernameFile);
            try{
                for (String username : usernames) {
                    saveUser.println("User: " + username);
                }
                System.out.println("Usuarios guardados exitosamente en: " + usernameFile);
                saveUser.close();
            }catch (Exception e){
                System.out.println("Hubo un error guardando los usuarios: "+e.getLocalizedMessage());
            }

        }catch (FileNotFoundException e){
            System.out.println("Error creando o abriendo el archivo: " + e.getLocalizedMessage());
        }

        try{
            PrintStream savePass = new PrintStream(passFile);
            try{
                for (String pass : passwords) {
                    savePass.println("password: " + pass);
                }
                System.out.println("contraseña guardadas exitosamente en: " + passFile);
                savePass.close();
            }catch (Exception e){
                System.out.println("Hubo un error guardando las contraseñas: "+e.getLocalizedMessage());
            }

        }catch (FileNotFoundException e){
            System.out.println("Error creando o abriendo el archivo: " + e.getLocalizedMessage());
        }
    }

    public static void printDoc(String filePath){
        try{
            InputStream file = new FileInputStream(filePath);
            try{
                byte[] datos = file.readAllBytes();
                for (byte dato : datos){
                    System.out.print((char)dato);
                }
                file.close();
            }catch (IOException e){
                System.out.println("Error modificando el archivo: "+e.getLocalizedMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println("Error cargando archivo: "+ e.getLocalizedMessage());
        }
    }
}
