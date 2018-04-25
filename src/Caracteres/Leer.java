package Caracteres;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Javier
 */
public class Leer {

    public static void main(String[] args) {
        Leer_Fichero acceder = new Leer_Fichero();
        acceder.leer();
    }
}

class Leer_Fichero {

    public void leer() {

        try {
            FileReader entrada = new FileReader("C:/Users/AlumMati/Desktop/ejemplo9.txt");
            BufferedReader buffer = new BufferedReader(entrada);
            
            String linea ="";
            do {
                linea = buffer.readLine();
                if (linea != null)  System.out.println(linea);
            } while (linea != null);

            entrada.close();

            /*
            LEER TOKENS
            String linea = br.readLine();
            StringTokenizer st = new StringTokenizer(linea,","); //separados por una coma
            nombre=st.nextToken(); //por ejemplo
            telefono=st.nextToken();
            //------//hago lo que tenga que hacer, p.ej. crear un objeto
            linea=br.readLine();
            */
            
        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }
    }
}
