package Dominio;

public class Tarjeta {
    private int numero;
    private int pin;
    private int saldo;

    public Tarjeta(int numero, int pin, int saldo) {
        this.numero = numero;
        this.pin = pin;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }



    public int getPin() {
        return pin;
    }



    public int getSaldo() {
        return saldo;
    }


    @Override
    public String toString() {
        return "Tarjeta{" +
                "numero=" + numero +
                ", pin=" + pin +
                ", saldo=" + saldo +
                '}';
    }
}


