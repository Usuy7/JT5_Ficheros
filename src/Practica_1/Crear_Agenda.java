package Practica_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Javier
 */
public class Crear_Agenda {

    public static void main(String[] args) {
        new Crear_Agenda();
    }

    BufferedReader tc = new BufferedReader(new InputStreamReader(System.in));
    String nombre, telefono;

    public Crear_Agenda() {
        try {
            File f = new File("C:\\Users\\AlumMati\\Desktop\\Agenda.txt");
            FileWriter escritura = new FileWriter(f, true);
            System.out.println(f.getAbsolutePath());
            System.out.println(f.canRead());
            BufferedWriter buffer = new BufferedWriter(escritura);
            do {
                System.out.print("Introduce el nombre: ");
                nombre = tc.readLine();
                if (nombre.length() > 0) {
                    System.out.print("Introduce el teléfono: ");
                    telefono = tc.readLine();
                    buffer.write(nombre + "," + telefono);
                    buffer.newLine();
                }
            } while (nombre.length() > 0);
            buffer.close();
        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }
    }
}
