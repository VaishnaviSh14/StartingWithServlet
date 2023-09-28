package in.vaish.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class UserRegistrationPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("Servlet Loading");
	}

    public UserRegistrationPage() {
    	System.out.println("Servlet Instantation");
    }

	public void init(ServletConfig config) throws ServletException {
    	System.out.println("Servlet Intialization");

}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request Processing...");
		String username = request.getParameter("username");
		String useraddr = request.getParameter("useraddr");
		String usermobile = request.getParameter("usermobile");
	   
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Output</title></head>");
		out.println("<body style='background-color: #E6F7FF; text-align: center;'>");
		out.println("<h1 style='color: #007BFF;'>Student Details</h1>");
		out.println("<table style='margin: 0 auto; width: 70%; border-collapse: collapse;'>");
		out.println("<tr><th style='background-color: #007BFF; color: #fff; padding: 15px; border: 2px solid #007BFF;'>Name</th><th style='background-color: #007BFF; color: #fff; padding: 15px; border: 2px solid #007BFF;'>Address</th><th style='background-color: #007BFF; color: #fff; padding: 15px; border: 2px solid #007BFF;'>Mobile</th></tr>");
		out.println("<tr><td style='padding: 10px; border: 2px solid #007BFF;'> " + username + "  </td><td style='padding: 10px; border: 2px solid #007BFF;'> " + useraddr + "  </td><td style='padding: 10px; border: 2px solid #007BFF;'>  " + usermobile + "  </td></tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.close();

	
	
	}

}
