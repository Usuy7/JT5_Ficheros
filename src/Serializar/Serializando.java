package Serializar;

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
            
            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:/Users/Desktop/Empleados.txt"));
            
        } catch (IOException e) {
            System.out.println("Error en el acceso");
        }
    }
}