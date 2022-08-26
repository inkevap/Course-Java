package Tarea4;

public class SmartPhone extends SmartDevice {

    int almacenamiento;
    double peso;
    String gama;

    SmartPhone(){}
    SmartPhone(String modelo, String marca, Boolean isAndroid, int ram, String screenSize,
               int almacenamiento, double peso, String gama){
        super(modelo,marca,isAndroid,ram,screenSize);
        this.almacenamiento = almacenamiento;
        this.peso = peso;
        this.gama = gama;
    }
}
