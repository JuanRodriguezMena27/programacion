
package modelo;

public class Vehiculo {
    private String matricula;
    private boolean estado;

    public Vehiculo() {
        this.matricula="EGV881";
        this.estado=false;
                
    }

    public Vehiculo(String matricula, boolean estado) {
        this.matricula = matricula;
        this.estado = estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    

    
}
