package books_lental_cafe;

public class Book {
	private String name;
	private boolean lentalStatus;
	private int lentalFee;

	public Book() {

	}

	public String getName() {
		return this.name;
	}

	public boolean getLentalStatus() {
		return this.lentalStatus;
	}

	public int getLentalFee() {
		return this.lentalFee;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLentalStatus(boolean lentalStatus) {
		this.lentalStatus = lentalStatus;
	}

	public void setLentalFee(int lentalFee){
		this.lentalFee = lentalFee;
	}
}
