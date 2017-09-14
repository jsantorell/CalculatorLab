package com.mycompany.firstmaven.claculatorslab.Controller;

import com.mycompany.firstmaven.claculatorslab.Model.Calculator;
import com.mycompany.firstmaven.claculatorslab.Model.CircleCalculator;
import com.mycompany.firstmaven.claculatorslab.Model.RectangleCalculator;
import com.mycompany.firstmaven.claculatorslab.Model.TriangleLegLengthCalculator;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jerem
 */
@WebServlet(name = "CalculatorController", urlPatterns = {"/CalcController"})
public class CalculatorController extends HttpServlet {

    private static final String RECTANGLE = "Rectangle";
    private static final String RECTANGLE_SAME_PAGE = "RectangleSamePage";
    private static final String CIRCLE_SAME_PAGE = "CircleSamePage";
    private static final String TRIANGLE_SAME_PAGE = "TriangleSamePage";
    private static final String ACTION = "shape";
    private static final long serialVersionUID = 1L;

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

        String lengthEntered = request.getParameter("length");
        String widthEntered = request.getParameter("width");
        String diameterEntered = request.getParameter("diameter");
        String leg1Entered = request.getParameter("leg1");
        String leg2Entered = request.getParameter("leg2");
        String leg3Entered = request.getParameter("leg3");

        String shape = request.getParameter(ACTION);
        Calculator calc = null;

        try {

            if (shape.equals(RECTANGLE)) {
                String headerMsg = RECTANGLE;
                calc = new RectangleCalculator();
                String area = calc.getAreaOfShape(lengthEntered, widthEntered);

                request.setAttribute("area", area);
                request.setAttribute("hdrMsg", headerMsg);

                RequestDispatcher view
                        = request.getRequestDispatcher("/response.jsp");
                view.forward(request, response);
            } else if (shape.equals(RECTANGLE_SAME_PAGE)) {

                calc = new RectangleCalculator();
                String area = calc.getAreaOfShape(lengthEntered, widthEntered);

                request.setAttribute("area", area);

                RequestDispatcher view
                        = request.getRequestDispatcher("/lab3.jsp");
                view.forward(request, response);

            } else if (shape.equals(CIRCLE_SAME_PAGE)) {

                calc = new CircleCalculator();
                String area = calc.getAreaOfShape(diameterEntered);

                request.setAttribute("areaC", area);

                RequestDispatcher view
                        = request.getRequestDispatcher("/lab3.jsp");
                view.forward(request, response);

            } else if (shape.equals(TRIANGLE_SAME_PAGE)) {

                calc = new TriangleLegLengthCalculator();
                String area = calc.getAreaOfShape(leg1Entered, leg2Entered, leg3Entered);

                if (leg1Entered.trim().equals("")) {
                    request.setAttribute("legA", area);
                } else {
                    request.setAttribute("legA", leg1Entered);
                }
                if (leg2Entered.trim().equals("")) {
                    request.setAttribute("legB", area);
                } else {
                    request.setAttribute("legB", leg2Entered);
                }
                if (leg3Entered.trim().equals("")) {
                    request.setAttribute("legC", area);
                } else {
                    request.setAttribute("legC", leg3Entered);
                }


                RequestDispatcher view
                        = request.getRequestDispatcher("/lab3.jsp");
                view.forward(request, response);

            }
        } catch (Exception ex) {

            request.setAttribute("errors", ex.getMessage());
            RequestDispatcher view
                    = request.getRequestDispatcher("/lab3.jsp");
            view.forward(request, response);

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
