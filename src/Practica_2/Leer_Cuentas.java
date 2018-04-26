package Practica_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Javier
 */
public class Leer_Cuentas {
    public static void main(String[] args) {
        new Leer_Cuentas();
    }
    
    BufferedReader tc = new BufferedReader(new InputStreamReader(System.in));
    ArrayList <Cuenta> cuentas = new ArrayList();
    
    public Leer_Cuentas() {
        try{
            FileReader entrada = new FileReader("C:\\Users\\Javier\\Documents\\NetBeansProjects\\Tema5_Ficheros\\src\\Practica_2\\Cuentas.txt");
            BufferedReader buffer = new BufferedReader(entrada);
            
            System.out.println("Cuenta \tNombre \tApellido  Saldo");
            System.out.println("===============================");
            
            String linea = buffer.readLine();
            
            while (linea != null){
                StringTokenizer token = new StringTokenizer(linea," ");
                int cuenta = Integer.parseInt(token.nextToken());
                String nombre = token.nextToken();
                String apellido = token.nextToken();
                double saldo = Double.parseDouble(token.nextToken());
                
                cuentas.add(new Cuenta(cuenta, nombre, apellido, saldo));
                linea = buffer.readLine();
            }
            
            for (Cuenta cuenta : cuentas) {
                System.out.println(cuentas.toString());
            }
            
            buffer.close();
            
        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }
    }
}
