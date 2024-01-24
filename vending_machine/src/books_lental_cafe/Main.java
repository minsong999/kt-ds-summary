package books_lental_cafe;

public class Main {
	public static void main(String[] args) {
		Cafe cafe = new Cafe();

		cafe.showAllBook(); // 모든 책 출력
//		cafe.lentalBook("슬램덩크 1화");
//
		cafe.lentalBook("슬램덩크 1화");
		cafe.returnBook("슬램덩크 1화");
//
//		cafe.lentalBook("슬램덩크 1화");
//		cafe.returnBook("슬램덩크 1화");
//
		cafe.lentalBook("슬램덩크 2화");
		cafe.returnBook("슬램덩크 2화");
//
//		cafe.lentalBook("슬램덩크 3화");
//		cafe.returnBook("슬램덩크 3화");
//
		cafe.showAllBook();
		// 모든 책 출력
		// cafe.lentalBook("슬램덩크 1화");

	}
}
