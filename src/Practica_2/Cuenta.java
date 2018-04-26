package Practica_2;

/**
 *
 * @author Javi
 */
public class Cuenta {
    
    private int cuenta;
    private String nombre;
    private String apellido;
    private double saldo;
    
    public Cuenta () {}
    
    public Cuenta (int num_cuenta, String nombre, String apellido, double saldo){
        this.cuenta = num_cuenta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
    }

    @Override
    public String toString (){
        return "Cuenta: " + cuenta + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nSaldo: " + saldo;
    }
    
    /**
     * @return the num_cuenta
     */
    public int getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the num_cuenta to set
     */
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}