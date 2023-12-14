package com.synechron.basics.array;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	private String empId;
	private String empFirstName;
	private String empLastName;
	private String empAddress;
	private float empSalary;
	private String empContactNumber;
	

	
	//private will not allow anyone to access the field/method outside the class
	//public can be accessed anywhere 
	
	//via public methods ==> accessed anywhere 
	//setter method ; public void setXXX(Data Type xXX)
	//public ; access specifier 
	//setXXX ; name of the setting method
	//DT ; data type
	//xXX; name of the field
	//getter method
	// public; accessed anywhere
	//RT; return type(on the basis of type of your field
	// getXXX : name of the method 
	// 2 ways : 1. via eclipse 2. via lombok library
}
