package exercicio_fixacao;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		// Author: Joao Vitor Souza Pioner | Date: 28/07/2021
		Scanner scan = new Scanner(System.in);
		
		Integer code=0;
		Set<User> set = new TreeSet<>();
		
		System.out.print("How many students for course A?");
		Integer quantityA_students = scan.nextInt();
		
		for (int i = 0; i < quantityA_students; i++) {
			code = scan.nextInt();
			if (!set.contains(new User(code))) {
				set.add(new User(code));
			}
		}
		
		System.out.print("How many students for course B?");
		Integer quantityB_students = scan.nextInt();
		
		for (int i = 0; i < quantityB_students; i++) {
			code = scan.nextInt();
			if (!set.contains(new User(code))) {
				set.add(new User(code));
			}
		}
		
		System.out.print("How many students for course C?");
		Integer quantityC_students = scan.nextInt();
		
		for (int i = 0; i < quantityC_students; i++) {
			code = scan.nextInt();
			if (!set.contains(new User(code))) {
				set.add(new User(code));
			}
		}
		System.out.println(set.size());
	}

}
