package fp_java.ch08.generatestream;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneratestreamExam {
	public static void main(String[] args) {
		// 배열로 스트림 만들기 1
		int[] numbers = { 2, 3, 5, 7, 11, 13 };
		Arrays.asList(numbers).stream() // Stream<int[]>
				.flatMapToInt(intArray -> Arrays.stream(intArray)) // IntStream
				.boxed() // Stream<Integer>
				.forEach(System.out::println);

		// 배열로 스트림 만들기 2

		Arrays.stream(numbers) // IntStream
				.boxed() // Stream<Integer>
				.forEach(System.out::println);

		String[] chars = { "A", "B", "C" };

		Arrays.asList(chars) // List<String>
				.stream() // Stream<String>
				.forEach(System.out::println);

		Arrays.stream(chars) // Steam<String>
				.forEach(System.out::println);
		// 파일로 스트림 만들기 1
		File textFile = new File("C:\\Java Exam", "java exam.txt");
		List<String> lines = null;
		try {
			lines = Files.readAllLines(textFile.toPath(), Charset.defaultCharset());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		if (lines != null) {
			lines.stream() // Stream<List>
					.forEach(System.out::println);
		}

		// 파일로 스트림 만들기 2
		// Auto closeable Try ~ catch
		try (Stream<String> streamLines = Files.lines(textFile.toPath(), Charset.defaultCharset())) {
			streamLines.forEach(System.out::println);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		// 리스트로 스트림 만들기
		List<Integer> numberList = List.of(1, 6, 4, 3, 2, 9);

		numberList.stream() // Stream<Integer>
				.map(i -> i * 2).forEach(System.out::println);

		// Map Data -> List Data 변경
		Map<String, String> menuMap = new HashMap<>();
		menuMap.put("빅맥", "13500");
		menuMap.put("빅맥2", "24500");
		menuMap.put("빅맥3", "35500");
		menuMap.put("빅맥4", "46500");
		menuMap.put("빅맥5", "57500");
		menuMap.put("빅맥6", "68500");
		menuMap.put("빅맥7", "79500");
		
		// menuMap의 key 로 구성된 List 만들어보기
		// Map을 Stream으로 변경하려면 entrySet을 이용해야 한다.
		List<String> menuName = menuMap.entrySet() // Set<Entry<Key, Value>> -> Set<Entry<String, String>>
										.stream() // Stream<Entry<String, String>>
										.map(entry -> entry.getKey()) //Stream<String>
										.collect(Collectors.toList()); //List<String>
		menuName.forEach(System.out::println);
	}
}
