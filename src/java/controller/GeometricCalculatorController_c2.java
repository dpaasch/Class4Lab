package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.GeometricCalculatorModel;

/**
 * Challenge #2
 *
 * @author Dawn Bykowski
 */
public class GeometricCalculatorController_c2 extends HttpServlet {

    private String errMsg = "Entry cannot contain characters ~ Please enter a "
            + "digit between 1 - 1000";

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Rectangle Attributes - attributes from the rectangleAreaForm.html
        String length = request.getParameter("length");
        String width = request.getParameter("width");
        // Circle attributes -attributes from the circleAreaForm.html
        String radius = request.getParameter("radius");
        // Triangle attributes - attributes from the triangleAreaForm.html
        String sideA = request.getParameter("sideA");
        String sideB = request.getParameter("sideB");
        // Model object 
        GeometricCalculatorModel gcm;

        try {
            if (length != null && width != null) {
                // Instantiate a new model object
                gcm = new GeometricCalculatorModel();
                double area = gcm.getArea(length, width);
                // set the attribute to the value of area to be passed to the view
                request.setAttribute("area", area);
                // This object lets you forward both the request and response
                // objects to a destination page
                RequestDispatcher view =
                        request.getRequestDispatcher("/rectangleAreaForm.jsp");
                view.forward(request, response);
            } else if (radius != null) {
                gcm = new GeometricCalculatorModel();
                double cArea = gcm.getCircleArea(radius);
                // set the attribute to the value of cArea to be passed to the view
                request.setAttribute("cArea", cArea);
                // This object lets you forward both the request and response
                // objects to a destination page
                RequestDispatcher view =
                        request.getRequestDispatcher("/circleAreaForm.jsp");
                view.forward(request, response);
            } else {
                gcm = new GeometricCalculatorModel();
                double tArea = gcm.getTriangleArea(sideA, sideB);
                // set the attribute to the value of tArea to be passed to the view
                request.setAttribute("tArea", tArea);
                // This object lets you forward both the request and response
                // objects to a destination page
                RequestDispatcher view =
                        request.getRequestDispatcher("/triangleAreaForm.jsp");
                view.forward(request, response);
            }
        } catch (NumberFormatException nfe) {
            errMsg = nfe.getLocalizedMessage();
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
