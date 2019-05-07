package com.arshad;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>H</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("B");
//		out.println("</body>");
//		out.println("</html>");
		
	}
	
}
