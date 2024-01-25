package oop_exam;

import java.util.Scanner;

public class StringExam2 {
	public void aamain(String args[]) {

		Scanner keyboard = new Scanner(System.in);
		String nextText = "";
		String startText = "자전거";
		int gamePalyCount = 1;

		while (true) {
			nextText = keyboard.nextLine();
			nextText = nextText.trim();

//			if (nextText.length() >= 3) {
//				if (startText.substring(startText.length() - 1, startText.length()).equals(nextText.substring(0, 1))) {
//					startText = nextText;
//					gamePalyCount++;
//				} else {
//					break;
//				}
//			} else {
//				break;
//			}

			if (nextText.length() < 3) {
				break;
			}

			if (startText.substring(startText.length() - 1, startText.length()).equals(nextText.substring(0, 1))) {
				startText = nextText;
				gamePalyCount++;
			} else {
				break;
			}
		}
		System.out.println("게임횟수 : " + gamePalyCount);
		keyboard.close();
	}
	
	public static void main(String args[]) {
		//문자열 비교
		String str1 = "한글";
		String str2 = "한글";
		
		System.out.println(str1 == str2);
		
		Scanner keyboard = new Scanner(System.in);
		
		String str3 = keyboard.nextLine(); //한글
		String str4 = keyboard.nextLine(); //한글
		
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str3 == str4); // 메모리 주소
		System.out.println(str3.equals(str4)); //값을 비교
		
	}
}
