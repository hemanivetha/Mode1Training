package com.hcl.employ;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class DataQueryDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void searchEmploy(int empno){
		String cmd="select * from Employ where empno=?";
		List emps=null;
		emps=jdbcTemplate.query(cmd,
				new Object[]{empno},
				new RowMapper() {
					
					public Object mapRow(ResultSet rs, int arg1) throws SQLException {
						String res=rs.getInt("empno")+"------"+
								rs.getString("name")+ "------"+
								rs.getString("dept")+"-------"+
								rs.getString("desig")+"-------"+
								rs.getInt("basic");
								return res;
					}
				});
		for (Object object : emps) {
			System.out.println(object);
		}
	}
	
	public void showEmploy(){
		String cmd="Select * from Employ";
		List emps=null;
		emps=jdbcTemplate.query(cmd, new RowMapper() {
			
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String res=rs.getInt("empno")+"------"+
				rs.getString("name")+ "------"+
				rs.getString("dept")+"-------"+
				rs.getString("desig")+"-------"+
				rs.getInt("basic");
				return res;
			}
		});
		for (Object object : emps) {
			System.out.println(object);
		}
	}

}
