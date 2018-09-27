/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

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
            
            out.println("<tr>");
                out.println("<td >");
                out.println("<h2>Su IMC es: </h2>");  
                out.println("</td>");     
                
                out.println("<td colspan=2>");
                out.println("<h2>hola</h2>");
               out.println("</td>");
               
            out.println("</tr>");
           
            out.println("<tr>");
            
               out.println("<td colspan=3>");
                   out.println("<h2>su rutina es</h2>");
               out.println("</td>");   
               
            out.println("</tr>");
            
            out.println("<tr>");
                
                out.println("<td>");
                    out.println("<h2>Lunes: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>hola</h2>");
               out.println("</td>");
               
               out.println("<td rowspan=6>");
               out.println("<img src=\"https://static.vecteezy.com/system/resources/previews/000/087/319/non_2x/gym-logo-template-vector.jpg\"></img>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
            
                out.println("<td>");
                    out.println("<h2>Martes: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>hola</h2>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
               
                out.println("<td>");
                    out.println("<h2>Miercoles: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>hola</h2>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
                
                out.println("<td>");
                    out.println("<h2>Jueves: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>hola</h2>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
            
                out.println("<td>");
                    out.println("<h2>Viernes: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>hola</h2>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
                
                out.println("<td>");
                    out.println("<h2>Sabado: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>hola</h2>");
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
