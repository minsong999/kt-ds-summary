package oop_exam;

public class Hello {

	// public static void 메소드이름(파라미터타입, 파라미터명) -- 메소드이름은 소문자로 시작
	/**
	 * "안녕하세요"를 출력하는 메소드 정의
	 */
	public static void sayHello() {
		System.out.println("안녕하세요?");
	}
	
	/**
	 * 이름을 파라미터로 전달하면, "이름씨, 안녕하세요"를 출력한다.
	 * @param name 출력하고 싶은 이름.
	 */
	public static void printName(String name) {
		System.out.println(name +  "씨, 안녕하세요.");
	}
	
	/**
	 * 클래스 파일을 실행시키는 메소드
	 * @param args (파라미터)
	 */
	public static void main(String[] args) {
		sayHello(); //메소드를 호출.
		System.out.println("반갑습니다.");
		
		printName("그루트");
		printName("아이언맨");
		printName("헐크");
		printName("스타크");
		
	}
}
