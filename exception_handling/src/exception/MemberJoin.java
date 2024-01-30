package exception;

import java.util.Scanner;

import exception_handling.exceptions.InvalidIdUserException;
import exception_handling.exceptions.UserIdLengthException;
import exception_handling.exceptions.AlreadyUseUserIdException;

public class MemberJoin {
	public static void join() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID를입력하세요.");
		String id = sc.nextLine();
		sc.close();

		if (id != null && (id.equals("system") || id.equals("root") || id.equals("admin"))) {
			throw new InvalidIdUserException(id + "는 사용할 수 없습니다.");
		} else if (id != null && id.equals("ktds")) {
			throw new AlreadyUseUserIdException(id + "는 사용할 수 없습니다.");
		} else if (id != null && id.length() < 8) {
			throw new UserIdLengthException("ID는 최소 8글자 이상 입력하세요.");
		} else if (id == null) {
			throw new InvalidIdUserException(id + "는 필수 입력 값입니다.");
		} else {
			System.out.println(id + "로 가입을 완료했습니다.");
		}

	}

	public static void main(String[] args) {
		MemberJoin memberJoin = new MemberJoin();
		memberJoin.join();
	}
}
