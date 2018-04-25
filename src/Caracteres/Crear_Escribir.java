package Caracteres;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
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
            File f = new File("Fichero.txt"); // creamos un archivo
            FileWriter flS = new FileWriter(f, true);  // abrimos un flujo de datos al archivo
            // FileWriter escritura = new FileWriter("C:/Users/AlumMati/Desktop/ejemplo_nuevo.txt"); Crea un fichero nuevo o sobreescribe el fichero
            FileWriter escritura = new FileWriter("C:\\Users\\AlumMati\\Documents\\NetBeansProjects\\Tema5_Ficheros\\src\\Caracteres\\ejemplo.txt", true); // Si existe añade el contenido, si No = lo crea y escribe.
            BufferedWriter buffer = new BufferedWriter(escritura); // creamos un buffer donde guardamos la informacion
            buffer.newLine();
            buffer.write(frase);
            System.out.println("Done");
            buffer.close();
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

        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }
    }
}
