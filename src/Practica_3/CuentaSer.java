package Practica_3;

import Practica_2.Cuenta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public final class CuentaSer {

    public static void main(String[] args) {
        new CuentaSer();
    }

    BufferedReader tc = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Cuenta> cuentas = new ArrayList<>();

    public CuentaSer() {
        Recuperar_Leer();
        Sobreescribir();
    }

    public void Recuperar_Leer() {

        try {
            // RECUPERAMOS el fichero del formato byte.
            ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("C:\\Users\\Javier\\Documents\\NetBeansProjects\\Tema5_Ficheros\\src\\Practica_3\\Cuentas.txt"));
            cuentas = (ArrayList<Cuenta>) recuperar.readObject();
            recuperar.close();

            for (Cuenta c : cuentas) {
                if (c != null) {
                    System.out.println(c.toString());
                }  
            }

        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");  
        } catch (ClassNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra una clase con ese nombre de definición");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }
    }

    public void Sobreescribir() {
        try {
            ObjectOutputStream serializar = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Javier\\Documents\\NetBeansProjects\\Tema5_Ficheros\\src\\Practica_3\\Cuentas.txt"));
            serializar.writeObject(cuentas);
            serializar.close();
        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }
    }
}
