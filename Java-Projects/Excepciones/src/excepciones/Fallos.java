package excepciones;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Fallos {

    public static void main(String[] args) {
        int[] arrayint = {1, 5, 7, 3, 2};
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Posicion " + i + "=" + arrayint[i]);
        }
        Image image = null;
        try {
            image = ImageIO.read(new File("Imagen"));
        } catch (IOException e) {
            System.out.println("Imagen no encontrada");
        }

        //para controlar los runtime excepcion no usar try/catch por que son respónsabilidad
        // del desarrollador
        if (image == null) {
            System.out.println("imagen null");
        } else {
            System.out.println("pintar imagen");
        }

        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad:"));
        System.out.println("Hola " + nombre + " Tienes " + edad + " anios. Fin programa");
    }


}