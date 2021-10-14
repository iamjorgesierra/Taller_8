
package vista;

import modelo.*;


public class Test {
    public static void main(String[] args) {
        System.out.println("EMPLEADO");
        ITrabajador empleado = new Empleado("Coordinador");
        imprimirTrabajador(empleado);
        System.out.println("_______________________________________________");
        System.out.println("DOCENTE");
        ITrabajador docente = new Docente(40);
        imprimirTrabajador(docente);
    }
    
    public static void imprimirTrabajador(ITrabajador t){
        System.out.println("Sueldo: " + t.obtenerSueldo());
        System.out.println("Bonificacion: " + t.obtenerBonificacion());
    }
    
}
