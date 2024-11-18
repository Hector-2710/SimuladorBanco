package Dominio;
import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Login {

    private static Scanner sc = new Scanner(System.in);

    public static void realizarLogin(){
        tipoDeLogin();
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                Usuario user = CrearUsuario.crearUsuario();
                System.out.println("Usuario Creado con exito");
                Menu.menu(user);
                break;
            case 2:
                Usuario user1 = IngresarUsuario.ingresarUsuario();
                if (user1 == null){
                    break;
                }
                Menu.menu(user1);
                break;
        }

    }

    public static void tipoDeLogin(){
        System.out.println("------BIENVENIDO------");
        System.out.println("1. Registrarse");
        System.out.println("2. Ingresar ");

    }
}
