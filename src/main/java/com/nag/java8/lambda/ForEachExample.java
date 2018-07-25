package com.nag.java8.lambda;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * forEach iteration using JAVA 8 lambda expression
 * 
 * @author Nagarjuna Vanapalli - nagarjuna.dj@gmail.com
 *
 */
public class ForEachExample {

	/**
	 * Iterating Map
	 *
	 * @param employee Details
	 */
	private void iterateMap(final Map<Integer, String> employeeDetails) {

		// iterating the map using lambda expression - this guarantees the atomicity
		employeeDetails.forEach((employeeId, employeeName) -> {
			System.out.println("Employee Id: " + employeeId + "  Employee Name: " + employeeName);
		});
	}

	/**
	 * Iterating List
	 *
	 * @param employeeIds
	 */
	private void iterateList(final List<Integer> employeeIds) {

		employeeIds.forEach((employeeId -> {
			System.out.println("Employee Id " + employeeId);
		}));
	}

	/**
	 * Iterating Set
	 *
	 * @param employeeIds
	 */
	private void iterateSet(final Set<Integer> employeeIds) {
		employeeIds.forEach((employeeId -> {
			System.out.println("Employee Id " + employeeId);
		}));
	}

	public static void main(String args[]) {

		final ForEachExample forEachExample = new ForEachExample();

		final Map<Integer, String> employeeDetails = new LinkedHashMap<>();

		employeeDetails.put(52922, "Ravi");
		employeeDetails.put(36578, "Swetha");
		employeeDetails.put(98934, "Kiran");
		employeeDetails.put(68231, "Sharan");

		System.out.println("---------Iterating Map---------");
		forEachExample.iterateMap(employeeDetails);

		final List<Integer> employeeIds = new ArrayList<>();
		employeeIds.add(345754);
		employeeIds.add(598498);
		employeeIds.add(987452);

		System.out.println("---------Iterating List--------");
		forEachExample.iterateList(employeeIds);

		final Set<Integer> uniqueEmployeeIds = new LinkedHashSet<>();
		uniqueEmployeeIds.add(873984);
		uniqueEmployeeIds.add(934644);
		uniqueEmployeeIds.add(5454547);

		System.out.println("---------Iterating Set--------");
		forEachExample.iterateSet(uniqueEmployeeIds);
	}
}
