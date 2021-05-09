package clases.objetos;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class ClaseInternaTemporizador {

    public static void main(String[] args) {
        Reloj.enMarcha(2000, true);
        JOptionPane.showMessageDialog(null, "Press OK para Finalizar");
        System.exit(0);
    }
}


class Reloj {

    public static void enMarcha(int intervalo, final boolean sonido) {
        // Clase interna local dentro de un método, no puede tener modificadores de acceso
        class DameLaHora2 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.out.println("La hora es " + new Date());
                // las clases internas pueden acceder a variables privadas sin getter o setters
                if (sonido) {
                    Toolkit.getDefaultToolkit().beep();
                }

            }
        }
        ActionListener oyente = new DameLaHora2();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }

    // solo las clases internas pueden ser privadas
//    private class DameLaHora2 implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("La hora es " + new Date());
//            // las clases internas pueden acceder a variables privadas sin getter o setters
//            if (sonido) {
//                Toolkit.getDefaultToolkit().beep();
//            }
//
//        }
//    }
}