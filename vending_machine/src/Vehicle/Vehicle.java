package Vehicle;

public class Vehicle {
	String name;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String a) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void startEngine() {
		System.out.println("시동 걸기");

	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
}
