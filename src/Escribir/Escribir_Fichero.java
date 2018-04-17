package Escribir;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Javier
 */
public class Escribir_Fichero {

    public static void main(String[] args) {
        Escribiendo accede_write = new Escribiendo();
        accede_write.escribir();
    }
}

class Escribiendo {

    public void escribir() {

        String frase = "Esto es una prueba de escritura parte 4";

        try {
            // FileWriter escritura = new FileWriter("C:/Users/AlumMati/Desktop/ejemplo_nuevo.txt"); // Crea un fichero nuevo o sobreescribe el fichero
            FileWriter escritura = new FileWriter("C:/Users/AlumMati/Desktop/ejemplo_nuevo.txt", true); // Añade sobre un fichero existente
            BufferedWriter buffer = new BufferedWriter(escritura);
            escritura.write(frase);
            System.out.println("Done");
            escritura.close();
            
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }

    }
}
