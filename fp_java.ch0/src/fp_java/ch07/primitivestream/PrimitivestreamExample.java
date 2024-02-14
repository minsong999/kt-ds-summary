package fp_java.ch07.primitivestream;

import java.util.List;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class PrimitivestreamExample {
	public static void main(String[] args) {
		List<Dish> menu = DishData.menu;

		// 일반 스트림으로 모든 메뉴의 칼로리 총 합을 구해보
		int calories = menu.stream() // Stream(Dish)
				// .map((dish) -> dish.getCalories()) // Stream<Integer>
				.map(Dish::getCalories) // Stream<Integer>
				.reduce(0, (sumCalories, calory) -> sumCalories + calory);

		System.out.println(calories);

		// 프리미티브스티림으로 모든 메뉴들의 칼로리 총 합을 구해보기.
		calories = menu.stream() // Stream<dish>
				// .mapToInt((dish) -> dish.getCalories()) //IntStream
				.mapToInt(Dish::getCalories) // IntStream
				.sum();
		System.out.println(calories);

		// 프리미티브스트림으로 채식 메뉴들의 칼로리 총 합을 구해보기
		calories = menu.stream()
				//.filter(dish -> dish.isVegetarian() == true)
				.filter(Dish::isVegetarian)
				.mapToInt(Dish::getCalories)
				.sum();

		System.out.println(calories);

		// 프리미티브스트림으로 채식 메뉴들의 평균 칼로리을 구해보기
		double calories2 = menu.stream()
				.filter(dish -> dish.isVegetarian() == true) //Stream<Dish>
				.mapToInt(Dish::getCalories) //IntStream
				.average() //OptionalDouble
				.orElse(0); //double

		System.out.println(calories2);

	}
}
