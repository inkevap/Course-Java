package Tarea2;

public class Ejercicio {

    public static void main(String[] args) {
        System.out.println(iva(100));
        System.out.println(iva(775.25));
    }

    static double iva(int precio){
        return precio + precio*0.12f;
    }
    static double iva(double precio){
        return precio + precio*0.12f;
    }
}
