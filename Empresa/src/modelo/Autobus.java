
package modelo;

public class Autobus extends  Vehiculo{
    private double precioKm;
    private double KmDeIda;
    private double KmDeVuelta;

    public Autobus() {
        this.precioKm=5000;
        this.KmDeIda=500;
        this.KmDeVuelta=550;
    }
    
    

    public Autobus(double precioKm, double KmDeIda, double KmDeVuelta) {
        this.precioKm = precioKm;
        this.KmDeIda = KmDeIda;
        this.KmDeVuelta = KmDeVuelta;
    }

    public void setprecioKm(double precioKm) {
        this.precioKm = precioKm;
    }

    public void setKmDeIda(double KmDeIda) {
        this.KmDeIda = KmDeIda;
    }

    public void setKmDeVuelta(double KmDeVuelta) {
        this.KmDeVuelta = KmDeVuelta;
    }

    public double getprecioKm() {
        return precioKm;
    }

    public double getKmDeIda() {
        return KmDeIda;
    }

    public double getKmDeVuelta() {
        return KmDeVuelta;
    }
    
    public double calcularKm(){
        double Kilometros=this.KmDeVuelta-this.KmDeIda;
        return Kilometros;
        
        
    }
    public double calcularP(){
        double precio=calcularKm()*precioKm;
        return precio;
    }
    
    
}
