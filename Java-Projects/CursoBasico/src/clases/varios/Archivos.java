package clases.varios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {

    public static void main(String[] args) {
        File archivo = new File("C:/Carlos/Programacion/Estudio/Java/Java-Projects/CursoBasico/src/resources/pruebamkdir");
        archivo.mkdir();
        archivo = new File("C:/Carlos/Programacion/Estudio/Java/Java-Projects/CursoBasico/src/resources/pruebamkdir/prueba.txt");
        try {
            archivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String mensaje = "Mensaje que quiero escribir en Archivos.java";

        try {
            FileWriter escritura = new FileWriter(archivo.getAbsolutePath());
            escritura.write(mensaje.toCharArray());
            escritura.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
