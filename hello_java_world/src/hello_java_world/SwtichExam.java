package hello_java_world;

public class SwtichExam {
	public static void main(String[] Args) {
	
		int value=0;
		System.out.println();
		// switch (상태값) {}
		// 상태값 : 숫자 혹은 문자열.
		switch(value) {
		
			//현재 상태값(value)의 값이 0이라면 여기부터 시작해라
			case 0	:
				System.out.println("현재 상태값은 0입니다.");
				//현재 상태값(value)의 값이 0이라면 여기부터 시작해라				
			case 1:
				System.out.println("현재 상태 값은 1입니다.");
				break;
				//현재 상태값(value)의 값이 1이라면 여기부터 시작해라
			case 2:
				System.out.println("현재 상태 값은 2입니다.");
				//현재 상태값(value)의 값이 2이라면 여기부터 시작해라
			default: 
				System.out.println("흐름 종료");
				//모든 흐름이 종료되었을 때 가장 마지막에 실행되었습니다.\				
		}
		
		String status = "뚜껑을 연다";
		switch (status) {
		case "뚜껑을 연다" :
			System.out.println("밥솥을 꺼내세요.");
		case "밥솥을 꺼낸다" :
			System.out.println("쌀을 꺼내세요.");
		case "쌀을 꺼낸다" :
			System.out.println("밥솥에 쌀을 부으세요.");
		case "밥솥에 쌀을 붓는다" :
			System.out.println("물을 부으세요.");
		}
	}
	
}
