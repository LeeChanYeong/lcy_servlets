package org.lcy_servlets.example;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 데이터를 만든다.
		String name = "lcy";

		// 데이터를 request에 태운다.
		request.setAttribute("name", name);

		// /WEB-INF/jsp/hello.jsp로 forward 한다.
		request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request,
				response);
	}
}