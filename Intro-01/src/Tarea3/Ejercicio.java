package Tarea3;

public class Ejercicio {
    public static void main(String[] args) {
    String[] nombres = {"Kevin","El pepe","El calvo","El levanta bachas"};
        String textoConcatenado = "";
        for(String texto : nombres ){
            if(texto.equals((nombres[0]))){
                textoConcatenado = texto;
            }else {
                textoConcatenado += ", " + texto;
            }
        }
        System.out.println(textoConcatenado);
    }



}
