package books_lental_cafe;

public class Cafe {
	private Book book1;
	private Book book2;
	private Book book3;
	private int money;

	public Cafe() {
		book1 = new Book();
		book1.setName("슬램덩크 1화");
		book1.setLentalStatus(false);
		book1.setLentalFee(300);

		book2 = new Book();
		book2.setName("슬램덩크 2화");
		book2.setLentalStatus(false);
		book2.setLentalFee(400);

		book3 = new Book();
		book3.setName("슬램덩크 3화");
		book3.setLentalStatus(false);
		book3.setLentalFee(500);
	}

	public Book getBook1() {
		return book1;
	}

	public void setBook1(Book book) {
		this.book1 = book;
	}

	public Book getBook2() {
		return book2;
	}

	public void setBook2(Book book) {
		this.book2 = book;
	}

	public Book getBook3() {
		return book3;
	}

	public void setBook3(Book book) {
		this.book3 = book;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void showAllBook() {

		System.out.println(
				"책 이름은 " + book1.getName() + " 반납 상태는 " + book1.getLentalStatus() + " 대여비는 " + book1.getLentalFee());
		System.out.println(
				"책 이름은 " + book2.getName() + " 반납 상태는 " + book2.getLentalStatus() + " 대여비는 " + book2.getLentalFee());
		System.out.println(
				"책 이름은 " + book3.getName() + " 반납 상태는 " + book3.getLentalStatus() + " 대여비는 " + book3.getLentalFee());
	}

	public int lentalBook(String bookName) {
		int lentalFee = 0;
		if (this.book1.getName().equals(bookName) && this.book1.getLentalStatus() == false) {
			this.book1.setLentalStatus(true);
			setMoney(this.getMoney() + this.book1.getLentalFee());
			this.book1.setLentalStatus(true);
			System.out.println(this.book1.getName() + " 대여 완료");
			System.out.println("가게의 돈은 " + this.money);
		} else if (this.book2.getName().equals(bookName) && this.book2.getLentalStatus() == false) {
			this.book2.setLentalStatus(true);
			setMoney(this.getMoney() + this.book2.getLentalFee());
			this.book2.setLentalStatus(true);
			System.out.println(this.book2.getName() + " 대여 완료");
			System.out.println("가게의 돈은 " + this.money);
		} else if (this.book3.getName().equals(bookName) && this.book3.getLentalStatus() == false) {
			this.book3.setLentalStatus(true);
			setMoney(this.getMoney() + this.book3.getLentalFee());
			this.book3.setLentalStatus(true);
			System.out.println(this.book3.getName() + " 대여 완료");
			System.out.println("가게의 돈은 " + this.money);
		} else {
			System.out.println("대여 불가");
		}

		return lentalFee;
	}

	public void returnBook(String bookName) {
		if (this.book1.getName().equals(bookName) && book1.getLentalStatus() == true) {
			this.book1.setLentalStatus(false);
			System.out.println("반납완료");
		} else if (this.book2.getName().equals(bookName) && book2.getLentalStatus() == true) {
			this.book2.setLentalStatus(false);
			System.out.println("반납완료");
		} else if (this.book3.getName().equals(bookName) && book3.getLentalStatus() == true) {
			this.book3.setLentalStatus(false);
			System.out.println("반납완료");
		} else {
			System.out.println("반납 불가 책입니다.");
		}
	}

}
