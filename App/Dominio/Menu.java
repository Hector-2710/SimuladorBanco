package Dominio;

import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner(System.in);

    public static void menu(Usuario user){
        menuText();
        int opcion  = sc.nextInt();

        switch (opcion){
            case 1:
                Banco.consultarsaldo(user);
                break;
        }
    }
    public static void menuText(){

        System.out.println("---WELCOME---");
        System.out.println("1. COnsultar saldo");
        System.out.println("");
        System.out.println("");
        System.out.println("ingrese opcion:");
    }
}
