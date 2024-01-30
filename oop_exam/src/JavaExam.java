import java.util.Scanner;

public class JavaExam {
	public static void main(String[] args) {
//		1. 변수 활용 문제
//	    정수형 변수 2개를 선언하고 값을 할당해본다.

		int num1;
		int num2;
		num1 = 1;
		num2 = 2;

//	2. 사칙 연산 문제 1
//	    정수형 변수 4개를 선언하고 값을 할당한다.
//	    값이 할당된 정수형 변수 4개의 합을 구해 새로운 정수형 변수에 할당한다.
//	    합이 할당된 변수의 값을 출력해본다.

		int num3;
		int num4;
		int num5;
		int num6;

		num3 = 303;
		num4 = 306;
		num5 = 301;
		num6 = 302;

		System.out.println(num3 + num4 + num5 + num6);
//
//	3. 사칙 연산 문제 2
//	    정수형 변수 2개를 선언하고 값을 할당한다.
//	    값이 할당된 정수형 변수 2개의 곱을 구해 새로운 정수형 변수에 할당한다.
//	    곱이 할당된 변수의 값을 출력해본다.
//

		int num7;
		int num8;
		num7 = 8;
		num8 = 33;
		int num9 = num7 * num8;
		System.out.println(num9);

//	4. 사칙 연산 문제 3
//	    정수형 변수 2개를 선언하고 값을 할당한다.
//	    값이 할당된 정수형 변수 2개의 나누기 몫을 구해 새로운 정수형 변수에 할당한다.
//	    나누기 몫이 할당된 변수의 값을 출력해본다.

		int num10;
		int num11;
		num10 = 32;
		num11 = 3;
		int num12 = num10 / num11;
		System.out.println(num12);

//
//	5. 사칙 연산 문제 4
//	    정수형 변수 2개를 선언하고 값을 할당한다.
//	    값이 할당된 정수형 변수 2개의 나누기 나머지를 구해 새로운 정수형 변수에 할당한다.
//	    나누기 나머지가 할당된 변수의 값을 출력해본다.

		int num13;
		int num14;
		num13 = 353;
		num14 = 42;
		int num15 = num13 % num14;
		System.out.println(num15);

//	    
//	6. 캐스팅 문제 1
//	    정수형 변수 2개를 선언하고 값을 할당한다.
//	    값이 할당된 정수형 변수 2개의 나누기 결과를 구해 새로운 실수형 변수에 할당한다.
//	    나누기 결과가 할당된 변수의 값을 출력해본다.

		int num16;
		int num17;
		num16 = 332;
		num17 = 3;
		double num18 = (double) (num16 / num17);
		System.out.println(num18);
//
//	7. 캐스팅 문제 2
//	    정수형 변수 2개를 선언하고 값을 할당한다.
//	    값이 할당된 정수형 변수 2개의 나누기 결과를 구해 새로운 실수형 변수에 할당한다.
//	    나누기 결과가 할당된 변수의 값을 출력해본다.
//	    단, 소수점 이하의 자리수는 2자리만 저장해 출력한다.
//	    예> 10.3333333 => 10.34
//
		int num19 = 335;
		int num20 = 3;
		double num21 = (double) (num19 * 100 / num20) / 100.00;
		System.out.println(num21);

//	8. 비교 연산자 문제
//	    실수형 변수 두 개를 선언하고 임의의 값을 할당한다.
//	    두 값 중 큰 수만 출력한다.

		double num22 = Math.random();
		double num23 = Math.random();
		if (num22 > num23) {
			System.out.println(num22);
		} else {
			System.out.println(num23);
		}

//
//	9. 비교 연산자 문제 2
//	    실수형 변수 세 개를 선언하고 임의의 값을 할당한다.
//	    세 값 중 가장 작은 수만 출력한다.

		double num24 = Math.random();
		double num25 = Math.random();
		double num26 = Math.random();
		double num27 = Math.min(num24, Math.min(num25, num26));
		System.out.println(num27);

//
//	10. 비교 연산자 문제 3
//	    실수형 변수 다섯 개를 선언하고 임의의 값을 할당한다.
//	    다섯 값의 평균보다 큰 수들을 출력한다.

		System.out.println("28");

		double num28 = Math.random();
		double num29 = Math.random();
		double num30 = Math.random();
		double num31 = Math.random();
		double num32 = Math.random();

		System.out.println(num28);
		System.out.println(num29);
		System.out.println(num30);
		System.out.println(num31);
		System.out.println(num32);

		double num33 = (num28 + num29 + num30 + num31 + num32);
		double num34 = num33 / 5;

		if (num28 > num34) {
			System.out.println(num28);
		}

		if (num29 > num34) {
			System.out.println(num29);
		}

		if (num30 > num34) {
			System.out.println(num30);
		}

		if (num31 > num34) {
			System.out.println(num31);
		}

		if (num32 > num34) {
			System.out.println(num32);
		}

//
//	11. 논리 연산자 문제
//	    정수형 변수 다섯 개를 선언하고 임의의 값을 할당한다.
//	    다섯 값 중 2, 5, 8의 배수인 것들만 출력한다.

		int num35 = (int) (Math.random() * 100);
		int num36 = (int) (Math.random() * 100);
		int num37 = (int) (Math.random() * 100);
		int num38 = (int) (Math.random() * 100);
		int num39 = (int) (Math.random() * 100);

		if (num35 % 2 == 0 || num35 % 5 == 0 || num35 % 8 == 0) {
			System.out.println(num35);
		}
		if (num36 % 2 == 0 || num36 % 5 == 0 || num36 % 8 == 0) {
			System.out.println(num36);
		}
		if (num37 % 2 == 0 || num37 % 5 == 0 || num37 % 8 == 0) {
			System.out.println(num37);
		}
		if (num38 % 2 == 0 || num38 % 5 == 0 || num38 % 8 == 0) {
			System.out.println(num38);
		}
		if (num39 % 2 == 0 || num39 % 5 == 0 || num39 % 8 == 0) {
			System.out.println(num39);
		}

//
//	12. 논리 연산자 문제 2
//	    정수형 변수 다섯 개를 선언하고 임의의 값을 할당한다.
//	    다섯 값 중 2 또는 5 또는 6의 배수인 것들만 출력한다.
		

		System.out.println("12번문제");
		int num40 = (int) (Math.random() * 100);
		int num41 = (int) (Math.random() * 100);
		int num42 = (int) (Math.random() * 100);
		int num43 = (int) (Math.random() * 100);
		int num44 = (int) (Math.random() * 100);

		if (num40 % 2 == 0 && num40 % 5 == 0 && num40 % 6 == 0) {
			System.out.println(num40);
		}
		if (num41 % 2 == 0 && num41 % 5 == 0 && num41 % 6 == 0) {
			System.out.println(num41);
		}
		if (num42 % 2 == 0 && num42 % 5 == 0 && num42 % 6 == 0) {
			System.out.println(num42);
		}
		if (num43 % 2 == 0 && num43 % 5 == 0 && num43 % 6 == 0) {
			System.out.println(num43);
		}
		if (num44 % 2 == 0 && num44 % 5 == 0 && num44 % 6 == 0) {
			System.out.println(num44);
		}

		
//
//	13. 반복문 while 문제
//	    안녕하세요? 를 5번 출력한다.
		
		int i=0;
		while(i<5) {
			System.out.println("안녕하세요");
			i++;
		}
//
//	14. 반복문 while 문제 2
//	    Scanner 이용.
//	    2의 배수만 입력하는 문제를 만든다.
//	    만약, 2의 배수가 아니거나 0 또는 음수를 입력하면
//	    "게임을 마칩니다" 를 출력하며 반복문을 종료한다.
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num % 2 != 0 || num <= 0) {
				break;
			}
		}
		
