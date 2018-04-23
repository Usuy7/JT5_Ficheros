package Bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Javier
 */
public class Leer_Escribir_Bytes {

    public static void main(String[] args) {

        int contador = 0;
        int bytes[] = new int[780832];

        try {
            FileInputStream lectura = new FileInputStream("C:/Users/Public/Pictures/Sample Pictures/Koala.jpg");
            boolean end = false;

            while (!end) {

                int bite = lectura.read();
                if (bite != -1) {
                    bytes[contador] = bite;
                } else {
                    end = true;
                }

                System.out.println(bytes[contador]);
                contador++;
            }

            lectura.close();

        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }

        crea_fichero(bytes);
    }

    static void crea_fichero(int datos_nuevo_fichero[]) {

        try {
            FileOutputStream fichero_nuevo = new FileOutputStream("C:/Users/Public/Pictures/Sample Pictures/Koala_copia.jpg");

            for (int i = 0; i < datos_nuevo_fichero.length; i++) {

                fichero_nuevo.write(datos_nuevo_fichero[i]);
            }

            fichero_nuevo.close();

        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }
    }
}
