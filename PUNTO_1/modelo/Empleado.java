
package modelo;


public class Empleado implements ITrabajador {
    private String cargo;

    public Empleado() {
    }

    public Empleado(String cargo) {
        this.cargo = cargo;
    }

    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    
    @Override
    public double obtenerSueldo() {
        double sueldo; 
        switch(cargo){
            case "Coordinador": sueldo = 5000; break;
            case "Asistente": sueldo = 4000; break;
            default: sueldo = 3000;
        }
        return sueldo;
    }

    @Override
    public double obtenerBonificacion() {
        return this.obtenerSueldo();
    }
    
    
    
    
}
