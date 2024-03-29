package oop_exam;

/**
 * 교재 170번 문제
 */
public class ReturnMethodQuiz4 {

	public static int getFlightFare(int age, int adultOneWayFlightFare, int kidOneWayFlightFare) {
		int flightFare = 0;
		if (age >= 19) {
			flightFare = adultOneWayFlightFare;
		} else {
			flightFare = kidOneWayFlightFare;
		}
		return flightFare;
	}

	/**
	 * 변수로 넘어온 나이로 성인멤버 숫자 구하기
	 * 
	 * @param father   아버지 나이
	 * @param mother   어머니 나이
	 * @param daughter 딸 나이
	 * @return adultMember 성인멤버 숫자
	 */
	public static int getAdultMember(int father, int mother, int daughter) {
		int adultMember = 0;
		if (father >= 19) {
			adultMember++;
		}
		if (mother >= 19) {
			adultMember++;
		}
		if (daughter >= 19) {
			adultMember++;
		}
		return adultMember;
	}

	/**
	 * 변수로 넘어온 나이로 아이 숫자 구하기
	 * 
	 * @param father   아버지 나이
	 * @param mother   어머니 나이
	 * @param daughter 딸 나이
	 * @return kidsMember 아이 숫자
	 */
	public static int getKidMember(int father, int mother, int daughter) {
		int kidsMember = 0;
		if (father < 19) {
			kidsMember++;
		}
		if (mother < 19) {
			kidsMember++;
		}
		if (daughter < 19) {
			kidsMember++;
		}
		return kidsMember;
	}

	/**
	 * 항공권 가격 구하여 예산 내로 여행을 갈 수 있는지 여부
	 * 
	 * @param adultMember           성인 숫자
	 * @param kidsMember            아이 숫자
	 * @param adultOneWayFlightFare 어른 요금
	 * @param kidOneWayFlightFare   아이 요금
	 * @param money                 예산
	 * @return 예산 내면 true, 초과하면 false
	 */
	public static boolean getCanTravle(int adultMember, int kidsMember, int adultOneWayFlightFare,
			int kidOneWayFlightFare, int money) {

		boolean canTravle = true;
		int totalFlightFare = adultMember * adultOneWayFlightFare + kidsMember * kidOneWayFlightFare;
		if (totalFlightFare <= money) {
			canTravle = true;
		} else {
			canTravle = false;
		}

		return canTravle;
	}

	public static void main(String[] args) {
		int money = 1_000_000;

		int father = 40;
		int mother = 36;
		int daughter = 11;

		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;

		int adultMember = getAdultMember(father, mother, daughter);
		int kidsMember = getKidMember(father, mother, daughter);

		boolean getTravle = getCanTravle(adultMember, kidsMember, adultOneWayFlightFare, kidOneWayFlightFare, money);
		if (getTravle) {
			System.out.println("여행가자!");
		} else {
			System.out.println("다음에가자 ㅠㅠ");
		}
		
		int flightFare = getFlightFare(father, adultOneWayFlightFare, kidOneWayFlightFare);
		flightFare += getFlightFare(mother, adultOneWayFlightFare, kidOneWayFlightFare);
		flightFare += getFlightFare(daughter, adultOneWayFlightFare, kidOneWayFlightFare);
		
		if(money >= flightFare){
			System.out.println("여행가자!");
		} else {
			System.out.println("다음에가자 ㅠㅠ");
		}

		/*
		 * 3인 가족이 100만원으로 비행기를 타고 편도 여행을 가려합니다. 부모님의 나이는 각각 40, 36세이며, 딸의 나이는 11세입니다.
		 * 성인의 비행요금은 30만원 아동의 비행요금은 12만원입니다. 3인 가족은 여행을 떠날 수 있을까요? 여행을 떠날 수 있다면 "여행가자!"
		 * 여행을 떠날 수 없다면 "다음에가자 ㅠㅠ" 를 출력해보세요.
		 */

	}
}
