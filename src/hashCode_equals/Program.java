package hashCode_equals;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Carlos", true, 24);
		Client c2 = new Client("Carlos", true, 24);

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}

}
