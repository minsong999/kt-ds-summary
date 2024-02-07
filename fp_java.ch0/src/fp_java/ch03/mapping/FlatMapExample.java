package fp_java.ch03.mapping;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Stream.map 내부에서 새로운 Stream 을 반환할 때 사용하는 방법
 */
public class FlatMapExample {
	public static void main(String[] args) {

		// word.txt 파일 읽어서 List로 변환하기
		File file = new File("C:\\dev_program\\eclipse_workspace\\fp_java.ch0\\src\\fp_java\\ch03\\mapping\\word.txt");
		List<String> wordList = null;
		try {
			wordList = Files.readAllLines(file.toPath(), Charset.forName("UTF-8"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

//		System.out.println(wordList);
//		for (String line : wordList) {
//			String[] letterArray = line.split("");
//
//			for (String letter : letterArray) {
//				System.out.println(letter);
//			}
//		}

		// FlatMap
		// map 내부에서 stream을 반환시키는 중일 때
		// flatMap을 사용하면
		// 반환된 Stream이 원본 Stream을 대체한다.
		// Stream<Stream<String>> <- 스트림 안에 스트림이 있는 형태를 Stream<String>처럼 변환시켜준다.
		String joinedLetter = wordList.stream() // Stream<String>
							//		  .peek(line -> System.out.println(line))
									  .map(line -> line.split("")) // Stream<String[]>
							//		  .peek(letterArray -> {
							//		  	System.out.println("Array: " + letterArray);
							//		  	for (String letter : letterArray) {
							//		  		System.out.println("Letter:" + letter);
							//		  	}
							//		  })
							//		  .map(letterArray -> Arrays.stream(letterArray)) //Stream<Stream<String>>
									  .flatMap(letterArray -> Arrays.stream(letterArray)) // Stream<String>
							//		  .peek(letter -> System.out.println("peek: " + letter))
									  .distinct() // 중복 제거
							//		  .forEach(letter -> System.out.println(">" + letter))
									  .collect(Collectors.joining()) //한글자씩 떨어진 글자들을 하나의 스트링으로 모아준다.
									  ;
		
		System.out.println(joinedLetter);

	}
}
