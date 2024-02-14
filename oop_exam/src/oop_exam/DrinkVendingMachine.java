package oop_exam;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import fp_java.ch02.stream.vo.Dish;

public class DrinkVendingMachine {

	Drink[] drinkArray;

	public DrinkVendingMachine() { // DrinkVendingMachine 생성자로 인스턴스 생성 시 생성된다.
		drinkArray = new Drink[4];

		this.drinkArray[0] = new Drink();
		this.drinkArray[0].setName("박카스");
		this.drinkArray[0].price = 900; // drink1.가격에 900 으로 값 변경
		this.drinkArray[0].stock = 15; // drink1.재고에 15 로 값 변경

		this.drinkArray[1] = new Drink();
		this.drinkArray[1].name = "몬스터";
		this.drinkArray[1].price = 1500;
		this.drinkArray[1].stock = 20;

		this.drinkArray[2] = new Drink();
		this.drinkArray[2].name = "밀키스";
		this.drinkArray[2].price = 1400;
		this.drinkArray[2].stock = 5;

		this.drinkArray[3] = new Drink();
		this.drinkArray[3].name = "환타";

		this.drinkArray[3].price = 1400;
		this.drinkArray[3].stock = 5;
	}

	/**
	 * 주문하기
	 * 
	 * @param name     주문할 상품의 이름
	 * @param quantity 주문할 수량
	 * @return 주문한 상품의 정보
	 */
	public Drink order(String name, int quantity) {
//		Drink orderedDrink = new Drink();
//		
//		for (Drink drink : drinkArray) {
//			if (drink != null && drink.getName().equals(name)) {
//				if (drink.getStock() < quantity) {
//					System.out.println("상품이 품절되었습니다."); // 상품이 품절되었습니다.를 출력
//					return null;
//				}
//				drink.setStock(drink.getStock() - quantity);
//				orderedDrink.setName(drink.getName());
//				orderedDrink.setStock(quantity);
//				orderedDrink.setPrice(drink.getPrice());
//			}
//		}
		// return orderedDrink; // 만들어진 Drink 인스턴스 리턴

		Optional<Drink> soldoutDrink = Arrays.stream(this.drinkArray)
				.filter(drink -> drink != null && drink.name.equals(name)).filter(drink -> drink.stock < quantity)
				.findFirst();

		if (soldoutDrink.isPresent()) {
			System.out.println("상품이 품절되었습니다."); // 상품이 품절되었습니다.를 출력
			return null;
		}
		Arrays.stream(this.drinkArray).filter(drink -> drink != null && drink.name.equals(name))
				.filter(drink -> drink.stock > quantity)
				.map(drink -> {
					drink.stock -= quantity;

					Drink orderedDrink = new Drink();
					orderedDrink.setName(drink.getName());
					orderedDrink.setStock(quantity);
					orderedDrink.setPrice(drink.getPrice());
					return orderedDrink;
				}).findFirst().orElse(null);
	}

	/**
	 * 입고하기
	 * 
	 * @param name     입고할 상품의 이름
	 * @param quantity 입고할 상품의 수량
	 */
	public void fill(String name, int quantity) {
		for (Drink drink : drinkArray) {
			if (drink.getName().equals(name)) {
				drink.setStock(drink.getStock() + quantity);
			}
		}
	}

	/**
	 * 상품 출력
	 */
	public void printStock() {

		for (int i = 0; i < drinkArray.length; i++) {
			System.out.println(
					"상품" + (i + 1) + ":" + drinkArray[i].name + "," + drinkArray[i].price + "," + drinkArray[i].stock);
		}
	}

}