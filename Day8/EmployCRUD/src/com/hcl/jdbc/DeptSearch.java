package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptSearch {
	
	public static void main(String[] args) {
		int deptno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dept no ");
		deptno=sc.nextInt();
		Connection con=DaoConnection.getConnection();
		String cmd="select * from department where deptno=?";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, deptno);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				System.out.println("Name " +rs.getString("dname"));
				System.out.println("Location " +rs.getString("loc"));
				System.out.println("Head " +rs.getString("head"));
				
			}
			else{
				System.out.println("Record not found1");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
