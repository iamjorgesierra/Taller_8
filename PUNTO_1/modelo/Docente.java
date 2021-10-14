
package modelo;


public class Docente implements ITrabajador {
    private int horasDictadas;
    private double pagoPorHora;

    public Docente() {
    }

    public Docente(int horasDictadas) {
        this.horasDictadas = horasDictadas;
        this.pagoPorHora = 120;
    }

    
    public int getHorasDictadas() {
        return horasDictadas;
    }

    
    public void setHorasDictadas(int horasDictadas) {
        this.horasDictadas = horasDictadas;
    }

    
    public double getPagoPorHora() {
        return pagoPorHora;
    }

    
    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double obtenerSueldo() {
       return this.horasDictadas * this.pagoPorHora; 
    }

    @Override
    public double obtenerBonificacion() {
       return this.obtenerSueldo() * 0.7;
    }
    
    
    
}
