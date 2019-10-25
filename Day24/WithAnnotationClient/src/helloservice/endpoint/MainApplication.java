package helloservice.endpoint;

import java.rmi.RemoteException;

public class MainApplication {
	
	public static void main(String[] args) {
		HelloProxy h=new HelloProxy();
		String res=null;
		try {
			res=h.sayHello("Hema");
			System.out.println(res);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
