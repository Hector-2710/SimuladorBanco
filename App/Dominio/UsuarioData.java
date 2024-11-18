package Dominio;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioData {

    private static final String RUTA_ARCHIVO = "App/Datos/usuarios.txt";

    public static List<Usuario> cargarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        File archivo = new File(RUTA_ARCHIVO);
        if (archivo.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] datos = linea.split(",");
                    if (datos.length == 6) {
                        String nombre = datos[0];
                        String clave = datos[1];
                        String correo = datos[2];
                        int numeroTarjeta = Integer.parseInt(datos[3]);
                        int pinTarjeta = Integer.parseInt(datos[4]);
                        int saldoTarjeta = Integer.parseInt(datos[5]);

                        Tarjeta tarjeta = new Tarjeta(numeroTarjeta, pinTarjeta, saldoTarjeta);
                        usuarios.add(new Usuario(tarjeta, correo, clave, nombre));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return usuarios;
    }

    public static void guardarUsuarios(List<Usuario> usuarios) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (Usuario usuario : usuarios) {
                bw.write(usuario.getNombre() + "," + usuario.getClave() + "," + usuario.getCorreo() + ","
                        + usuario.getTarjeta().getNumero() + "," + usuario.getTarjeta().getPin() + ","
                        + usuario.getTarjeta().getSaldo());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
