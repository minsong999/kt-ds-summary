package com.ktdsuniversity.terranunit;

/**
 * 인터페이스 클래스에서 메소드 정의 시 abstract 키워드는 생략이 가능하다.
 */
public interface Unit {

	/**
	 * 이동
	 */
	public void move();

	/**
	 * 정지
	 */
	public void stop();

	/**
	 * 정지
	 */
	public void hold();

	/**
	 * 정찰
	 */
	public void patrol();

}
