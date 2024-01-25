package oop_exam;

import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class StringExam {
	public static void main(String args[]) {
		//해당 문자열이 문자열 안에 존재하는지 확인
		String address ="서울특별시 서초구 효령로 176";
		boolean isSeoul = address.contains("서울");
		System.out.println(isSeoul);
		
		//문자열이 특정 문자열로 시작하거나 끝나는지 확인
		boolean isStart서울 = address.startsWith("서울");
		System.out.println(isStart서울);
		
		boolean isEnd176 = address.endsWith("176");
		System.out.println(isEnd176);
		
		//문자열이 같은지 확인
		String name = "ktdsuniversity";
		boolean isEqual = name.equals("ktdsuniversity");
		System.out.println(isEqual);
		
		boolean isEqualIgnoreCase = name.equalsIgnoreCase("ktdsuniversity");
		System.out.println(isEqualIgnoreCase);
		
		//문자열이 몇번째 인덱스에 있는지 확인
		String alphabets = "rijirg";
		int letterCIndex = alphabets.indexOf("g");
		System.out.println(letterCIndex);
		
		int letterJIRIndex = alphabets.indexOf("jir");
		System.out.println(letterJIRIndex);
		
		//스트링 길이
		System.out.println(alphabets.length());
		
		//문자열이 특정 정규식을 통과하는지 확인
		String phone ="01083833211";
		boolean isNumber = phone.matches("^[0-9]+$");
		System.out.println(isNumber);
		
		//문자열 변경
		String message = "안녕. 홍홍길동아. 안녕히 가세요.";
		message = message.replace("홍홍", "홍");
		System.out.println(message);
		
		phone ="010-8383-3211";
		phone = phone.replaceAll("[^0-9]","");
		System.out.println(phone);
		
		//문자열 잘라 배열에 넣기
		phone ="010-8383-3211";
		String[] phoneArea = phone.split("-");
		System.out.println(phoneArea[0]);
		System.out.println(phoneArea[1]);
		System.out.println(phoneArea[2]);
		
		//문자열 n번째에서 m번째까지 자르기
		String now =LocalDateTime.now() +"";
		String year=now.substring(0, 4);
		String month=now.substring(5, 7);
		String day=now.substring(8, 10);
		
		System.out.println(now);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		
		//문자열 좌우 공백 제거
		String text= "           어이쿠 ";
		text = text.trim();
		System.out.println(text);
		
	}
}
