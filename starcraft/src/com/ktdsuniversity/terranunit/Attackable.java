package com.ktdsuniversity.terranunit;

/**
 * 공격 가능한 유닛 인터페이스
 * 인터페이스는 인터페이스만 상속할 수 있다.
 * 인터페이스의 명은 형용사로 짓는게 원칙이지만 보통 명사로 짓는다. 
 */
public interface Attackable extends Unit{

	/**
	 * 공격
	 */
	public void attack();
}
