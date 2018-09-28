
package Logica;


public class RutinaPesoBajo extends Rutina {
    
    @Override
    public void setLunes(){
    
        this.ejercicio="Flexiones de pecho por 3 seciones";
        this.dieta="2300 kcal";
        this.actividades="ejercicio: "+Double.toString(intensidad/2)+" "+ejercicio+"\ndieta de: "+dieta;
        
    }
    
    @Override
    public void setMartes(){
    
        this.ejercicio="Pesas de 5 kilos con descandos de 20 levantamientos";
        this.dieta="2500 kcal";
        this.actividades="ejercicio: "+Double.toString(intensidad)+" "+ejercicio+"\ndieta de: "+dieta;
        
    }
    
    @Override
    public void setMiercoles(){
    
        this.ejercicio="Abdominales por 3 seciones";
        this.dieta="2420 kcal";
        this.actividades="ejercicio: "+Double.toString(intensidad)+" "+ejercicio+"\ndieta de: "+dieta;
        
    }
    
    @Override
    public void setJueves(){
    
        this.ejercicio="Sentadillas por 4 seciones";
        this.dieta="2350 kcal";
        this.actividades="ejercicio: "+Double.toString(intensidad/2)+" "+ejercicio+"\ndieta de: "+dieta;
        
    }
    
    @Override
    public void setViernes(){
    
        this.ejercicio="Barras con descansos de a 15";
        this.dieta="2600 kcal";
        this.actividades="ejercicio: "+Double.toString(intensidad)+" "+ejercicio+"\ndieta de: "+dieta;
        
    }

    
}
