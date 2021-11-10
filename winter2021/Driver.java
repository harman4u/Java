package winter2021;

public class Driver {
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Child();
		System.out.println(".....................");
		System.out.println(".....................");
		GrandChild gc = new GrandChild();
		System.out.println(".....................");
		c.greet2();
		p.greet2();
		gc.greet2();
		
		System.out.println(".....................");
		System.out.println(c.getClass() == p.getClass());
		
		System.out.println(".....................");
		Child c2 = new GrandChild();
		GrandChild gc3 = (GrandChild) c2;
		gc3.greet3();
	}
}
