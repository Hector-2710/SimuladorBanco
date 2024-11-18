package Dominio;
import java.util.Scanner;

public class Login {

    private static Scanner sc = new Scanner(System.in);

    public static void realizarLogin(){
        tipoDeLogin();
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                CrearUsuario.crearUsuario();
                System.out.println("Usuario Creado con exito");
                break;
            case 2:
                IngresarUsuario.ingresarUsuario();
                System.out.println("Usuario ingresado con exito");
                break;
        }

    }

    public static void tipoDeLogin(){
        System.out.println("------BIENVENIDO------");
        System.out.println("1. Registrarse");
        System.out.println("2. Ingresar ");

    }
}
