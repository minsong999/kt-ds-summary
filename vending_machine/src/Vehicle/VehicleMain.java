package Vehicle;

public class VehicleMain {

	public void startEngine(Vehicle v) {
		v.startEngine();
		
		if(v instanceof EV) { //instanceof는 연산자다. 
			EV e=(EV)v; //자식클래스 형태로 형변환
			e.checkBattery();
		}
	}
	
	public static void main(String[] args) {
		Vehicle car1= new Vehicle();
		Vehicle car2= new EV();
		Vehicle car3= new SportsCar();
		Vehicle car4= new BatMobile();
		
		VehicleMain main = new VehicleMain();
		main.startEngine(car1);
		main.startEngine(car2);
		main.startEngine(car3);
		main.startEngine(car4);
		
		
	}
	
}
