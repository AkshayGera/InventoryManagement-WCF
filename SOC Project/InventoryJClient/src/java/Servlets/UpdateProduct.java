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

/**
 *
 * @author Akshay
 */
public class UpdateProduct extends HttpServlet {

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
                    + "<link href="+request.getContextPath()+"/formcss.css rel='stylesheet' type='text/css'>"
                            + "<style>\n" +
"a:link, a:visited {\n" +
"  background-color: #f44336;\n" +
"  color: white;\n" +
"  padding: 14px 25px;\n" +
"  text-align: center;\n" +
"  text-decoration: none;\n" +
"  display: inline-block;\n" +
"}\n" +
"\n" +
"a:hover, a:active {\n" +
"  background-color: red;\n" +
"}\n" +
"</style>");
            out.println("<title>Servlet UpdateProduct</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Update Product</h1>");
            out.println("<form action=\"./UpdateProcess\" method='POST'>");
            out.println("<div class='row'><div class='col-25'>ID to be UPDATED:</div><div class='col-75'><input type='number' name='id' required></div></div>"
                    + "<div class='row'><div class='col-25'>Name</div><div class='col-75'><input type='text' name='name'></div></div>"
                    + "<div class='row'><div class='col-25'>Price</div><div class='col-75'><input type='number' min='0' name='price' required></div></div>"
                    + "<div class='row'><div class='col-25'>Stock</div><div class='col-75'><input type='number' min='0' name='stock' required></div></div>");
            out.println("<div class='row col-25'><input type='submit' value='submit'></div>"
                    + "<br /><a href='DisplayProducts'>Cancel</a>");
            out.println("</form>");
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
