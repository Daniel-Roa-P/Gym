
package Logica;

public class RutinaSobrepeso extends Rutina {
    
    @Override
    public void setLunes(){
    
        this.ejercicio="Cardio por 12 kilometos";
        this.dieta="2100 kcal";
        this.actividades="ejercicio: "+ejercicio+"\ndieta de: "+dieta;
        
    }
    
    @Override
    public void setMartes(){
    
        this.ejercicio="Abdominales por 2 seciones";
        this.dieta="2200 kcal";
        this.actividades="ejercicio: "+Double.toString(intensidad)+" "+ejercicio+"\ndieta de: "+dieta;
        
    }
    
    @Override
    public void setMiercoles(){
    
        this.ejercicio="Saltos de cuerda por 3 seciones";
        this.dieta="2050 kcal";
        this.actividades="ejercicio: "+Double.toString(intensidad)+" "+ejercicio+"\ndieta de: "+dieta;
        
    }
    
    @Override
    public void setJueves(){
    
        this.ejercicio="Bicicleta fija 5 millas";
        this.dieta="2350 kcal";
        this.actividades="ejercicio: "+ejercicio+"\ndieta de: "+dieta;
        
    }
    
    @Override
    public void setViernes(){
    
        this.ejercicio="flexiones de pecho por 2 seciones";
        this.dieta="2000 kcal";
        this.actividades="ejercicio: "+Double.toString(intensidad)+" "+ejercicio+"\ndieta de: "+dieta;
        
    }
    
}
