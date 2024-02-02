package file_io.writefile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class NIOWriteExam {
	public static void main(String[] args) {

		boolean append = true;

		File file = new File("C:\\java\\outputs2", "java_output2.txt");
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}

		if (append != true) {
			int index = 2;
			while (file.exists()) {
				file = new File(file.getParent(), "java_output(" + (index++) + ").txt");
			}
		}

		List<String> fileDesc = new ArrayList<>();
		fileDesc.add("파일읍 씁니다1.");
		fileDesc.add("파일읍 씁니다2.");
		fileDesc.add("파일읍 씁니다3.");

		try {
			if (!append) {
				Files.write(file.toPath(), fileDesc, Charset.forName("UTF-8"));
			} else {
				Files.write(file.toPath(), fileDesc, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
			}
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

		System.out.println(file.getAbsolutePath());
	}
}
