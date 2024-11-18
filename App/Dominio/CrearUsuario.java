package Dominio;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CrearUsuario {

    private static Scanner sc = new Scanner(System.in);
    private static List<Usuario> usuarios = new ArrayList<>();

    public static Usuario crearUsuario() {

        usuarios = UsuarioData.cargarUsuarios();
        String nombre = pedirNombre();
        String clave = pedirClave();
        String correo = pedirCorreo();
        Tarjeta tarjeta = crearTarjeta();

        Usuario usuario = new Usuario(tarjeta, correo, clave, nombre);
        usuarios.add(usuario);
        UsuarioData.guardarUsuarios(usuarios);
        return  usuario;
    }

    public static Tarjeta crearTarjeta() {
        int numero = (int)(Math.random() * 90000000) + 10000000;
        int pin = pedirPin();
        int saldo = 0;
        return new Tarjeta(numero, pin, saldo);
    }

    public static String pedirNombre() {
        System.out.println("Ingrese su nombre");
        return sc.nextLine();
    }

    public static String pedirClave() {
        System.out.println("Ingrese su clave");
        return sc.nextLine();
    }

    public static String pedirCorreo() {
        System.out.println("Ingrese su correo");
        return sc.nextLine();
    }

    public static int pedirPin() {
        System.out.println("Ingrese su pin");
        return sc.nextInt();
    }
}
