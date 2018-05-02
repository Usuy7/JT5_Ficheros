package Practica_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
    static File fichero = new File("Clientes.ser");
    ArrayList<Cuenta> cuentas = new ArrayList<>();

    public CuentaSer() {
        Recuperar();
        crearRegistros();
        Sobreescribir();
    }

    public void Recuperar() {
        try {
            if (fichero.exists()) {
                // RECUPERAMOS el fichero del formato byte.
                System.out.println("Accediendo a fichero...\n");
                ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream(fichero));
                cuentas = (ArrayList<Cuenta>) recuperar.readObject();
                recuperar.close();

                for (Cuenta c : cuentas) {
                    System.out.println(c.toString());
                }
                
            } else {
                // Si NO EXISTE, CREAMOS el fichero
                System.out.println("Creamos fichero");
                FileWriter escritura = new FileWriter(fichero, true);
                BufferedWriter buffer = new BufferedWriter(escritura);
                buffer.close();
            }
        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");
        } catch (ClassNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra una clase con ese nombre de definición");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }
    }

    public void crearRegistros() {

        int cuenta;
        String name;
        double saldo;
        try {
            do {
                System.out.print("\nNúmero de cuenta: ");
                cuenta = Integer.parseInt(tc.readLine());

                if (cuenta != 0) {
                    System.out.print("Nombre: ");
                    name = tc.readLine();
                    System.out.print("Saldo: ");
                    saldo = Double.parseDouble(tc.readLine());
                    cuentas.add(new Cuenta(cuenta, name, saldo));
                }
            } while (cuenta != 0);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error");
        }
    }

    public void Sobreescribir() {      
        try {
            ObjectOutputStream serializar = new ObjectOutputStream(new FileOutputStream(fichero, false));
            serializar.writeObject(cuentas);
            serializar.close();
        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }
    }
}

class Cuenta implements Serializable{

    private int cuenta;
    private String name;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int cuenta, String name, double saldo) {
        this.cuenta = cuenta;
        this.name = name;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return getCuenta() + "\t" + getName() + "\t" + getSaldo();
    }

    /**
     * @return the cuenta
     */
    public int getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
