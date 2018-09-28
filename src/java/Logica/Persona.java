
package Logica;

public class Persona {

    protected int resistencia;
    protected String genero;
    protected int peso;
    protected double estatura;
    protected double imc;
    protected String estado;
    
    public void setResistencia(){};
    public void setGenero(){};
    
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    public void setImc(){
        
        imc=(peso/Math.pow(estatura, 2));
        
    } 
    
    public double getImc() {
        return imc;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public int getResistencia() {
        return resistencia;
    }
}
