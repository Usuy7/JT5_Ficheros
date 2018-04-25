package Practica_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Javier
 */
public class Leer_Clientes {
    public static void main(String[] args) {
        new Leer_Clientes();
    }
    
    BufferedReader tc = new BufferedReader(new InputStreamReader(System.in));
    
    public Leer_Clientes() {
        try{
            FileReader entrada = new FileReader("C:\\Users\\Javier\\Documents\\NetBeansProjects\\Tema5_Ficheros\\src\\Practica_2\\Clientes.txt");
            BufferedReader buffer = new BufferedReader(entrada);
            
            System.out.println("Cuenta \tNombre \tApellido  Saldo");
            System.out.println("===============================");
            
            String linea = buffer.readLine();
            
            while (linea != null){
                 StringTokenizer token = new StringTokenizer(linea," ");
                int num_cuenta = Integer.parseInt(token.nextToken());
                String nombre = token.nextToken();
                String apellido = token.nextToken();
                double saldo = Double.parseDouble(token.nextToken());
                System.out.println(num_cuenta + "\t" + nombre + "\t" + apellido + "\t" + saldo);
                linea = buffer.readLine();
            }
            buffer.close();
            
        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }
    }
}
