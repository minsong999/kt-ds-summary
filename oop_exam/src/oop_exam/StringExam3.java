package oop_exam;

import java.util.ArrayList;

public class StringExam3 {
	public static void changeStr(String str) {
		str += "바뀌었을까요";
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		String message = "원본입니다.";
		changeStr(message);
		System.out.println(message);

		//StringBuffer 선언
		StringBuffer sb = new StringBuffer();
	
		sb.append("i am\n");
		sb.append("손오공\n");
		sb.append("꽃\n");
		sb.append("\"내 이름은\"김민성\"입니다\"");
		
		String str = sb.toString();
		System.out.println(str);
	}
}
