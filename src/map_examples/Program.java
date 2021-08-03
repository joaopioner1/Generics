package map_examples;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Joao");
		cookies.put("phone", "981811615");
		cookies.put("email", "joao@gmail.com");
		
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key+": " + cookies.get("email"));
		}
	}

}
