package org.sample;

import java.io.IOException;
import java.util.Scanner;

public class ExceEmpl {

private void searchEmployee() throws EmployeeNotFoundException {
	Scanner sc=new Scanner(System.in);
	System.out.println("pls enter id");
	String empId = sc.next();
	if(empId.startsWith("13")) {
		System.out.println(empId);
	}
	else {
		throw new EmployeeNotFoundException();
	}
}
	
	
	public static void main(String[] args) throws EmployeeNotFoundException  {
		
		ExceEmpl em=new ExceEmpl();
		em.searchEmployee();
	}
}
