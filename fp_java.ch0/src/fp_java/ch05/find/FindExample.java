package fp_java.ch05.find;

import java.util.List;
import java.util.Optional;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class FindExample {
	public static void main(String[] args) {
		List<Dish> menu = DishData.menu;

		// 스트림 내부에서 임의의 데이터 가져오기
		Optional<Dish> vegeterianDish = menu.stream().filter(dish -> dish.isVegetarian()).findAny();
		// Optional
		// 데이터가 null 일수도 아닐수도 있는 특별한 클래스
		// orElse : Optional Data가 null 일 때 other의 값을 반환시키도록 하는 메소드
		Dish dish = vegeterianDish.orElse(null);
		System.out.println(dish);

		Dish fatDish = menu.stream()
						   .filter(d -> d.getCalories() > 1000)
						   .findFirst()
						   .orElse(null);

		System.out.println(fatDish);
	}
}
