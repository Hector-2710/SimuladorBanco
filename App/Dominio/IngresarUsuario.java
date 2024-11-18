package Dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IngresarUsuario {

    private static Scanner sc = new Scanner(System.in);
    private static List<Usuario> usuarios = new ArrayList<>();

    public static void ingresarUsuario() {

        usuarios = UsuarioData.cargarUsuarios();
        String clave = pedirClave();
        String correo = pedirCorreo();
        Usuario user = verificarUsuario(correo,clave,usuarios);
        System.out.println(user);

    }

    public static Usuario verificarUsuario(String correo,String clave, List <Usuario> users){

        for (Usuario user: users) {
            if (user.getCorreo().equals(correo) && user.getClave().equals(clave)){
                System.out.println("usuario encontrado");
                return user;
            }
        }
        System.out.println("Usuario no encontrado");
        return null;
    }

    public static String pedirClave() {
        System.out.println("Ingrese su clave");
        return sc.nextLine();
    }

    public static String pedirCorreo() {
        System.out.println("Ingrese su correo");
        return sc.nextLine();
    }

}

