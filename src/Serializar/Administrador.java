package Serializar;

/**
 *
 * @author Javi
 */

public class Administrador extends Empleado{
    
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
