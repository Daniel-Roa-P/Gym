package Logica;


public class RutinaObesidad extends Rutina{
    
    @Override
    public void setLunes(){
    
        this.ejercicio="Saltos de cuerda 4 veces";
        this.dieta="2400 kcal";
        this.actividades="ejercicio: "+Double.toString(intensidad)+" "+ejercicio+"\n"+"dieta de: "+dieta;
        
    }
    
    @Override
    public void setMartes(){
    
        this.ejercicio="cardio por 16 kilometros";
        this.dieta="2550 kcal";
        this.actividades="ejercicio: "+ejercicio+"\n"+"dieta de: "+dieta;
        
    }
    
    @Override
    public void setMiercoles(){
    
        this.ejercicio="Bicicleta fija 7 millas";
        this.dieta="2430 kcal";
        this.actividades="ejercicio: "+ejercicio+"\n"+"dieta de: "+dieta;
        
    }
    
    @Override
    public void setJueves(){
    
        this.ejercicio="Cardio por 10 kilometros";
        this.dieta="2850 kcal";
        this.actividades="ejercicio: "+ejercicio+"\n"+"dieta de: "+dieta;
        
    }
    
    @Override
    public void setViernes(){
    
        this.ejercicio="abdominales por seciones de a 3";
        this.dieta="2510 kcal";
        this.actividades="ejercicio: "+Double.toString(intensidad)+" "+ejercicio+"\n"+"dieta de: "+dieta;
        
    
    }
}