package Tarea5;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cochecito = new CocheCRUDimpl();
        cochecito.findAll();
        cochecito.delete();
        cochecito.save();

    }
}
