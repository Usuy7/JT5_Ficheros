package Practica_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Javier
 */
public class Leer_Agenda {
    public static void main(String[] args) {
        new Leer_Agenda();
    }
    public Leer_Agenda(){
        try {
            FileReader entrada = new FileReader("C:\\Users\\AlumMati\\Documents\\NetBeansProjects\\Tema5_Ficheros\\src\\Practica_1\\Agenda.txt");
            BufferedReader buffer = new BufferedReader(entrada);
            
            System.out.println("\tNombre \tTelefono");
            System.out.println("\t===================");
            
            String linea = buffer.readLine();
            
            while (linea != null){
                StringTokenizer st = new StringTokenizer(linea,",");
                String nombre = st.nextToken();
                String telefono = st.nextToken();
                System.out.println(nombre + "\t" + telefono);
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
