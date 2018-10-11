package com.epam.lab;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletMain extends javax.servlet.http.HttpServlet {

    public static int count = 1;
    public static String state = "";

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        state+="Po";
        response.getWriter().write(state  + " " + count);
        setCookies(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        state+="G";
        response.getWriter().write(state + " " + count);
        setCookies(request, response);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        state+="Pu";
        resp.getWriter().write(state + " " + count);
        setCookies(req, resp);

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        state+="D";
        resp.getWriter().write(state + " " + count);
        setCookies(req, resp);
    }

    protected void setCookies(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
        Cookie[] cookies = request.getCookies();
        count++;
        }

}