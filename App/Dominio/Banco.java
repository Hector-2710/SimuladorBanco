package Dominio;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Usuario> usuarios = new ArrayList<>();


    public static void depositar(){

    }
    public static void  transferir(){

    }
    public static void consultarsaldo(Usuario user){

    int saldo = user.getTarjeta().getSaldo();
    System.out.println("SU saldo es: " + saldo);

    }
    public static void retirar(){

    }


}
