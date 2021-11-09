
public class Challenger extends Car{
	private int maximumGears ; 
	private int roadServiceMonths;
	private int topSpeed;
	private String model;
	private String engineType;
	
	
	public Challenger(String model, int topSpeed, int maximumGears, int roadServiceMonths, String engineType) {
		super("Challenger", "FourWheeler", 4, 2, 8, false);
		this.model = model;
		this.topSpeed = topSpeed;
		this.maximumGears = maximumGears;
		this.roadServiceMonths = roadServiceMonths;
		this.engineType = engineType;
	}
	
	public void accelerate(int rate) {
		int newSpeed =  getCurrentSpeed() + rate;
		if(newSpeed > 0 && newSpeed <= 5) {
			changeGear(1);
		}
		else if(newSpeed >5 && newSpeed <= 15) {
			changeGear(2);
		}
		else if(newSpeed > 15 && newSpeed <= 30) {
			changeGear(3);
		}
		else if(newSpeed >30 && newSpeed <= 55) {
			changeGear(4);
		}
		else if(newSpeed > 55 && newSpeed <= 75) {
			changeGear(5);
		}
		else if(newSpeed > 75 && newSpeed <= 105) {
			changeGear(6);
		}
		else if(newSpeed >105 && newSpeed <= 145) {
			changeGear(7);
		}
		else if(newSpeed > 145 && newSpeed <= this.topSpeed) {
			changeGear(8);
		}
		
		if(newSpeed <= 0) {
			stop();
			changeGear(1);
		}
		else {
			changeSpeed(newSpeed, getCurrentDirection());
		}
	}

	public int getMaximumGears() {
		return maximumGears;
	}


	public void setMaximumGears(int maximumGears) {
		this.maximumGears = maximumGears;
	}


	public int getRoadServiceMonths() {
		return roadServiceMonths;
	}


	public void setRoadServiceMonths(int roadServiceMonths) {
		this.roadServiceMonths = roadServiceMonths;
	}


	public int getTopSpeed() {
		return topSpeed;
	}


	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getEngineType() {
		return engineType;
	}


	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
}
