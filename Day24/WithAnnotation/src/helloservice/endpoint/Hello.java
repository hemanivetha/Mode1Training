package helloservice.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello {
	
	private String msg=new String("Hello");
	public Hello(){}
	
	@WebMethod
	public String sayHello(String name){
		return msg+name+".";
	}
	
}
