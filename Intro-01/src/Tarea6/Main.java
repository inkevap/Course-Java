package Tarea6;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import static Tarea6.Reverse.reverse;

public class Main {

    public static void main(String[] args) {
        // Ejercicio #1
        System.out.println("1. " + reverse("Hola Mundo"));

        //Ejercicio #2
        int[] numeros = new int[]{1,2,3,4,5,6};
        System.out.print("2. ");
        for(int numero : numeros){
            System.out.print(numero + " ");
        }
        System.out.println();
        // Ejercicio #3
        char[][] letras =new char[][]{
                {'a','b','c','d','e'},
                {'f','g','h','i','j'},
                {'k','l','m','n','o'},
                {'p','q','r','s','t'},
                {'u','v','w','x','y'}
        };
        System.out.print("3.");
        for(int i = 0; i < letras.length; i++){
            if (i>0) System.out.print("   "); else System.out.print(" ");
            for(int j = 0; j < letras[i].length; j++){
                System.out.print(letras[i][j] + " ");

            }
            System.out.println("|| Estoy en la fila " + i);
        }

        // Ejercicio #4
        Vector<Integer> vectorcillo = new Vector<>(6);
        vectorcillo.add(1);
        vectorcillo.add(2);
        vectorcillo.add(3);
        vectorcillo.add(4);
        vectorcillo.add(5);
        System.out.println("4. "+ vectorcillo);
        vectorcillo.remove(2);
        vectorcillo.remove(3);
        System.out.println("   "+ vectorcillo);

        /* Ejercicio #5
        *  El principal problema de utilizar el valor de la capacidad por defecto es que
        *  al sobrepasar la capacidad de este el vector tiene que copiar su informacion a otro
        *  vector, eliminando el anterior, y esto tiene un costo tanto en el procesamiento como
        *  en la capacidad de almacenamiento, si tuviesemos que agregar 1000 elementos, la
        *  capacidad del vector se tendria que recalcular provocando que el vector se tenga que
        *  copiar en uno de mayor capacidad hasta que pueda almacenar los elementos requeridos y
        *  eso tiene un alto impacto en el procesamiento y el almacenamiento.
        */

        // Ejercicio #6
        ArrayList<String> strings = new ArrayList<>();
        strings.add("la");
        strings.add("vida");
        strings.add("es");
        strings.add("bella");

        LinkedList<String> copy_strings = new LinkedList<>(strings);

        System.out.print("6. ");
        for (int i = 0; i < strings.size(); i++){
            if (i>0) System.out.print("   "); else System.out.print("");
            System.out.print("valor Arraylist " + (i+1) + " " + strings.get(i) + " - ");
            System.out.println("valor Linkedlist " + (i+1) + " " + copy_strings.get(i));
        }

        // Ejercicio #7
        System.out.print("7. ");
        ArrayList<Integer> ints = new ArrayList<>(11);
        for (int i = 1; i < 11; i++){
            ints.add(i);
            System.out.print(ints.get(i-1) + " ");
        }
        System.out.println();
        System.out.print("   ");

        for (int i = 0; i < ints.size();i++){
            if(ints.get(i) % 2 == 0) {
                ints.remove(i);
            }

            if( i == ints.size() ){
                for (Integer intsito : ints) {
                    System.out.print(intsito + " ");
                }
            }
        }
        System.out.println();
        // Ejercicio #8
        System.out.println("8. cuando el codigo falla :");
        try {
            Divide.DividePorCero(1,0);
        } catch (Exception e){
            System.out.println("   - Eso no se puede hacer");
        }finally {
            System.out.println("   - Demo de codigo");
        }

        System.out.println("   Cuando el codigo no falla:");
        try {
            Divide.DividePorCero(1,1);
        } catch (Exception e){
            System.out.println("   - Eso no se puede hacer");
        }finally {
            System.out.println("   - Demo de codigo");
        }

        //Ejercicio #9
        CopyFile.Copy("D:\\Entrada.txt","D:\\2.txt");



    }
}
