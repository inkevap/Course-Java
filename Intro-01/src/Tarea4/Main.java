package Tarea4;

public class Main {
    public static void main(String[] args) {
        SmartWatch G3 = new SmartWatch("G3 power","Samsung",true,
                256,"200x300","red",true);

        SmartPhone Galaxy_s2 = new SmartPhone("Galaxy S2","Samsung",true,
                4096,"200x800",128,12.5,"Media");

        System.out.println(G3.colorBrazalete);
        System.out.println(Galaxy_s2.peso);


    }
}
