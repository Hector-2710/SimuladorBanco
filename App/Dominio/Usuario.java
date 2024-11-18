package Dominio;

public class Usuario {
    private String nombre;
    private String clave;
    private String correo;
    private Tarjeta tarjeta;

    public Usuario(Tarjeta tarjeta, String correo, String clave, String nombre) {
        this.tarjeta = tarjeta;
        this.correo = correo;
        this.clave = clave;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public String getClave() {
        return clave;
    }


    public String getCorreo() {
        return correo;
    }



    public Tarjeta getTarjeta() {
        return tarjeta;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", clave='" + clave + '\'' +
                ", correo='" + correo + '\'' +
                ", tarjeta=" + tarjeta +
                '}';
    }
}
