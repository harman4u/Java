
public class Vehicle {
	private String name;
	private String size;
	private int currentSpeed;
	private int currentDirection;
	
	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		this.currentSpeed = 0;
		this.currentDirection = 0;
	}
	
	public void move(int speed, int direction ) {
		this.currentSpeed = speed;
		this.currentDirection = direction;
		System.out.println("Vehicle is now moving at the speed " 
				+ this.currentSpeed + " km/hr in the direction of "
				+ this.currentDirection % 360 + " degrees clockwise.");
	}
	
	public void steer(int direction) {
		this.currentDirection = direction;
	}
	
	public void stop() {
		this.currentSpeed = 0;
		
	}
	
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public String getSize() {
		return this.size;
	}
}
