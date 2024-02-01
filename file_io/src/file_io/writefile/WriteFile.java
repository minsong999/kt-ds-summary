package file_io.writefile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
	public static List<String> getAllLines(File file) {
		List<String> originalFileDescription = new ArrayList<String>();
		if (file.exists() && file.isFile()) {
			try {
				Path filePath = Paths.get("C:\\java\\outputs", "java_output.txt");
				Charset utf8 = Charset.forName("UTF-8");
				originalFileDescription.addAll(Files.readAllLines(filePath, utf8));

			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}

			for (int i = 0; i < originalFileDescription.size(); i++) {
				originalFileDescription.set(i, originalFileDescription.get(i) + "\n");
			}

		}
		return originalFileDescription;
	}

	/**
	 * 파일을 쓴다.
	 * 
	 * @param parent   파일을 쓸 경로
	 * @param filename 쓸 파일의 이름
	 * @param append   이어서 쓸 것인지 여부
	 */
	public static void writeFile(String parent, String filename, boolean append) {

		File file = new File("C:\\java\\outputs", "java_output.txt");
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}

		List<String> originalFileDescription = getAllLines(file);
		// 파일의 중복체크가 없다면 덮어쓰기함
		if (append == false) {
			int index = 2;
			while (file.exists()) {
				file = new File(file.getParent(), "java_output(" + (index++) + ").txt");
			}
		} else {// 이어쓸것이라면
				// 기존의파일 내용을 받아와서 List<Stirng>으로 받는다.
				// 반환받는 내용을 originalFileDescription에 addAll한다.

		}

		// 파일 이어서 쓰기
		// 파일을 이어서 쓰는 메소드는 없다.
		// java 1.8 도입 ==> 이어쓰기 O
		// java 1.8 미만
		// 기존의파일 내용을 다 읽어와서 새롭게 파일을 쓴다.

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(file, Charset.forName("UTF-8"));
			bw = new BufferedWriter(fw);

			if (append) {
				for (String originalLine : originalFileDescription) {
					bw.write(originalLine);
				}
			}
			bw.write("AABCDㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ\n");
			bw.write("AA5B44CD\n");
			bw.write("AAB12CD\n");

			bw.flush();
		} catch (IOException ioe) {
			ioe.getMessage();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException ioe) {
					ioe.getMessage();
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException ioe) {
					ioe.getMessage();
				}
			}
		}

	}

	public static void main(String[] args) {
		writeFile("C:\\java\\outputs", "java_output.txt", true);
		writeFile("C:\\java\\outputs", "java_output.txt", false);
	}
}
