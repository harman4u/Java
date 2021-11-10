package winter2019;

public class Child extends Parent {
	int x=20;
public Child() {
this.greet();
this.greet3();
}
public static void greet() { System.out.println("Bonjour!"); }
public void greet2() { System.out.println("Salut!"); }
public void greet3() { System.out.println("Allo!"); }
}