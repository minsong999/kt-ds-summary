package file_io.readfile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * JAVA 1.8 버전 이상에서 사용할 수 있는 파일 읽기 예제. new io 사용.
 */

public class NewIOReadAndPrintExam {
	public static void main(String[] args) {
		File file = new File("C:\\Java Exam", "Java Exam.txt");
		if (file.exists() && file.isFile()) {
			List<String> fileLine = new ArrayList<>();
			try {
				fileLine.addAll(Files.readAllLines(file.toPath(), Charset.forName("UTF-8")));
			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}

			for (String line : fileLine) {
				System.out.println(line);
			}
		}
	}
}
