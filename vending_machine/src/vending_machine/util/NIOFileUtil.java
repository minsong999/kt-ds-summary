package vending_machine.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import vending_machine.Product;
import vending_machine.constants.AppendType;

/**
 * Java 1.8 이상 버전의 파일 유틸리티
 */
public class NIOFileUtil {
	public static File findFile(String fileName, File from) {
		if (from == null) {
			from = new File("C:\\");
		}

		if (from.exists() && from.isDirectory()) {
			File[] itemInDir = from.listFiles();
			if (itemInDir != null) {
				for (File item : itemInDir) {
					if (item.isDirectory()) {
						File result = findFile(fileName, item);
						if (result != null) {
							return result;
						}
					} else if (item.getName().equals(fileName)) {
						return item;
					}
				}
			}
		} else if (from.isFile()) {
			System.out.println(from.getAbsolutePath());
		}
		return null;
	}

	public static List<Product> readCSVFile(String fileName) {
		File file = NIOFileUtil.findFile(fileName, null);
		if (file == null) {
			return new ArrayList<>();
		}

		if (file.exists() && file.isFile()) {
			List<String> fileLine = new ArrayList<>();
			try {
				fileLine.addAll(Files.readAllLines(file.toPath(), Charset.forName("UTF-8")));

			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}

			List<Product> csvList = new ArrayList<>();
			Product product = null;
			String[] stringArray = null;

			for (String line : fileLine) {
				product = new Product();

				stringArray = line.trim().split(",");
				product.setName(stringArray[0].trim());
				product.setPrice(Integer.parseInt(stringArray[1].trim()));
				product.setQuantity(Integer.parseInt(stringArray[2].trim()));
				csvList.add(product);
			}
			System.out.println(csvList);
			return csvList;
		}
		return new ArrayList<>();
	}

	public static void writeFile(String parent, String name, String description, AppendType appendType) {
		File file = new File(parent, name);
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}

		if (appendType == appendType.OVER_WRITE) {
			int index = 2;
			while (file.exists()) {
				file = new File(file.getParent(), name + "(" + (index++) + ").txt");
			}
		}

		List<String> fileDesc = new ArrayList<>();
		fileDesc.add(description);

		try {
			if (appendType == appendType.APPEND) {
				Files.write(file.toPath(), fileDesc, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
			} else {
				Files.write(file.toPath(), fileDesc, Charset.forName("UTF-8"));
			}
		} catch (IOException ioe) {
			// System.out.println(ioe.getMessage());
		}
		// System.out.println(file.getAbsolutePath());
	}
}
