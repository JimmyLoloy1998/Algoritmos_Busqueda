package algoritmosBusqueda;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TransformacionHashing {

    public static void main(String[] args) {

        String mensaje = "123";
        byte[] bytesDelMensaje = mensaje.getBytes();

        MessageDigest resumenDelMensaje = null;
        try {
            resumenDelMensaje = MessageDigest.getInstance("SHA-1");
            byte[] bytesDelResumen = resumenDelMensaje.digest(bytesDelMensaje);

            BigInteger resumenNumero = new BigInteger(1, bytesDelResumen);
            String resumen = resumenNumero.toString(16);

            System.out.println("Mensaje " + mensaje);
            System.out.println("Hash SHA-1: " + resumen);
        } catch (NoSuchAlgorithmException e) {}
    }
}
