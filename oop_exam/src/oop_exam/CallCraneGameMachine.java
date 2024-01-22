package oop_exam;

public class CallCraneGameMachine {
	public static void main(String[] args) {
		CraneGameMachine craneGameMachine = new CraneGameMachine();
		craneGameMachine.dolls = 2;
		int result = 0;

		craneGameMachine.insertCoin();
		result = craneGameMachine.doGame();

		System.out.println("남은 인형 수: " + craneGameMachine.dolls);
		System.out.println("뽑은 인형 수: " + result);
		
		craneGameMachine.insertCoin();
		result = craneGameMachine.doGame();

		System.out.println("남은 인형 수: " + craneGameMachine.dolls);
		System.out.println("뽑은 인형 수: " + result);
		
		result = craneGameMachine.doGame();

		System.out.println("남은 인형 수: " + craneGameMachine.dolls);
		System.out.println("뽑은 인형 수: " + result);

		craneGameMachine.insertCoin();
		result = craneGameMachine.doGame();

		System.out.println("남은 인형 수: " + craneGameMachine.dolls);
		System.out.println("뽑은 인형 수: " + result);

	}

}
