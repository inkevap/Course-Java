package Tarea6.programa;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //creamos un hash con credenciales
    HashMap<String,String> users = new HashMap<>(10);
    users.put("Kevin","kev123");
    users.put("dedmaster","master12");
    users.put("admin","pass");
    users.put("deathpoison","1.618death");
    users.put("Supersu","Pass123");
        //usamos Arraylist para almacenar usuarios y contraseñas por separado
    ArrayList<String> pass_Users;
    ArrayList<String> username_Users;

    pass_Users = manage.getPass(users); //asignamos en el arraylist los usuarios
    username_Users = manage.getUsername(users); //asignamos en el arraylist las contraseñas de los usuarios

    // se guardan los datos en archivos separados
    manage.save(".\\src\\Tarea6\\programa\\users.txt",
            ".\\src\\Tarea6\\programa\\pass.txt",
            username_Users,pass_Users);
    // se imprimen los datos que han sido guardados en archivos separados
    manage.printDoc(".\\src\\Tarea6\\programa\\users.txt");
    manage.printDoc(".\\src\\Tarea6\\programa\\pass.txt");









    }
}
