package in.vaish.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static {
		System.out.println("Servlet Loading...");
		}
	
		public MyServlet() {
		System.out.println("Servlet Instantiation...");
		}
		
		public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Initialization...");
		}
		
		public void destroy() {
		System.out.println("Servlet DeInstantiation...");
		}
		
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request Processing phase...");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Response</title></head>");
		out.println("<body bgcolor ='red'><marquee><h1>Welcome to servlet coding..</h1></marquee><body>");
		out.println("</html>");
		out.close();
		
	}

}
