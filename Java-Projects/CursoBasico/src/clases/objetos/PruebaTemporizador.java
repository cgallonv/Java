package clases.objetos;

import javax.swing.JOptionPane;
import java.awt.event.*;
import java.util.Date;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador {

    public static void main(String[] args) {
        ActionListener listener = new DameLaHora();
        //Esto es lo mismo
        //PruebaTemporizador listener = new PruebaTemporizador();
        Timer timer = new Timer(3000, listener);
        timer.start();
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
        //detiene el programa
        System.exit(0);
    }


}

class DameLaHora implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Toma tu hora: " + new Date());

        //Emite un sonido
        Toolkit.getDefaultToolkit().beep();
    }
}
