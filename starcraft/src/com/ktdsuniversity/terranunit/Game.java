package com.ktdsuniversity.terranunit;

public class Game {
	public static void main(String[] args) {

		// 익명클래스
		//한번 쓰고 안 쓸 클래스를 쉽게 만드는 방법.
		// Stream API를 사용할 때 주로 사용하는 방법
		Mineable drone = new Mineable() {
			@Override
			public void mining() {
				System.out.println("드론이 자원을 채굴합니다.");
			}
		};
		drone.mining();
		
		//추상화되어있는 클래스 변수명 = new 구현된 클래스명();
		SpecailCommand marine = new Marine();
		Attackable scv = new Scv();
		
		marine.move();
		marine.steampack();
		marine.attack();
		
		scv.attack();
		scv.move();
		scv.patrol();
		scv.hold();
		//scv.mining(); 인터페이스에서 지원하지 않는 기능은 구현클래스에서 지원해도 사용할 수 없다. 
		//scv.steampack(); 
		
		Scv scv2 = new Scv();
		scv2.mining();
		
		move(scv);
	}
	
	public static void move(Attackable unit) {
		unit.attack();
		unit.move();
		unit.patrol();
		unit.hold();
		unit.stop();
		//unit.mining(); //The method mining() is undefined for the type Attackable
		
		/**
		 * 잘못된 호출방법. 인터페이스는 인터페이스에서 지원하는 기능만 구현클래스에서 구현해야 한다.
		 */
		if (unit instanceof Scv) {
			Scv scv = (Scv) unit;
			scv.mining();
		}
		
		//사용 가능한 방법 
		if(unit instanceof Mineable) {
			Mineable worker = (Mineable) unit;
			worker.mining();
		}
	}
}