//
//	15. 반복문 while 문제 3
//	    Scanner 이용.
//	    정수형 변수 enemyHealthPoint 를 만들고 Scanner의 nextInt() 함수를 이용해 값을 할당한다.
//	    무한히 반복을 하면서 난수를 생성해 enemyHealthPoint의 값을 감소 시킨다.
//	    만약 enemyHealthPoint의 값이 0이 되거나 음수가 되면 "Victory!" 를 출력하며 반복문을 종료한다.
//
//	16. 반복문 for 문제
//	    1 부터 10 까지의 수를 출력한다.
//
//	17. 반복문 for 문제 2
//	    1 부터 50 중 30~39 까지의 숫자만 출력한다.
//
//	18. 반복문 for 문제 3
//	    구구단 2, 3단을 출력한다.
//
//	19. 반복문 for 문제 4
//	    구구단 2 ~ 9 단을 출력한다.
//
//	20. 반복문 for 문제 5
//	    1 부터 1000 중 소수(1과 자신으로만 나눌 수 있는 수)만  출력한다.
//
//
//	21. Animal 클래스를 만들어보세요.
//		- 멤버변수
//			- 이름
//			- 종류 (강아지, 고양이 등등)
//			- 울음소리
//		- 메소드
//			- 생성자
//			- 소개하기
//			- 울기
//
//	22. Animal 클래스로 여러가지 인스턴스를 만들어보세요.
//		- 강아지 인스턴스 여러개
//		- 고양이 인스턴스 여러개 등등
//
//	23. Cat 클래스를 만들어보세요
//		- 속성
//			- 이름
//			- 종류 (코리안 숏헤어, 노르웨이 숲, 메인쿤, 렉돌 등등)
//			- 크기 (대형, 중형, 소형 등등)
//		- 기능
//			- 생성자
//			- 소개하기
//			- 울기
//
//	24. Cat 클래스로 여러가지 인스턴스를 만들어보세요
//
//	25. Animal 클래스를 상속해 Dog 클래스를 만들고, IS A 관계를 이용해 여러가지 인스턴스를 만들어보세요.
//
//	26. AnimalHotel 클래스를 만들어보세요.
//		- 멤버변수
//			- 동물 목록 (Animal[])
//		- 메소드
//			- 입소하기
//			- 퇴소하기
//			- 동물목록 출력하기
//			- n번째에 있는 동물을 반환하기
//
//
//	27. Product 데이터클래스를 만들어보세요.
//		- 멤버변수
//			- 제품명
//			- 가격
//			- 브랜드
//		- 메소드
//			- 생성자
//			- 겟터/셋터
//
//	28. Product 인스턴스를 만들어 보세요.
//
//	29. Product[] 배열 인스턴스에 Product 를 추가해보세요.
//
//	30. Shop 클래스를 만들어보세요.
//		- 멤버변수
//			- Product[] (상품목록)
//			- 매출금액
//		- 메소드
//			- 제품명으로 Product 판매하기
//	          - 제품을 판매하면 매출금액이 증가합니다.
//			- 매출금액 반환하기
//			- Product[] 내의 모든 항목 출력하기   
//	    

	}
}
