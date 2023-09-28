package in.vaish.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.vaish.utility.JDBCUtil;


@WebServlet("/save")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SQLINSERT_QUERY = "insert into student(sname,sage,saddress) values (?,?,?)";

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sage = request.getParameter("sage");
		String sname = request.getParameter("sname");
		String saddress = request.getParameter("saddr");

		PrintWriter out = response.getWriter();

		Connection connection = null;
		PreparedStatement pstmt = null;

		try {
			connection = JDBCUtil.getDBConnection();
			pstmt = connection.prepareStatement(SQLINSERT_QUERY);
			pstmt.setString(1, sname);
			pstmt.setInt(2, Integer.parseInt(sage));
			pstmt.setString(3, saddress);
			int rowCount = pstmt.executeUpdate();
			out.println("<html><head><title>RESPONSE</title></head>");
			if (rowCount == 1) {
				out.println(
						"<body><h1 style='color:green; text-align:center;'>RECORD INSERTED SUCCESFULLY</h1></body>");
			} else {
				out.println("<body><h1 style='color:red; text-align:center;'>RECORD INSERTION FAILED</h1></body>");
			}
			out.println("</html>");
			out.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JDBCUtil.closeResources(null, pstmt, connection);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
