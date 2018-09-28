
package Logica;


public class Hombre extends Persona {
    
    @Override
    public void setGenero(){
    
        this.genero="Hombre";
        
    }
    
    @Override
    public void setResistencia(){
        
        if(imc<=18.5){
            this.resistencia=60;
            this.estado=Double.toString(imc)+" ( "+genero+" con bajopeso)";
        } else if(imc>18.5 && imc<=25){
            this.resistencia=50;
            this.estado=Double.toString(imc)+" ( "+genero+" con peso normal)";
        } else if(imc>25 && imc<=30){
            this.resistencia=40;
            this.estado=Double.toString(imc)+" ( "+genero+" con sobrepeso)";
        } else if(imc>30){
            this.resistencia=30;
            this.estado=Double.toString(imc)+" ( "+genero+" con obesidad)";
        }
        
    }
}
