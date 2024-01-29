package com.ktdsuniversity.terranunit;

public class Marine implements SpecailCommand{

	@Override
	public void move() {
		System.out.println("이동");
	}

	@Override
	public void stop() {
		System.out.println("정지");
	}

	@Override
	public void hold() {
		System.out.println("홀드");
	}

	@Override
	public void patrol() {
		System.out.println("정찰");
	}
	
	@Override
	public void attack() {
		System.out.println("공격");
	}

	@Override
	public void steampack() {
		
	}
	
	public static void main(String[] args) {
		SpecailCommand marine1 = new Marine();
		Unit marine2 = new Marine();
		Attackable marine3 = new Marine();
		
		marine1.steampack();
		marine2.move();
		marine3.attack();
		
		//marine3.steampack(); <- marin3은 attackable이라 스팀팩 사용 불가
	}
}
