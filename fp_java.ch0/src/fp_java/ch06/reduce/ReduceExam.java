package fp_java.ch06.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceExam {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(9);

		// 총 합계
		int sumResult = numbers.stream().reduce(0, (sum, item) -> sum + item);
		System.out.println(sumResult);

		// 최대값
		int maxResult = numbers.stream().reduce(Integer::max).orElse(0);
		System.out.println(maxResult);
		
		Optional<Integer> maxResult2 = numbers.stream().reduce((a, b) -> Math.max(a, b));
		System.out.println(maxResult2.orElse(0));
		
		// 최소값
		int minResult = numbers.stream().reduce(Integer::min).orElse(0);
		System.out.println(minResult);
	}
}
