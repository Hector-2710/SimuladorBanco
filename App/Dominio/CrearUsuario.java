package Dominio;
import java.util.Scanner;
import java.util.Random;
public class CrearUsuario {
    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();


    public static void crearUsuario(){
        String nombre = pedirNombre();
        String clave = pedirClave();
        String correo = pedirCorreo();
        Tarjeta tarjeta = crearTarjeta();
        Usuario usuario = new Usuario(tarjeta,correo,clave,nombre);

        System.out.println(usuario);

    }
    public static Tarjeta crearTarjeta( ){
        int numero = (int)(Math.random() * 90000000) + 10000000;
        int pin = pedirPin();
        int saldo = 0;

        Tarjeta tarjeta = new Tarjeta(saldo,pin,saldo);
        return tarjeta;
    }

    public static String pedirNombre(){
        System.out.println("ingrese su nombre");
        return sc.nextLine();

    }
    public static String pedirClave(){
        System.out.println("ingrese su clave");
        return sc.nextLine();
    }

    public static String pedirCorreo(){
        System.out.println("ingrese su correo");
        return sc.nextLine();
    }

    public static int pedirPin(){
        System.out.println("ingrese su pin");
        return sc.nextInt();
    }
}
