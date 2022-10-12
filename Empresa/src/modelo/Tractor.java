
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Tractor extends Vehiculo {
    private double precioDia;
    private String fechaDeIda;
    private String fechaDeVuelta;

    public Tractor() {
        this.precioDia = 70000;
        this.fechaDeIda = "20/11/2022";
        this.fechaDeVuelta = "25/11/2022";
    }

    public Tractor(double precioDia, String fechaDeIda, String fechaDeVuelta, String matricula, boolean estado) {
        super(matricula, estado);
        this.precioDia = precioDia;
        this.fechaDeIda = fechaDeIda;
        this.fechaDeVuelta = fechaDeVuelta;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public String getFechaDeIda() {
        return fechaDeIda;
    }

    public String getFechaDeVuelta() {
        return fechaDeVuelta;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public void setFechaDeIda(String fechaDeIda) {
        this.fechaDeIda = fechaDeIda;
    }

    public void setFechaDeVuelta(String fechaDeVuelta) {
        this.fechaDeVuelta = fechaDeVuelta;
    }

   

   public double calcularDias() throws ParseException{
      SimpleDateFormat fecha = new SimpleDateFormat("dd/mm/yyyy"); 
       Date fechaDeIda = fecha.parse(this.fechaDeIda);
       Date fechaDeVuelta = fecha.parse(this.fechaDeVuelta);
       
       long calc = fechaDeVuelta.getTime()-fechaDeIda.getTime();
       TimeUnit unidad = TimeUnit.DAYS;
       double dias = unidad.convert(calc, TimeUnit.MILLISECONDS);
        
       return dias;
       
   }
   
   public double valorA_pagar() throws ParseException{
       double pagar=calcularDias()*this.precioDia;
       return pagar;
       
   } 

    
    
    
    
}
