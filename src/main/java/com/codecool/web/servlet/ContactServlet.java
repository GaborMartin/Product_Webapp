package com.codecool.web.servlet;

import com.codecool.web.modell.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/contactServlet")
public class ContactServlet extends HttpServlet {
    private List<User> users = new ArrayList<>();

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String emailAddress = request.getParameter("email");
        String message = request.getParameter("message");

        User user = new User(name,emailAddress,message);
        users.add(user);

        System.out.println("Added user!");
        System.out.println("First name: " + name);
        System.out.println("E-mail: " + emailAddress);
        System.out.println("Message: " + message);

        for (User person :users) {
            System.out.println(person);
        }

        PrintWriter writer = response.getWriter();

        String htmlResponse = "<html> <head>\n" +
            "    <title>Martin's magic seeds</title>\n" +
            "    <link rel=\"stylesheet\" href=\"index.css\">\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "  </head>";
        htmlResponse += "<h2>Your username is: " + name;
        htmlResponse += "<br>Your E-mail is: " + emailAddress + "</br>";
        htmlResponse += "Your message: " + message + "</h2>";
        htmlResponse += "</html>";

        writer.println(htmlResponse);

    }

}
