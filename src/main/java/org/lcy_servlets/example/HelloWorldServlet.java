package org.lcy_servlets.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet에서 페이지 출력까지 다한다.
 * 
 * @author Jacob
 */
@WebServlet("/helloworld")
public class HelloWorldServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>good</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>good</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}