package set_examples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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
		System.out.println("---------------");
		
		Set<Product> set3 = new TreeSet<>();
		set3.add(new Product("Rice", 3.50));
		set3.add(new Product("Beans", 6.50));
		set3.add(new Product("Oil", 9.80));
		set3.add(new Product("Meat", 50.95));
		set3.add(new Product("Pasta", 7.51));
		
		for (Product p3 : set3) {
			System.out.println(p3);
		}
	}
}
