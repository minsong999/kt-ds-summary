package oop_exam;

/**
 * 교재 168번 문제
 */
public class ReturnMethodQuiz1 {
	/**
	 * 수행시간(초)를 파라미터로 받아서, 분(Minutes)만 구해 변환시킨다.
	 * @param processTime 수행시간(초)
	 * @return 수행시간(초)를 분(Minutes)으로 변환한 결과
	 */
	public static int getMinutes(int processTime) {
		int processMinutes = processTime / 60;
				return processMinutes;
	}
	
	/**
	 * 수행시간(초)를 파라미터로 받아서, 분을 제외한 나모지 초(Seconds)만 구해 반환시킨다.
	 * @param processTime 수행시간(초)
	 * @return 수행시간(초)를 분(Seconds)를 제외한 나머지 초(Seconds) fh'
	 */
	public static int getSeconds(int processTime) {
		int processSeconds = processTime % 60;
		return processSeconds;
	}
	
	public static void main(String[] args) {	
		int processTie = 245;
		
		int minutes = getMinutes(processTie);
		int seconds = getSeconds(processTie);
		
		System.out.println(minutes);
		System.out.println(seconds);
		/*
		 * 산술연산자를 이용해 processtime을 분, 초로 구한다음
		 * minutes 와 seconds 변수에 할당하고
		 * 출력해보세요.
		 */
	}
}
