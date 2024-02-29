package com.ktdsuniversity.gogang;

import com.ktdsuniversity.gogang.service.UsersService;

public class Handler {
	public static void main(String[] args) {
		UsersService usersService = new UsersService();

		boolean isUsersCreated=usersService.createNewActor("김민성", "minsong99@naver.com", "Y", "1234", "2024-02-29");

		if(isUsersCreated){
			System.out.println("유저 생성 성공");
		}else {
			System.out.println("유저 생성 실패");
		}

	}
}
