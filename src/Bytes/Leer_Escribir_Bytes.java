package Bytes;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Javier
 */
public class Leer_Escribir_Bytes {
    
    public static void main(String[] args) {
        
        int contador = 0;
        int bytes [] = new int [1000000];
        
        try {
            FileInputStream lectura = new FileInputStream("C:/Users/Public/Pictures/Sample Pictures/Koala.jpg");
            boolean end = false;
            
            while (!end){
                
                int bite = lectura.read();   
                if (bite != -1) bytes[contador] = bite;
                else end = true;
                
                System.out.println(bytes[contador]);
                contador++;
            }
            lectura.close();
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }
    }
}
