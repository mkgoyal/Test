package org.sample;

public class EmployeeNotFoundException extends Exception{

	@Override
	public String getMessage() {
	
		String s="employee not found in list";
		return s;
		
		//return "employee not found in list";
	}
}
