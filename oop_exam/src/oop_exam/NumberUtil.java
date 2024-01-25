package oop_exam;

/*
 * 숫자와 관련된 유틸리티
 */
public class NumberUtil {

	/**
	 * 문자를숫자로 변경한다.
	 * 
	 * @param str 숫자형태의 문자열
	 * @return 문자를 숫자로 변경한 결과 (숫자형태의 문자가 아니라면, NumberFormatExeption 에러 발생
	 */
	public static int convertToInt(String str) {
		int number = 0;
		// 숫자를 문자로 바꾸는 방법.
		number = Integer.parseInt(str);
		return number;
	}
	
	/**
	 * 문자를 숫자로 변경한다.
	 * @param str 숫자형태의 문자열
	 * @param defaultValue defaultValue str이 숫자형태의 문자가 아닐때, 반환될 값
	 * @return 문자를 숫자로 변경한 결과
	 */
	public static int convertToInt(String str, int defaultValue) {
		int number = 0;
		// 숫자를 문자로 바꾸는 방법.
		try {
			number = Integer.parseInt(str);
		}catch(NumberFormatException e) {
			return defaultValue;
		}
		return number;
	}

	public static void main(String args[]) {
		String str = "10000";
		int number = NumberUtil.convertToInt(str);
		System.out.println(number);

		str = "abd";
		number = NumberUtil.convertToInt(str, -1);
		System.out.println(number);
	
	}
	
}
