package com.codecool.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/contactServlet")
public class ContactServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String emailAddress = request.getParameter("email");

        System.out.println("First name: " + name);
        System.out.println("e-mail: " + emailAddress);

        PrintWriter writer = response.getWriter();

        String htmlResponse = "<html> <head>\n" +
            "    <title>Martin's magic seeds</title>\n" +
            "    <link rel=\"stylesheet\" href=\"index.css\">\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "  </head>";
        htmlResponse += "<h2>Your username is: " + name + "<br/>";
        htmlResponse += "Your password is: " + emailAddress + "</h2>";
        htmlResponse += "</html>";

        writer.println(htmlResponse);

    }

}
