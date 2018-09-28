
package Logica;

public class RutinaPesoNormal extends Rutina{
    
    @Override
    public void setLunes(){
    
        this.ejercicio="Abdominales por 4 seciones";
        this.dieta="2400 kcal";
        this.actividades="ejercicio: "+Double.toString(intensidad)+" "+ejercicio+"\n"+"dieta de: "+dieta;
        
    }
    
    @Override
    public void setMartes(){
    
        this.ejercicio="Flexiones de pecho por 2 seciones";
        this.dieta="2650 kcal";
        this.actividades="ejercicio: "+Double.toString(intensidad/2)+" "+ejercicio+"\n"+"dieta de: "+dieta;
        
    }
    
    @Override
    public void setMiercoles(){
    
        this.ejercicio="Sentadillas por 5 seciones";
        this.dieta="2500 kcal";
        this.actividades="ejercicio: "+Double.toString(intensidad/4)+" "+ejercicio+"\n"+"dieta de: "+dieta;
        
    }
    
    @Override
    public void setJueves(){
    
        this.ejercicio="Cardio 10 kilometros";
        this.dieta="2700 kcal";
        this.actividades="ejercicio: "+ejercicio+"\n"+"dieta de: "+dieta;
        
    }
    
    @Override
    public void setViernes(){
    
        this.ejercicio="Bicibleta fija 3 millas";
        this.dieta="2400 kcal";
        this.actividades="ejercicio: "+" "+ejercicio+"\n"+"dieta de: "+dieta;
        
    }
    
}
