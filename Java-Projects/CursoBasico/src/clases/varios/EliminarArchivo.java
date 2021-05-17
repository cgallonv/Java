package clases.varios;

import java.io.File;
import java.io.IOException;

public class EliminarArchivo {
    public static void main(String[] args) {
        try {
            File file = new File("C:/Carlos/Programacion/Estudio/Java/Java-Projects/CursoBasico/src/resources/pruebamkdir/prueba.txt");
            file.delete();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
