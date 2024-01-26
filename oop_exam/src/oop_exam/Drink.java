package oop_exam;

public class Drink {

	/**
	 * 상품명
	 */
	String name;
	/**
	 * 가격
	 */
	int price;
	/**
	 * 재고
	 */
	int stock;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}