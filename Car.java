
public class Car extends Vehicle{
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	
	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Current Gear of the vehicle has been set to " + currentGear);
	}
	
	public String getCurrentGear() {
		return "Current gear of the vehicle is "+ this.currentGear;
	}
	
	public void changeSpeed(int speed, int direction) {
		move(speed, direction);
	}
	
	public void changeGear(int gear) {
		this.currentGear = gear;
	}
	
	
	
}
















