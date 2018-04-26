/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_3;

import Practica_2.Cuenta;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;

/**
 *
 * @author Javier
 */
public class CuentaSer {

    public static void main(String argm[]) throws Exception {
        String texto;
        Cuenta lista[] = new Cuenta[10];
        int p = 0;
        try {
            FileReader flE = new FileReader("E:\\clientes.txt");
            BufferedReader fE = new BufferedReader(flE);

// leerRegistros(){
            Cuenta registro = new Cuenta();
            String campos[];
            System.out.printf("%-9s%-15s%-18s%10s\n", "Cuenta", "Nombre", "Apellido", "Saldo");

            texto = fE.readLine();
            while (texto != null) {
                campos = texto.split(" ");
                for (int i = 0; i < campos.length; i++) {
                    System.out.println(campos[i]);
                }
                //         System.out.printf("%-9s%-10s%-10s%10s\n",campos[0],campos[1],campos[2], campos[3]);     
                registro.setCuenta(Integer.parseInt(campos[0]));

                registro.setNombre(campos[1]);
                registro.setApellido(campos[2]);
                registro.setSaldo(Double.parseDouble(campos[3]));
                //     System.out.printf("%-9s%-15s%-18s%10.2f\n",registro.toString());
                System.out.println(registro);
                lista[p++] = registro;
                texto = fE.readLine();
            }
        } catch (FileNotFoundException f) {
            System.err.println("Error al abrir el archivo " + f.getMessage());
            System.exit(1);
        } catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado");

            System.exit(1);
        } catch (IllegalStateException illegalStateException) {
            System.err.println("Error al leer del archivo");
            System.exit(1);
        }
    }
    /* public void cerrarArchivo (){
     if (fE!=null)
     entrada.close();
     }*/
}
