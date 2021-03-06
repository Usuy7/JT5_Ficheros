package Serializar;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Javi
 */

public class Empleado implements Serializable{
    
    private final String nombre;
    private double sueldo;
    private final Date fechaContrato;
    
    public Empleado (String n, double s, int agno, int mes, int dia){
        nombre = n;
        sueldo = s;
        GregorianCalendar calendario = new GregorianCalendar (agno, mes-1, dia);
        fechaContrato = calendario.getTime();
    }
    
    @Override
    public String toString(){
        return "\nNombre = " + nombre + "\nSueldo = " + sueldo + "\nFecha de Contrato = " + fechaContrato;
    }
    
    public void subirSueldo (double porcentaje){
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public Date getFechaContrato(){
        return fechaContrato;
    }
}
