package set_examples;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		set.remove("Notebook");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
		System.out.println("------------------");
		
		Set<Product> setp = new HashSet<>();
		setp.add(new Product("TV", 900.50));
		setp.add(new Product("Celular", 1200.00));
		setp.add(new Product("Xbox", 3000.00));
		
		Product prod = new Product("Tablet", 800.00);
		
		for (Product pd : setp) {
			System.out.println(pd);
		}
		System.out.println("---------------");
		System.out.println(setp.contains(prod));
	}

}
