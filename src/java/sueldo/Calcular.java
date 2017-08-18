/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
public class Calcular extends HttpServlet {

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
        PrintWriter salida = response.getWriter();
        String nombre = request.getParameter("nombre");
        String rut = request.getParameter("rut");
        String cargo = request.getParameter("cargo");
        String sueldo_base = request.getParameter("sueldo_base");
        String hora_extra = request.getParameter("hora_extra");
        String dia_ausencia = request.getParameter("dia_ausencia");
        Boolean error = false;
        double monto_he = 0;
        double bono=0;
        double total_ausencia = 0;
        double sbase = 0;
        int hextra = 0;
        int ausencia = 0; 
        double sueldo_bruto = 0;
        
        try{
           sbase = Double.parseDouble(sueldo_base); 
           hextra = Integer.parseInt(hora_extra); 
           ausencia = Integer.parseInt(dia_ausencia);
           monto_he = hextra*sbase/180*1.5;
            if (cargo.equals("Operativo")) {
                bono = sbase*0.1;
            } else if (cargo.equals("Administrativo")) {
                bono = sbase*0.15;
            }
            total_ausencia = ausencia*sbase/30;
            sueldo_bruto = sbase+monto_he-total_ausencia+bono;
            
        }catch (Exception e){
                error = true;
        };

        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calcular</title>");            
            out.println("</head>");
            out.println("<body>");
            if (error) {
                out.println("<h1>Error</h1>");
            }else{  
                out.println("<h1>Resultado:</h1>");

            
            out.println("<table  border='1'"+
                "<tr>"+
                    "<th>"+
                        "Datos"+ 
                    "</th>"+
                    "<th>"+
                        ""+ 
                    "</th>"+
                "<tr>"+
                "</tr>"+
                    "<td>"+ 
                        "Nombre"+  
                    "</td>"+  
                    "<td>"+ 
                        nombre+  
                    "</td>"+ 
                "</tr>"+

                "</tr>"+
                    "<td>"+ 
                        "Rut"+  
                    "</td>"+  
                    "<td>"+ 
                        rut+  
                    "</td>"+ 
                "</tr>"+


                "</tr>"+
                    "<td>"+ 
                        "Cargo"+  
                    "</td>"+  
                    "<td>"+ 
                        cargo+  
                    "</td>"+ 
                "</tr>"+

                "</tr>"+
                    "<td>"+ 
                        "Sueldo Base"+  
                    "</td>"+  
                    "<td>"+ 
                        sueldo_base+  
                    "</td>"+ 
                "</tr>"+

                "</tr>"+
                    "<td>"+ 
                        "Dias de ausencia"+  
                    "</td>"+  
                    "<td>"+ 
                        dia_ausencia+  
                    "</td>"+ 
                "</tr>"+

                "</tr>"+
                    "<td>"+ 
                        "Descuento por ausencia"+  
                    "</td>"+  
                    "<td>"+ 
                        total_ausencia+  
                    "</td>"+ 
                "</tr>"+

                "</tr>"+
                    "<td>"+ 
                        "Total horas extras"+  
                    "</td>"+  
                    "<td>"+ 
                        hora_extra+  
                    "</td>"+ 
                "</tr>"+

                "</tr>"+
                    "<td>"+ 
                        "Bonificación horas extras"+  
                    "</td>"+  
                    "<td>"+ 
                        monto_he+  
                    "</td>"+ 
                "</tr>"+

                "</tr>"+
                    "<td>"+ 
                        "Bono"+  
                    "</td>"+  
                    "<td>"+ 
                        bono+  
                    "</td>"+ 
                "</tr>"+

                "</tr>"+
                    "<td>"+ 
                        "Total Sueldo Bruto"+  
                    "</td>"+  
                    "<td>"+ 
                        sueldo_bruto+  
                    "</td>"+ 
                "</tr>"+


                "</table>"+ 
                "</body>"+
                "</html>");
            }
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
