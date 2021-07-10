package exampleMe1;

import java.util.Arrays;
import java.util.List;

public class FIrstTeste {

	public static void main(String[] args) {
		List<Double> listDou = Arrays.asList(3.855, 485.32, 87.3);
		List<Integer> listInt = Arrays.asList(5,2,10);
		
		printList(listInt);
		System.out.println("---------");
		printList(listDou);
	}
	
	static void printList(List<?> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Element: "+list.get(i)+", position: " + i);
		}
	}
}
