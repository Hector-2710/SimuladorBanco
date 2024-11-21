package Dominio;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CrearUsuario {

    private static Scanner sc = new Scanner(System.in);
    private static List<Usuario> usuarios = new ArrayList<>();

    public static Usuario crearUsuario(String nombre, String clave, String correo,Tarjeta tarjeta) {

        usuarios = UsuarioData.cargarUsuarios();
        Usuario usuario = new Usuario(tarjeta, correo, clave, nombre);
        usuarios.add(usuario);
        UsuarioData.guardarUsuarios(usuarios);
        System.out.println("usuario creado con exitoo");
        return  usuario;
    }

    public static Tarjeta crearTarjeta(int pin) {
        int numero = (int)(Math.random() * 90000000) + 10000000;
        int saldo = 0;
        return new Tarjeta(numero, pin, saldo);
    }

}
