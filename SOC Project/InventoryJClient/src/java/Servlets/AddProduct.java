/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
public class AddProduct extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>"
                    + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"
                    + "<link href="+request.getContextPath()+"/formcss.css rel='stylesheet' type='text/css'>");
            out.println("<title>AddProduct</title>");            
            out.println("<style>a:link, a:visited {\n" +
"  background-color: #f44336;\n" +
"  color: white;\n" +
"  padding: 14px 25px;\n" +
"  text-align: center;\n" +
"  text-decoration: none;\n" +
"  display: inline-block;"
                    + "position:absolute;"
                    + "\n" +
"}\n" +
"\n" +
"a:hover, a:active {\n" +
"  background-color: red;\n" +
"}</style>"
                    + "</head>");
            out.println("<body>");
            out.println("<h1>Add Product</h1>");
            out.println("<form action='./AddProcess' method='POST'>"
                    + "<div class='row'>"
                    + "<div class='col-25'>");
            out.println("Name:</div><div class='col-75'><input type=\"text\" name=\"name\" required></div></div>");
            out.println("<br>\n" +
"  <div class='row'><div class='col-25'>Price:</div>\n" +
"  <div class='col-75'><input type=\"number\" min='0' name=\"price\" required></div></div>\n" +
"  <br><br>\n" +
                "  <div class='row'><div class='col-25'>Stock:</div>\n" +
"  <div class='col-75'><input type=\"number\" min='0' name=\"stock\" required></div></div>\n" +
"  <br><br>\n" +    
                    "<div class='row'><div class='col-25'>Category:</div><div class='col-75'><select name=\"category\" required>\n" +
"    <option value=\"peripherals\">peripherals</option>\n" +
"    <option value=\"storage\">storage</option>\n" +
"    <option value=\"audio\">audio</option>\n" +
"    <option value=\"video\">video</option>\n" +
"    <option value=\"processor\">processor</option>\n" +
"    <option value=\"gpu\">gpu</option>\n" +
"    <option value=\"misc\">misc</option>\n" +                    
"  </select></div></div>"+
"  <div class='row col-25'><input type=\"submit\" value=\"Submit\"></div><span>  </span>"
                    + "<br /><div class='row'><span>  </span><a href='DisplayProducts'>Cancel</a></div></form>");
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

    private String addProduct(java.lang.String name, java.math.BigDecimal price, java.lang.Integer stock, java.lang.String category) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.InventoryInterface port = service.getBasicHttpBindingInventoryInterface();
        return port.addProduct(name, price, stock, category);
    }

}
