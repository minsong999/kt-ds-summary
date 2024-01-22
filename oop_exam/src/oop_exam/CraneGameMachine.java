package oop_exam;

//import java.util.Random;

public class CraneGameMachine {
	boolean isInsertCoin;
	int dolls;

	public void insertCoin() {
		System.out.println("코인을 넣었습니다.");
		if (dolls >= 0) {
			isInsertCoin = true;
		}
	}

	public int doGame() {
		System.out.println("게임 실행");
		if (!isInsertCoin) {
			System.out.println("코인이 부족합니다.");
			return 0;
		}

//		Random random = new Random();
//		int result = random.nextInt(2);; 

		int result = (int) (Math.random() * 2);
		dolls -= result;
		isInsertCoin = false;
		return result;

//		if(Math.random() * 2 >= 1) {
//			dolls--;
//			isInsertCoin = false;
//			return 1;
//		}else {
//			isInsertCoin = false;
//			return 0;
//		}				
	}

}
