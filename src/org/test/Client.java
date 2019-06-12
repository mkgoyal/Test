package org.test;

import org.sample.Company;
import org.sample.Employee;

public class Client extends Employee {

	
	public void cliId() {
		System.out.println("cli id is 1234567");
	}
	
	
	public void cliName() {
		System.out.println("cli name is air canada");
	}
	
	public static void main(String[] args) {
		Client c=new Client();//100
		c.cliId();
		c.cliName();
		c.empId();
		c.empName();
	
		
	}
}
