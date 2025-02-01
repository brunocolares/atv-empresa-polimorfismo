package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number of employees: ");
		int numberOfEmployees = sc.nextInt();
		
		for(int i = 1; i <= numberOfEmployees; i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced (y/n)? ");
			String outsourced = sc.next();
			
			if(outsourced.toUpperCase().equals("y") || outsourced.toUpperCase().equals("n")) {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.println("Hours: ");
				int hours = sc.nextInt();
				System.out.println("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				
				if(outsourced.toUpperCase().equals("y")) {
					System.out.println("Additional charge: ");
				}
			} else {
				System.out.println("Opção inválida.");
			}
		}
		
		List<Employee> employees = new ArrayList<>();

	}

}
