package com.example.statisticservlet;
import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import java.util.concurrent.atomic.AtomicInteger;

public class StatisticQuestionServlet extends HttpServlet {
    private final AtomicInteger meatCount = new AtomicInteger(0);
    private final AtomicInteger veggiesCount = new AtomicInteger(0);
    private final AtomicInteger catCount = new AtomicInteger(0);
    private final AtomicInteger dogCount = new AtomicInteger(0);


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String food = request.getParameter("food");
        String animal = request.getParameter("animal");

        if ("meat".equals(food)) {
            meatCount.incrementAndGet();
        } else if ("veggies".equals(food)) {
            veggiesCount.incrementAndGet();
        }

        if ("cat".equals(animal)) {
            catCount.incrementAndGet();
        } else if ("dog".equals(animal)) {
            dogCount.incrementAndGet();
        }

        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        if ("reset".equals(action)) {
            meatCount.set(0);
            veggiesCount.set(0);
            catCount.set(0);
            dogCount.set(0);
            response.sendRedirect("index.jsp");
        } else {
            request.setAttribute("meatCount", meatCount.get());
            request.setAttribute("veggiesCount", veggiesCount.get());
            request.setAttribute("catCount", catCount.get());
            request.setAttribute("dogCount", dogCount.get());

            RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
