package oop_exam;

public class CarMain {
	public static void main(String[] args) {
		System.out.println(Car.instanceCount);		
		Car car1 = new Car("경차");
		System.out.println(Car.instanceCount);
		System.out.println(car1.getName());
		Car car2 = new Car("소형차");
		System.out.println(Car.instanceCount);
		System.out.println(car2.getName());
		Car car3 = new Car("중형차");
		System.out.println(Car.instanceCount);
		System.out.println(car3.getName());
		Car car4 = new Car("대형차");
		System.out.println(Car.instanceCount);
		System.out.println(car4.getName());
	}
}