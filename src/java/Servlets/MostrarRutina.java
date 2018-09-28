/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Hombre;
import Logica.Mujer;
import Logica.Persona;
import Logica.Rutina;
import Logica.RutinaObesidad;
import Logica.RutinaPesoBajo;
import Logica.RutinaPesoNormal;
import Logica.RutinaSobrepeso;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Estudiantes
 */
@WebServlet(name = "MostrarRutina", urlPatterns = {"/MostrarRutina"})
public class MostrarRutina extends HttpServlet {

    static Persona p;
    static Rutina r;
    
    public static void Liskov(Persona g){
        
       g.setGenero(); 
       p=g;
       
    }
    
    public static void Liskov2(Rutina n){
        
       n.setIntensidad(1);
       n.setLunes();
       n.setMartes();
       n.setMiercoles();
       n.setJueves();
       n.setViernes();
       r=n;
       
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        if("Hombre".equals(request.getParameter("Sexo"))){
             Liskov(new Hombre());
        } else if("Mujer".equals(request.getParameter("Sexo"))){
             Liskov(new Mujer());
        }
        
        p.setEstatura(Double.parseDouble(request.getParameter("Estatura")));
        p.setPeso(Integer.parseInt(request.getParameter("Peso")));
        p.setImc();
        p.setResistencia();
        
        if(p.getImc()<=18.5){
            Liskov2(new RutinaPesoBajo());
        } else if(p.getImc()>18.5 && p.getImc()<=25){
            Liskov2(new RutinaPesoNormal());
        } else if(p.getImc()>25 && p.getImc()<=30){
            Liskov2(new RutinaSobrepeso());
        } else if(p.getImc()>30){
            Liskov2(new RutinaObesidad());
        }        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MostrarRutina</title>");  
            out.println("<link type=\"text/css\" rel=\"stylesheet\" href=\"EstiloServlets.css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<table border=2>");
            r.setIntensidad(p.getResistencia());
            out.println("<tr>");
                out.println("<td>");
                out.println("<h2>Su IMC es: </h2>");  
                out.println("</td>");     
                
                out.println("<td colspan=2 >");
                out.println("<h2>"+ p.getEstado() +"</h2>");
               out.println("</td>");
               
            out.println("</tr>");
           
            out.println("<tr>");
            
               out.println("<td colspan=3>");
                   out.println("<h2>Su rutina es</h2>");
               out.println("</td>");   
               
            out.println("</tr>");
            
            out.println("<tr>");
                r.setLunes();
                out.println("<td>");
                    out.println("<h2>Lunes: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>"+r.getActividades()+"</h2>");
               out.println("</td>");
               
               out.println("<td rowspan=5>");
               out.println("<img src=\"https://static.vecteezy.com/system/resources/previews/000/087/319/non_2x/gym-logo-template-vector.jpg\"></img>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
                r.setMartes();
                out.println("<td>");
                    out.println("<h2>Martes: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>"+r.getActividades()+"</h2>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
                r.setMiercoles();
                out.println("<td>");
                    out.println("<h2>Miercoles: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>"+r.getActividades()+"</h2>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
                r.setJueves();
                out.println("<td>");
                    out.println("<h2>Jueves: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>"+r.getActividades()+"</h2>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
                r.setViernes();
                out.println("<td>");
                    out.println("<h2>Viernes: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>"+r.getActividades()+"</h2>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
                
                out.println("<td>");
                    out.println("<td colspan=\"3\"><a href=\"index.jsp\">Hacer nueva consulta</a></td>");
               out.println("</td>");   
            
            out.println("</tr>");
              
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
