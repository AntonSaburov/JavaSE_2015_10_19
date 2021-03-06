package edu.javacourse.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String m1 = "Model_1";
        String m2 = "Model_2";
        request.setAttribute("MOD_1", m1);
        request.setAttribute("MOD_2", m2);
        getServletContext().getRequestDispatcher("/view.jsp").forward(request, response);

    }

}
