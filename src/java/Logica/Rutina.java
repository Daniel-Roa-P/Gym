
package Logica;

public class Rutina {
    
    protected String lunes;
    protected String martes;
    protected String miercoles;
    protected String jueves;
    protected String viernes;
    protected double intensidad;
    protected String dieta;
    protected String ejercicio;
    protected String actividades;
    
    public void setIntensidad(int resistencia) {
        
        this.intensidad=resistencia;
       
    }
    
    public void setLunes(){};
    public void setMartes(){};
    public void setMiercoles(){};
    public void setJueves(){};
    public void setViernes(){};
    
    public String getActividades() {
        return actividades;
    }
}
