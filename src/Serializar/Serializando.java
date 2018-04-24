package Serializar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Javi
 */
public class Serializando {

    static Empleado[] personal = new Empleado[4];

    public static void main(String[] args) {

        Administrador jefe = new Administrador("Juan", 80000, 2005, 12, 15);
         Administrador jefe2 = new Administrador("Juan", 80000, 2005, 12, 15);
        jefe.setIncentivo(5000);
        jefe2.setIncentivo(1000000);
        personal[0] = jefe;
        personal[1] = new Empleado("Ana", 36400, 2017, 11, 26);
        personal[2] = new Empleado("Pepito", 42000, 2012, 9, 5);
        personal[3] = jefe2;
        serializar();
        recuperar();
    }

    public static void serializar() {
        try {
            ObjectOutputStream serializar_object = new ObjectOutputStream(new FileOutputStream("C:/Users/AlumMati/Desktop/Empleados.txt"));
            serializar_object.writeObject(personal);
            serializar_object.close();
        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }
    }

    public static void recuperar() {
        try {
            ObjectInputStream recuperar_object = new ObjectInputStream(new FileInputStream("C:/Users/AlumMati/Desktop/Empleados.txt"));
            Empleado datos_recuperados[] = (Empleado[]) recuperar_object.readObject();
            recuperar_object.close();

            for (Empleado e : datos_recuperados) {
                if (e != null) System.out.println(e);
            }

        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero");
        } catch (ClassNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra una clase con ese nombre de definición");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ");
        }
    }
}
