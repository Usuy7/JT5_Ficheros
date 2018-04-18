package Serializar;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Javi
 */

public class Serializando {
    
}

class Empleado {
    
    private String nombre;
    private double sueldo;
    private Date fechaContrato;
    
    public Empleado (String n, double s, int agno, int mes, int dia){
        nombre = n;
        sueldo = s;
        GregorianCalendar calendario = new GregorianCalendar (agno, mes-1, dia);
        fechaContrato = calendario.getTime();
    }
    
    public String toString(){
        return "Nombre = " + nombre + ", Sueldo = " + sueldo + ", Fecha de Contrato = " + fechaContrato;
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

class Administrador extends Empleado{
    
    private double incentivo;
    
    public Administrador(String n, double s, int agno, int mes, int dia) {
        super(n, s, agno, mes, dia);
        incentivo = 0;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Incentivo = " + incentivo;
    }
    
    @Override
    public double getSueldo(){
        double sueldoBase = super.getSueldo();
        return sueldoBase + incentivo;
    }
    
    public void setIncentivo(double b){
        incentivo = b;
    }
}