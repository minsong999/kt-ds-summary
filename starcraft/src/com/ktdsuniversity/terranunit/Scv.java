package com.ktdsuniversity.terranunit;

/**
 * 구현 클래스
 */
public class Scv implements Attackable, Mineable{

	@Override //오버라이드 어노테이션을 안 붙여도 동작은 되나 성능이 떨어진다.
	public void mining() {
		System.out.println("자원을 캡니다.");
	}
	
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
}


