package Serializar;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Javi
 */

public class Serializando {
    
    public static void main(String[] args) {
        
        Administrador jefe = new Administrador ("Juan", 80000, 2005, 12, 15);
        jefe.setIncentivo(5000);
        
        Empleado[] personal = new Empleado[3];
        personal[0] = jefe;
        personal[1] = new Empleado("Ana", 36400, 2017, 11, 26);
        personal[2] = new Empleado("Pepito", 42000, 2012, 9, 5);
        
        try {
            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:/Users/AlumMati/Desktop/Empleados.txt"));
            escribiendo_fichero.writeObject(personal);
            escribiendo_fichero.close();
            
        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }
    }
}