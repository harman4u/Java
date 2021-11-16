
public class Car {
	String make;
	String model;
	int year ;
	String fuelType;
	boolean isTransmissionAutomatic;
	double price;
	
	
	public Car(){
		make = "";
		model = "";
		fuelType = "";
		year = 2020;
		isTransmissionAutomatic = true;
		price = 0.0;
	}
	
	public Car(String make, String model, int year){
		this.make = make;
		this.model = model;
		this.year = year;
		isTransmissionAutomatic = true;
		fuelType = "";
	}
	
	
	public String getMakeName() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getManufacturingYear() {
		return this.year;
	}
	
	public String getTransmissionType () {
		if(true) {
			return "automatic";
		}
		else {
			return "manual";
		}
	}
	
	
	public void setMakeName(String name) {
		this.make = name;
	}
	
	public void setModel(String name) {
		this.model = name;
	}
	
	public void setManufacturingYear(int year) {
		this.year = year;
	}

	public void setTransmissionType(String transmissionType) {
		if(transmissionType.equals("automatic")) {
			this.isTransmissionAutomatic = true;
		}
		else if(transmissionType.equals("manual")) {
			this.isTransmissionAutomatic = false;
		}
	}
	
	public void setFuelType (String fuelType) {
		this.fuelType = fuelType;
	}
	

	public void setPrice  (double price) {
		this.price = price;
	}
	
	
	
	public String toString() {
		
		return this.getMakeName() + " " + this.getModel() 
		+ " " + this.getTransmissionType() + this.fuelType +
		" manufactured in "+ this.getManufacturingYear() + " costs "+ this.price;
	}
	
	public boolean equals(Car c) {
		if(this.getMakeName().equals(c.getMakeName()) && 
				this.getModel().equals(c.getModel()) &&
				this.getManufacturingYear() == c.getManufacturingYear() &&
				this.getTransmissionType() == c.getTransmissionType())
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	
	
	public boolean isComparable(Car c){
		
		
		if(this.getTransmissionType() == c.getTransmissionType()
				&& this.fuelType.equals(c.fuelType) 
				&& c.price <= 0.1*this.price) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}
