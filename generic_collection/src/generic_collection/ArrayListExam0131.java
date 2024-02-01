package generic_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListExam0131 {

	public static List<Integer> getLottoGame() {
		List<Integer> lottoNumList = new ArrayList<>();
		int lottoNum = 0; // 반복문 안에서는 변수 선언을 하지 않는다.

		while (lottoNumList.size() < 6) {
			lottoNum = (int) (Math.random() * 45) + 1;
			if (!lottoNumList.contains(lottoNum)) {
				lottoNumList.add(lottoNum);
			}
		}
		return lottoNumList;
	}

	public static void main(String[] args) {
		// 로또 번호를 6개를 ArrayList에 할당하세요.
		// 1부터 45중 랜덤한 숫자를 만들어
		// ArrayList 인스턴스에 넣습니다.
		// 이때 생성된 난수의 값이 ArrayList 인스턴스에 이미 존재하는 값이라면, 인스턴스에 넣어서는 안됩니다.
		// 따라서 ArrayList 인스턴스의 값들은 모두 고유한 값이어야 합니다.
		// ArrayList 내부의 아이템 개수가 6이 될 때까지, 고유한 값들을 넣고
		// 출력하는 코드를 작성하세요.
		// 5게임하기

		List<List<Integer>> lottoNumSet = new ArrayList<>();
		List<Integer> lottoNumList = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			lottoNumList = getLottoGame();
			lottoNumSet.add(lottoNumList);
		}

		for(List<Integer> lottoNumbers : lottoNumSet) {
			System.out.println(lottoNumbers);
		}
//		System.out.println(lottoNumList);
//		System.out.println(lottoNumSet);
	}
}
