package Tarea4;

public abstract class SmartDevice {

    String modelo;
    String marca;
    Boolean isAndroid;
    int ram;
    String screenSize;

    SmartDevice(){}
    SmartDevice(String modelo, String marca, Boolean isAndroid, int ram, String screenSize){
        this.modelo = modelo;
        this.marca = marca;
        this.isAndroid = isAndroid;
        this.ram = ram;
        this.screenSize = screenSize;
    }
}
