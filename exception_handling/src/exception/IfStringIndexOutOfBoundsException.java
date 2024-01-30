package exception;

public class IfStringIndexOutOfBoundsException {
	public static void main(String[] args) {
		String logoFilePath = "C:\\images\\logo.png";
		/*
		 * logoFilePath 인스턴스에서 "logo.png"만 추출해 출력해보세요.
		 */

		String searchStr = "logo.png";

		if (logoFilePath != null && searchStr != null) {
			if (logoFilePath.contains(searchStr)) {
				int lastIndexOfBackslah = logoFilePath.lastIndexOf("\\") + 1;
				System.out.println(lastIndexOfBackslah);
				String fileName = logoFilePath.substring(lastIndexOfBackslah);
				System.out.println(fileName);
			}
		}

		/*
		 * logoFilePath 인스턴스에서 "images"만 추출해 출력해보세요.
		 */

		searchStr = "images";
		if (logoFilePath != null && searchStr != null) {
			if (logoFilePath.contains(searchStr)) {
				System.out.println(logoFilePath.substring(logoFilePath.indexOf(searchStr),
						logoFilePath.indexOf(searchStr) + searchStr.length()));
			}
		}

		/*
		 * logoFilePath 인스턴스에서 "user_images"만 추출해 출력해보세요. 찾으려는 단어가 없을 경우 -1 리턴 String은
		 * character의 배열이므로 배열의 인덱스가 -1은 없으므로 에러 발생
		 */

		searchStr = "user_images";
		if (logoFilePath != null && searchStr != null) {
			if (logoFilePath.contains(searchStr)) {
				System.out.println(logoFilePath.substring(logoFilePath.indexOf(searchStr),
						logoFilePath.indexOf(searchStr) + searchStr.length()));
			}
		}

		/*
		 * logoFilePath 인스턴스에서 확장자("png")만 추출해 출력해보세요.
		 */

		String downloadFilePath = "C:\\images\\logo";
		/*
		 * downloadFilePath 인스턴스에서 파일의 확장자를 추출해 출력해보세요.
		 */
		searchStr = ".";
		if (logoFilePath != null && searchStr != null) {
			if (downloadFilePath.contains(searchStr)) {
				System.out.println(downloadFilePath.substring(downloadFilePath.indexOf(searchStr) + 1));
			}
		}
	}
}
