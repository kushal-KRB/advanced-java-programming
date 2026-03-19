package com.example.servletdemo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void dopost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String firstName=request.getParameter("firstName");
        String lastName=request.getParameter("lastName");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        String gender=request.getParameter("gender");

       
        
        out.println("<h2>Registration Details </h2>");
        out.println("Firstname" +firstName);
        out.println("Lastname" + lastName);
        out.println("Email"+email);
        out.println("Password"+password);
    }

}
