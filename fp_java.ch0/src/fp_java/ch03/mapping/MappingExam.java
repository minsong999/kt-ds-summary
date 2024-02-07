package fp_java.ch03.mapping;

import java.util.Arrays;
import java.util.List;

public class MappingExam {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java8", ".NET FRAMEWORK", ".NET CORE", "C#");
		words.stream()
			 .map((String str) -> str.length()) // Stream<Integer>
			 .forEach((Integer length) -> System.out.println(length));
		
	}
}
