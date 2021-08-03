package map_example1;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Joao");
		cookies.put("phone", "981811615");
		cookies.put("email", "joao@gmail.com");
		
		cookies.put("email", "isadora@gmail.com");
		cookies.put("email", "adriana@gmail.com");
		cookies.put("email", "carlos@gmail.com");

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));//checks if contains
		System.out.println("Get email: " + cookies.get("email"));
		
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key+": " + cookies.get(key)); //ordena pela chava, poderia por "email" tb
		}
	}

}
