package oop_exam;

/**
 * 배열 실습
 */
public class ArrayExam {
	public static void main(String[] args) {
		int[] scoreArray = new int[7]; //타입[] 배열명 = new 타입[배열의길이];
		
		scoreArray[0] = 1;
		scoreArray[1] = 2;
		scoreArray[2] = 3;
		scoreArray[3] = 4;
		scoreArray[4] = 5;
		scoreArray[5] = 6;
		scoreArray[6] = 7;
		
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.println(scoreArray[i]);
		}
		
		for(int score : scoreArray) { //scoreArray를 돌면서 인덱스의 값을 int score에 할당
			System.out.println("for each: "+score);
		}
		
		//속도는 for each가 빠르나 반복문 내에서 인덱스 번호가 필요하다면 for문을 쓴다.
		
		//System.out.println(scoreArray[-1]); 
		//java.lang.ArrayIndexOutOfBoundsException

		
		String[] stringArray = new String[3];
		//System.out.println(stringArray);
		stringArray[0] = "권철우";
		stringArray[1] = "장민창";
		
		for(int i=0; i<stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		for(String name : stringArray) {
			System.out.println(name);
		}
		
		//System.out.println(stringArray);
		
	}
}
