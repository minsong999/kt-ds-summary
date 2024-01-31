package generic_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		//선언 - 중복되는 값이존재하지 않는 리스트(인덱스를 통해 값 구해오는 것은 불가능하다.)
		Set<Integer> numbers = new HashSet<>();
		
		//add - 중복되는 값 넣기 불가능
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		
		//foreach문은 사용가능하나 인덱스를 이용한 for문은 불가능하다
		for (int n : numbers) {
			System.out.println(n);
		}
		
		//remove - 값이 일치하는 것을 지움
		numbers.remove(3);
		System.out.println(numbers);
		
		//clear
		numbers.clear();
		System.out.println(numbers);
		
		//isEmpty 
		System.out.println(numbers.isEmpty());
		//contains
		
		//addAll(List) - List나 Set을 넣을 수 있다. List 넣을 시 중복된 값 제거
		numbers.add(2);
		numbers.add(4);
		numbers.add(3);
		
		List<Integer> scoreList = new ArrayList<>();
		scoreList.add(3);
		scoreList.add(9);
		scoreList.add(10);
		
		numbers.addAll(scoreList);
		System.out.println(numbers);
		
	}
}
