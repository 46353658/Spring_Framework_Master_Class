package com.arshad;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
//		Logger logger = Logger.getLogger(LoginServlet.class.getName());		
//		logger.info("Name parameter -> " + request.getParameter("name"));
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
}
