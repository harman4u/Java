

import java.util.Scanner;
public class Function_4 {
	// CODE TO COMPLETE
	// -------------------------
	// Declare instance variables
	private int a, b, c, x, y;
	
	// Implement default constructor
	Function_4(){
		this.a = 0;
		this.b = 0;
		this.c = 0;
		this.x = 0;
		this.y = 0;
	}
	
	// Implement 2nd constructor
	
	Function_4(int a, int b, int c, int x, int y){
		this.a = a;
		this.b = b;
		this.c = c;
		this.x = x;
		this.y = y;
	}
	// Implement Get/Set methods
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	public int getA() {
		return this.a;
	}
	public int getB() {
		return this.b;
	}
	public int getC() {
		return this.c;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setABC(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	// Implement toString
	public String toString() {
		return "Equation: " + a + "*"+ x+"*"+x+" + "+b+"* ("+ y + "-1)" + " + " + c +"*sqrt("+ x+ "*"+y+")";
	}
	// Implement equals methods
	public boolean equals(Function_4 f) {
		if(this.a == f.a && this.b == f.b && this.c == f.c && this.x == f.x  && this.y == f.y) {
			return true;
		}
		return false;
		
	}
	
	// Implement results methods
	public int result() {
		int result = 0;
		result = (int) ((a*x*x) + (b*(y-1)) +Math.round(c*Math.sqrt(x*y)));
		return result;
	}
	
	// Implement rotateABC method
	public void rotateABC() {
		int swap = a;
		a = b;
		b = c;
		c = swap; 	
	}

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		int a, b, c, x, y;
		System.out.print("Enter 3 integer coefficients: ");
		a = keyIn.nextInt();
		b = keyIn.nextInt();
		c = keyIn.nextInt();
		System.out.print("Enter x and y (both integers): ");
		x = keyIn.nextInt();
		y = keyIn.nextInt();
		Function_4 f1 = new Function_4(a, b, c, x, y);
		Function_4 f2 = new Function_4();
		System.out.println("\nThe two functions are:");
		System.out.println(f1 + " = "+ f1.result() + "\n"
				+ f2 + " = "+ f2.result() );
		
		System.out.print("\nEnter x and y for the second function: ");
		x = keyIn.nextInt();
		y = keyIn.nextInt();
		f2.setX(x);
		f2.setY(y);
		f2.setABC(f1.getA(), f1.getB(),f1.getC());
		System.out.println("Second function is now " +f2);
		System.out.println("\nThe two functions are the same is " +f1.equals(f2));
		
		f2.rotateABC();
		System.out.println("\nAfter rotating the coefficients, the 2nd function now is:\n" + f2);
		System.out.println("\nThe two functions now are the same is " +f1.equals(f2));
		System.out.println("\nThe final version of the two functions are:");
		System.out.print(f1 + " = "+ f1.result() + "\n"
				+ f2 + " = "+ f2.result() );
		keyIn.close();
	}

	

}
