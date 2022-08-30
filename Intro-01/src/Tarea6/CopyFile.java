package Tarea6;

import java.io.*;

public class CopyFile {
    public static void Copy(String fileIn, String fileOut){
        try {

            FileInputStream fileOrigin = new FileInputStream(fileIn);
            PrintStream fileDestiny = new PrintStream(fileOut);

            try{

                byte[] datos = fileOrigin.readAllBytes();
                for (byte dato : datos){
                    fileDestiny.print((char)dato);
                }
                System.out.println("9. Datos de " + fileIn +" copiados a " +fileOut);
                fileOrigin.close();
                fileDestiny.close();

            }catch (IOException e){

                System.out.println("No se pudo modificar el archivo origen: "+ e.getMessage());

            }

        }catch(FileNotFoundException | SecurityException e){

            System.out.println("Archivo origen no encontrado: " + e.getLocalizedMessage());

        }


    }
}
