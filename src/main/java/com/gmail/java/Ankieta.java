package com.gmail.java;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;


@WebServlet("/Ankieta")
public class Ankieta extends HttpServlet {
    private static Map<String, Integer> hm = new HashMap<>();

    public void init() {//инициализация сервлета, зачем здесь метод init?
        hm.put("30", 0);
        hm.put("60", 0);
        hm.put("100", 0);
        hm.put("americano", 0);
        hm.put("latte", 0);
        hm.put("cappucino", 0);
    }
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String age = request.getParameter("age");
        String coffe = request.getParameter("coffe");
        hm.put(age, hm.get(age)+1);//Александр, обясните правильно как этот код работает, не могу понять
        hm.put(coffe, hm.get(coffe)+1);

        PrintWriter pw = response.getWriter();
        pw.println("<html> <body>");
        pw.println("<h1> Jungest 30 - " + hm.get("30")+
                "<br>" + "From 30 to 60  - " + hm.get("60") +
                "<br>" + "From 60 and oldest - " + hm.get("100")+
                "<br>" + "americano - " + hm.get("americano")+
                "<br>" + "latte - " + hm.get("latte")+
                "<br>" + "cappucino - " + hm.get("cappucino"));
        pw.println("</body></html>");
    }


}
