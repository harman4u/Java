
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Challenger challengerSXT = new Challenger("SXT", 450, 8, 12, "V6" );
		challengerSXT.steer(90);
		challengerSXT.accelerate(60);
		System.out.println(challengerSXT.getCurrentGear());
		System.out.println(challengerSXT.getCurrentDirection());
		challengerSXT.accelerate(-75);
		
		int number = 20;
		Car honda = new Car( "Honda", "Small", 4, 4 ,6 , false);
		
		System.out.println(honda.getCurrentDirection());
		
		
	}

}
