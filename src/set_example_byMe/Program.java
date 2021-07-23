package set_example_byMe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Program {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner Date: 23/07/2021
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Set<Employee> set = new TreeSet<Employee>();
		
		System.out.println("Number emps: ");
		int numberEmps = scan.nextInt();
		try {
			for (int i = 0; i < numberEmps; i++) {
			System.out.println("-INFO-");
			System.out.print("Name: ");
			String name = scan.next();
			System.out.print("Birth (dd/MM/yyyy): ");
			Date birth = sdf.parse(scan.next());
			System.out.print("Salary: ");
			Double salary = scan.nextDouble();
			
			set.add(new Employee(name, birth, salary));
			}
			for (Employee emp : set) {
				System.out.println(emp);
			}
		}
		catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}
}
