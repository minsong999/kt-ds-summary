package file_io.fileinfo;

import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileInfo {
	public static void main(String[] args) {
		// 파일 클래스는 파일과 폴더(디렉토리) 둘 다 사용 가능하다.
		File file = new File("C:\\Java Exam", "Java Exam.txt");
		File file2 = new File("C:\\Java Exam");

		// 파일이 존재하면 true, 아니면 false
		boolean isFileExists = file.exists();
		System.out.println("파일의 존재 여부: " + file.exists());

		// 파일이 파일객체이면 true, 아니면 false
		boolean isFile = file.isFile();
		System.out.println("파일인지 여부: " + isFile);

		// 파일이 폴더객체 true, 아니면 false
		boolean isDirectory = file2.isDirectory();
		System.out.println("폴더인지 여부: " + isDirectory);

		// File 인스턴스가 가르키고 있는 폴더 또는 파일의 전체 경로
		String filePath = file.getAbsolutePath();
		System.out.println("파일의 경로: " + filePath);

		// File 인스턴스가 가르키고 있는 것이 폴더라면 폴더의 이름 파일이라면 파일의 확장자를 포함한 파일의 이름
		String fileName = file.getName();
		String fileName2 = file2.getName();

		System.out.println("파일의 이름: " + fileName);
		System.out.println("폴더의 이름: " + fileName2);

		// File 인스턴스가 가르키고 있는 파일의 크기(byte) window에서는 *1024 나머지운영체제에서는 *1000
		long fileSize = file.length();
		System.out.println("파일의 사이즈: " + fileSize);

		// 파일이 수정된 날짜 long타입 - 1970-01-01 00:00:00 부터 흘러간 초 * 1000
		long fileLastModifyTime = file.lastModified();
		Date date = new Date(fileLastModifyTime);
		String pattern = "yyyy-MM-dd HHmmss"; // hhmmss로 시간,분,초만 뽑기도 가능
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		System.out.println("수정된 날짜: " + formatter.format(date));

		// file 인스턴스의 부모(상위) 폴더의 경로(문자열)
		String parentPath = file.getParent();
		System.out.println("부모객체의 경로 문자열: " + parentPath);

		// file 인스턴스의 부모(상위) 폴더의 새로운 File 인스턴스
		File parentFile = file.getParentFile();

		// File 인스턴스가 폴더일 때 폴더 내부에 존재하는 모든폴더와 파일 목록을 반환
		File[] files = file.listFiles();

		
		for (int i = 0; i < files.length; i++) {
			System.out.println("내부에 존재하는 모든 폴더와 파일 목록 중 " + (i + 1) + "번째 파일: " + files[i]);
		}
		File[] files2 = file2.listFiles();
		for (int i = 0; i < files2.length; i++) {
			System.out.println("내부에 존재하는 모든 폴더와 파일 목록 중 " + (i + 1) + "번째 파일: " + files[i]);
		}
	}
}
