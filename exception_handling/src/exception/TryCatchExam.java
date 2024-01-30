package exception;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import exception_handling.exceptions.ReadFailException;

public class TryCatchExam {

	// 예외처리 위임하기
	public static List<String> readFile(File file) throws IOException {
		return Files.readAllLines(file.toPath());
	}
	
	public static List<String> readFile2(File file){
		try {
			return Files.readAllLines(file.toPath());
		} catch (IOException ioe) {
			ioe.printStackTrace();
			throw new ReadFailException("파일을 읽을 수 없습니다.", ioe);
		}
	}

	public static int convertToInt(String str) throws Exception {
		try {
			int number = Integer.parseInt(str);
			return number;
		} catch (NumberFormatException nfe) {
			// ReferenceType Instance
			// 사용자 정의 예외 처리(Exception 으로 던질 때에는 메소드 뒤에 throws Exception을 붙여줘야 한다.)
			Exception exception = new Exception(str + "는 숫자로 변환할 수 없습니다.", nfe);
			// System.out.println("실행순서 체크 1");
			throw exception; // 예외를 던지고 메소드를 종료시킨다.
			// Exception exception = new NumberFormatException();
		} finally {
			System.out.println("변환이 완료되었습니다."); // throw exception 전에 실행된다.
		}
		// return 0;
	}

	public static void main(String[] args) throws IOException {
		
		File imageFile2 = new File("C:\\dev_program\\eclipse_workspace\\JAVA 연습문제.txtqqq");
		readFile2(imageFile2);
		
		System.out.println("-----------------------------------------------------------");
		
		try {
			int a = convertToInt("예외는여");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// 시스템 드라이브에서 특정 경로에 있는 파일 또는 폴더를 읽어온다.
		File imageFile = new File("C:\\dev_program\\eclipse_workspace\\JAVA 연습문제.txtqqq");
		
		
		
		try {
			List<String> str = Files.readAllLines(imageFile.toPath());
			System.out.println(str);
			// catch문에 (Exception e)로 쓰면 안 된다. - 코드품질검사...
		} catch (IOException ioe) {
			String message = ioe.getMessage();
			System.out.println(message);
			ioe.printStackTrace();
		} finally {
			System.out.println("File을 읽고 Finally가 실행되었습니다.");
		}
//
//		// 두 가지 이상의 try catch가 필요한 경우 --java 1.8 이후 버전에서는 같은 코드를 사용할 경우 아래처럼 쓸 수 있다.
//		try {
//			Class.forName("IfArrayIndexOutOfBoundsException");
//			Files.readAllLines(imageFile.toPath());
//		} catch (ClassNotFoundException | IOException e) {
//			String message = e.getMessage();
//			System.out.println(message);
//			e.printStackTrace();
//		} finally {
//			System.out.println("");
//		}
//
//		// 두 가지 이상의 try catch가 필요한 경우 - catch를 여러번 쓰면 된다. --java 1.7까지
//		try {
//			Class.forName("IfArrayIndexOutOfBoundsException");
//			Files.readAllLines(imageFile.toPath());
//		} catch (ClassNotFoundException e) {
//			String message = e.getMessage();
//			System.out.println(message);
//			e.printStackTrace();
//		} catch (IOException ioe) {
//			ioe.printStackTrace();
//		} finally {
//			System.out.println("");
//		}
	}
}
//	
