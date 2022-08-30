package Tarea6;

public class Reverse {

    public static String reverse(String texto) {
       char[] text = texto.toCharArray();
       char[] reversed = new char[texto.length()];
       for(int i = 0;i < texto.length(); i++) {
           reversed[texto.length() - 1 - i] = text[i];
       }
       return String.valueOf(reversed);
    }
}
