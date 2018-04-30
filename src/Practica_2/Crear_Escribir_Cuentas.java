package Practica_2;

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
public class Crear_Escribir_Cuentas {

    public static void main(String[] args) {
        new Crear_Escribir_Cuentas();
    }

    BufferedReader tc = new BufferedReader(new InputStreamReader(System.in));
    int num_cuenta;
    String nombre, apellido;
    double saldo;

    public Crear_Escribir_Cuentas() {
        try {
            File f = new File("C:\\Users\\Javier\\Documents\\NetBeansProjects\\Tema5_Ficheros\\src\\Practica_2\\Cuentas.txt");
            FileWriter escritura = new FileWriter(f, true);
            BufferedWriter buffer = new BufferedWriter(escritura);
            do {
                System.out.print("\nNúmero de cuenta: ");
                num_cuenta = Integer.parseInt(tc.readLine());
                if (num_cuenta > 0){
                    System.out.print("Nombre: ");
                    nombre = tc.readLine();
                    System.out.print("Apellido: ");
                    apellido = tc.readLine();
                    System.out.print("Saldo: ");
                    saldo = Double.parseDouble(tc.readLine());
                    buffer.write(num_cuenta + " " + nombre + " " + apellido + " " + saldo);
                    buffer.newLine();
                }
            } while (num_cuenta > 0);

            buffer.close();

        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }
    }
}
