package hello_java_world;

public class ForExample {
	public static void main(String[] args) {
		/*
		 * for 문법 for (초기값; 반복조건; 증감식){ 반복할코드 } 초기값 생성 -> 반복코드 -> 증감식 -> 반복조건 -> 반복코드
		 * ->...
		 */

		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}

		// 0부터 100까지 짝수만 출력
//		for (int i = 0; i < 101; i += 2) {
//			if (i > 0) {
//				System.out.println(i);
//			}
//		}

		// 구구단 2 ~ 9 까지 반복
		for (int i = 2; i < 10; i++) {

			// 구구단의 배수를 사용하기 위해 반복
			// 1 ~ 9 까지 반복
			for (int j = 1; j < 10; j++) {
				// 2 X 1 = 2
				// 2 X 2 = 4
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		
		//

	}
}
