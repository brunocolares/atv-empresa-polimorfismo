package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();

		
		System.out.print("Enter the number of employees: ");
		int numberOfEmployees = sc.nextInt();
		
		for(int i = 1; i <= numberOfEmployees; i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced (y/n)? ");
			String outsourced = sc.next();
			
			if(outsourced.toUpperCase().equals("Y") || outsourced.toUpperCase().equals("N")) {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				sc.nextLine();
				if(outsourced.toUpperCase().equals("Y")) {
					
					System.out.print("Additional charge: ");
					double additionalCharge = sc.nextDouble();
					employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				} else {
					employees.add(new Employee(name, hours, valuePerHour));
				}
			} else {
				System.out.println("Opção inválida.");
			}
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		sc.close();
	}

}
