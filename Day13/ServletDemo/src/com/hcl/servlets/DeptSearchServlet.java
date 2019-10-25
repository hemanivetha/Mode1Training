package com.hcl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeptSearchServlet
 */
public class DeptSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=DaoConnection.getConnection();
		String cmd="Select * from Department where deptno=?";
		PrintWriter out=response.getWriter();
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, Integer.parseInt(request.getParameter("deptno")));
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				out.println("Name " +rs.getString("dname") +"<br/>");
				out.println("Location " +rs.getString("loc") +"<br/>");
				out.println("Head " +rs.getString("head") +"<br/>");
			}else{
				out.println("Record not found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
