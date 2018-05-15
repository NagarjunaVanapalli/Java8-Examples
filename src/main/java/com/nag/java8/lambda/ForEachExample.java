package com.nag.java8.lambda;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * forEach iteration using JAVA 8 lambda expression
 * 
 * @author Nagarjuna Vanapalli - nagarjuna.dj@gmail.com
 *
 */
public class ForEachExample {

	public static void main(String args[]) {

		// Creating Map
		final Map<Integer, String> employeeDetails = new LinkedHashMap<>();

		// Adding the employee data into map
		employeeDetails.put(52922, "Ravi");
		employeeDetails.put(36578, "Swetha");
		employeeDetails.put(98934, "Kiran");
		employeeDetails.put(68231, "Sharan");

		// iterating the map using lambda expression - this guarantees the atomicity
		employeeDetails.forEach((employeeId, employeeName) -> {
			System.out.println("Employee Id: " + employeeId + "  Employee Name: " + employeeName);
		});

	}

}
