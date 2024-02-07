package main;

import java.util.Scanner;

import dao.Contact;

public class contactMain {
	public static void main(String[] args) {
		Contact contact = new Contact();

		contact.selectAllContact();
		contact.selectContact(0);
		contact.deleteUser(4);
		contact.BlockUser(0);
		contact.getBirthContactList(15);

		System.out.println("연락처 프로그램 실행");
		boolean isExit = false;
		while (!isExit) {
			System.out.println("연락처 기능 메뉴\r\n" 
								+ "1.연락처 등록\r\n" 
								+ "2. 연락처 목록 조회\r\n" 
								+ "3. 연락처 상세 조회\r\n"
								+ "4. 연락처 삭제\r\n" 
								+ "5. 차단 기능\r\n" 
								+ "6. 15일 이내 생일자 조회\r\n" 
								+ "7. 연락처 수정\r\n"
								+ "8. 프로그램 종료"
								);
			Scanner sc = new Scanner(System.in);
			
			isExit = true;
		}
	}
}
