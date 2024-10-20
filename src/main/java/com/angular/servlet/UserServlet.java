package com.angular.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/api/users")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public UserServlet() {
        super();
    }

	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();
        out.print("[{\"id\":1,\"nome\":\"Joao\",\"senha\":\"1234\"}]");
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String senha = req.getParameter("senha");

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("{\"id\":2,\"nome\":\"" + nome + "\",\"senha\":\"" + senha + "\"}");
        out.flush();
    }

}
