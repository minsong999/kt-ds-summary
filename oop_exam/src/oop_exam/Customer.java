package oop_exam;

/**
 * 자판기를 이용하는 고객
 */
public class Customer {
	
	int wallet;
	int stock;
	
	public Customer() {
		
	}
	
	public Customer(int wallet, int stock) {
		this.wallet = wallet;
		this.stock = stock;
	}

	/**
	 * 지출한다.
	 */
	public void pay(int price) {
		if(wallet - price < 0) {
			return; // 메소드 즉시 종료
		}
		this.wallet -= price;
	}

	/**
	 * 상품이 하나 증가한다.
	 */
	public void addStock() {
		this.stock++;
	}
}
