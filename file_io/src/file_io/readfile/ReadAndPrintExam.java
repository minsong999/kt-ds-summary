package file_io.readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ReadAndPrintExam {
	public static void main(String[] args) {
		File file = new File("C:\\Java Exam", "Java Exam.txt");
		if (file.exists() && file.isFile()) {
			FileReader reader = null;
			BufferedReader bufferedReader = null;

			try {
				// 파일을 바이트 단위로 읽어오는 FileReader를 선언
				reader = new FileReader(file, Charset.forName("UTF-8"));
				// 파일을 라인 단위로 읽어오는 BufferedReader를 선언
				bufferedReader = new BufferedReader(reader);
				// 파일을 라인 단위로 읽어와 할당하기 위한 String 변수 선언
				String line = null;
				// 파일이 끝날 때까지 반복하며 line 변수에 한줄씩 읽어오기
				while ((line = bufferedReader.readLine()) != null) {
					// 읽어온 라인을 출력
					System.out.println(line);
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally { // 리더를 닫을 때는 리더 할당의 역순으로 닫아준다.
				// 파일을 끝까지 읽었거나 예외가 발생한 경우 BufferedReader를 닫아준다.
				if (bufferedReader != null) {
					try {
						bufferedReader.close();
					} catch (IOException ioe) {
						ioe.printStackTrace();
					}
				}
				// 파일을 끝까지 읽었거나 예외가 발생한 경우 FileReader를 닫아준다.
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException ioe) {
						ioe.printStackTrace();
					}
				}

			}

		}
	}
}
