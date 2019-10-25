package com.hcl.encode;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.hcl.model.Employee;

public class MainClass {

@SuppressWarnings("unchecked")
 public static void main(String[] args) {
	
	StringBuilder contentBuilder = new StringBuilder();
    try (Stream<String> stream = Files.lines( Paths.get("C:\\Users\\Coalesce\\Downloads\\Employees.json"), StandardCharsets.UTF_8))
    {
        stream.forEach(s -> contentBuilder.append(s));
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
    String s= contentBuilder.toString();
    JSONObject jsonObject = (JSONObject)JSONValue.parse(s); 
    JSONObject obj2=(JSONObject) jsonObject.get("Employees");
    
    JSONArray arr=(JSONArray)obj2.get("employee");
    List<Employee> lst=new ArrayList<Employee>();
	  for(int i=0;i<arr.size();i++){
		  Employee emp=new Employee();
		  JSONObject a= (JSONObject) arr.get(i);
		  long empno = (long) a.get("empno");
		  emp.setEmpno(empno);
		  String empName = (String) a.get("empName");  
		  emp.setEmpName(empName);
		  long salary = (long) a.get("salary"); 
		  emp.setSalary(salary);
		  String dateOfJoin = (String) a.get("dateOfJoin");  
		  emp.setDateOfjoin(dateOfJoin);
		  String band = (String) a.get("band"); 
		  emp.setBand(band);
	      System.out.println(empno+" "+empName+" "+salary+" "+dateOfJoin+" "+band+" ");
	      lst.add(emp);
	  }
    lst.forEach((var)->System.out.println(var));
	  }
	
}