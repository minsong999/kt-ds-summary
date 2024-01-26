package Vehicle;

public class EV extends Vehicle{
	int battery;
	
	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int checkBattery() {
		System.out.println("배터리 체크");
		return 0;
	}
}
