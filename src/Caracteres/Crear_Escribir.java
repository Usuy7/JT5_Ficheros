package Caracteres;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Javier
 */
public class Crear_Escribir {

    public static void main(String[] args) {
        Escribiendo accede_write = new Escribiendo();
        accede_write.escribir();
    }
}

class Escribiendo {

    public void escribir() {

        String frase = "Esto es una prueba de escritura parte 4";

        try {
            File f = new File("Fichero.txt");
            FileWriter flS = new FileWriter(f, true);
            // FileWriter escritura = new FileWriter("C:/Users/AlumMati/Desktop/ejemplo_nuevo.txt"); Crea un fichero nuevo o sobreescribe el fichero
            FileWriter escritura = new FileWriter("C:/Users/AlumMati/Desktop/ejemplo_nuevo5.txt", true); // Si existe añade el contenido, si No = lo crea y escribe.
            BufferedWriter buffer = new BufferedWriter(escritura);
            escritura.write(frase);
            System.out.println("Done");
            escritura.close();
            
            /* Comprobar que un fichero existe y modificarlo
            
            File archivo = new File("C:/Users/AlumMati/Desktop/ejemplo5.txt");
            BufferedWriter bw;
            if (archivo.exists()) {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("El fichero de texto ya estaba creado.");
            } else {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("Acabo de crear el fichero de texto.");
            }
            */
            
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }

    }
}
