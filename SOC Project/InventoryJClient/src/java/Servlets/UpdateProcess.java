/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import org.tempuri.Inventory;

/**
 *
 * @author Akshay
 */
public class UpdateProcess extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8000/InventoryService.wsdl")
    private Inventory service;

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
            String msg1="";
            String msg3="";
            String msg2="";
            int id=Integer.parseInt(request.getParameter("id"));
            String name=request.getParameter("name");
            BigDecimal price = BigDecimal.valueOf(Double.parseDouble(request.getParameter("price")));
            int stock = Integer.parseInt(request.getParameter("stock"));
            if(!name.isEmpty())
            {
             msg1=updateName(id,name);
            }
            
            if(price!=null)
            {
            msg2=updatePrice(id,price);
            }
            
            
            msg3=updateStock(id,stock);
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateProcess</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Changes Done</h1>");
            out.println("</body>");
            out.println("</html>");
            response.sendRedirect("./DisplayProducts");
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

    private String updateName(java.lang.Integer id, java.lang.String name) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.InventoryInterface port = service.getBasicHttpBindingInventoryInterface();
        return port.updateName(id, name);
    }

    private String updatePrice(java.lang.Integer id, java.math.BigDecimal price) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.InventoryInterface port = service.getBasicHttpBindingInventoryInterface();
        return port.updatePrice(id, price);
    }

    private String updateStock(java.lang.Integer id, java.lang.Integer stock) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.InventoryInterface port = service.getBasicHttpBindingInventoryInterface();
        return port.updateStock(id, stock);
    }

}
