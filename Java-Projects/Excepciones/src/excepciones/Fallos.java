package excepciones;

import javax.swing.*;

public class Fallos {

    public static void main(String[] args) {
        int[] arrayint = {1,5,7,3,2};
        for (int i = 0; i < 5; i++) {
            System.out.println("Posicion " + i + "=" + arrayint[i]);
        }

        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
        System.out.println("Hola " + nombre + " Tienes " + edad + " años. Fin programa");
    }


}