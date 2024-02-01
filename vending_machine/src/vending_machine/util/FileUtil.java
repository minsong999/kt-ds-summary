package vending_machine.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import vending_machine.Product;

public class FileUtil {

	/**
	 * 파일을 쓴다.
	 * 
	 * @param parent      파일을 쓸 경로
	 * @param filename    쓸 파일의 이름
	 * @param description 파일에 쓸 내용
	 * @param append      이어서 쓸 것인지 여부
	 */
	public static void writeFile(String parent, String filename, String description, boolean append) {

		File file = new File(parent, filename);
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
			bw.write(description);
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

	public static List<String> getAllLines(File file) {
		List<String> originalFileDescription = new ArrayList<String>();
		if (file.exists() && file.isFile()) {
			try {
				Path filePath = Paths.get(file.getParent(), file.getName());
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

	public static List<Product> readCSVFile(String parent, String filename) {

		File file = new File(parent, filename);
		if (file.exists() && file.isFile()) {
			FileReader reader = null;
			BufferedReader bufferedReader = null;

			try {
				// 파일을 바이트 단위로 읽어오는 FileReader를 선언
				reader = new FileReader(file, Charset.forName("UTF-8"));
				// 파일을 라인 단위로 읽어오는 BufferedReader를 선언
				bufferedReader = new BufferedReader(reader);
				// 파일을 라인 단위로 읽어와 할당하기 위한 String 변수 선언

				List<Product> csvList = new ArrayList<>();
				Product product = null;

				String line = null;
				String[] stringArray = null;
				// 파일이 끝날 때까지 반복하며 line 변수에 한줄씩 읽어오기
				while ((line = bufferedReader.readLine()) != null) {
					product = new Product();

					stringArray = line.trim().split(",");
					product.setName(stringArray[0].trim());
					product.setPrice(Integer.parseInt(stringArray[1].trim()));
					product.setQuantity(Integer.parseInt(stringArray[2].trim()));
					csvList.add(product);
				}
				return csvList;
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
		return null;
	}
}
