
package vista;

import java.text.ParseException;
import modelo.Autobus;
import modelo.Tractor;

public class Main {

    public static void main(String[] args) throws ParseException {
        Autobus b1= new Autobus();
        System.out.println("Valor a pagar por su renta del autobus: "+b1.calcularP()
                +"\nlnprecio por kilometro: "+b1.getprecioKm()
                +"\nKilometros recorridos: "+b1.calcularKm());
        
        System.out.println("****************************************************************");
        
        Tractor t1= new Tractor();
        System.out.println("Valor a pagar por su renta del tractor: "+  t1.valorA_pagar()
        +"\nPrecio por Dia: "+t1.getPrecioDia()
        +"\nDias utilizados: "+t1.calcularDias());
    
}
}