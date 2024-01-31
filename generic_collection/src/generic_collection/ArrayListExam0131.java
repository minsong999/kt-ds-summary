package generic_collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam0131 {
	public static void main(String[] args) {
		// 로또 번호를 6개를 ArrayList에 할당하세요.
		// 1부터 45중 랜덤한 숫자를 만들어
		// ArrayList 인스턴스에 넣습니다.
		// 이때 생성된 난수의 값이 ArrayList 인스턴스에 이미 존재하는 값이라면, 인스턴스에 넣어서는 안됩니다.
		// 따라서 ArrayList 인스턴스의 값들은 모두 고유한 값이어야 합니다.
		// ArrayList 내부의 아이템 개수가 6이 될 때까지, 고유한 값들을 넣고
		// 출력하는 코드를 작성하세요.

		List<Integer> lottoNumList = new ArrayList<>();

		while (lottoNumList.size() < 6) {
			int lottoNum = (int) (Math.random() * 45) + 1;
			if(lottoNumList!=null && lottoNumList.isEmpty()) {
				lottoNumList.add(lottoNum);
			}
			System.out.println(1);
			//else {
			//	for(int i =0; i>lottoNumList.size(); i++) {
			//		System.out.println(1);
			//	}
			//}
			//
		}
		System.out.println(lottoNumList);

	}
}
