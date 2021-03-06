package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Challenge #1
 * @author Dawn Bykowski
 */
public class GeometricCalculatorController extends HttpServlet {

    private final static String RESULT_PAGE = "/result.jsp";
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

        try {
            if (length != null && width != null) {
                // convert above rectangle parameters to Double value
                double dblLength = Double.parseDouble(length);
                double dblWidth = Double.parseDouble(width);
                // calculate the area of the rectangle
                Double area = dblLength * dblWidth;
                // set the attribute to the value of area to be passed to the view (result.jsp)
                request.setAttribute("area", area);
            } else if (radius != null) {
                // convert above cicle parameter to Double value & set pi value
                double dblRadius = Double.parseDouble(radius);
                double pi = 3.14159265359;
                // caluclate the area of the circle
                Double cArea = pi * (dblRadius * dblRadius);
                // set the attribute to the value of area to be passed to the view (result.jsp)
                request.setAttribute("cArea", cArea);
            } else {
                // convert above triangle parameter to Double value
                double dblSideA = Double.parseDouble(sideA);
                double dblSideB = Double.parseDouble(sideB);
                // caluclate the area of the triangle
                Double tArea = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2));
                // set the attribute to the value of area to be passed to the view (result.jsp)
                request.setAttribute("tArea", tArea);
            }

            // This object lets you forward both the request and response
            // objects to a destination page
            RequestDispatcher view =
                    request.getRequestDispatcher(RESULT_PAGE);
            view.forward(request, response);
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
