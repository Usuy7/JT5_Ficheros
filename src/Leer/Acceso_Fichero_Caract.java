package Leer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Javier
 */
public class Acceso_Fichero_Caract {

    public static void main(String[] args) {
        Leer_Fichero acceder = new Leer_Fichero();
        acceder.leer();
    }
}

class Leer_Fichero {

    public void leer() {

        try {
            FileReader entrada = new FileReader("C:/Users/AlumMati/Desktop/ejemplo.txt");
            BufferedReader buffer = new BufferedReader(entrada);
            
            String linea ="";
            do {
                linea = buffer.readLine();
                if (linea != null)  System.out.println(linea);
            } while (linea != null);

            entrada.close();

        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }
    }
}
