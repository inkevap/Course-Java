package Tarea4;

public class SmartWatch extends SmartDevice{

    public String colorBrazalete;
    Boolean waterProof;
    SmartWatch(){}
    SmartWatch(String modelo, String marca, Boolean isAndroid, int ram, String screenSize,
               String colorBrazalete, Boolean waterProof){
        super(modelo,marca,isAndroid,ram,screenSize);
        this.colorBrazalete = colorBrazalete;
        this.waterProof = waterProof;
    }



}
