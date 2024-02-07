package fp_java.ch03.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class FilteringExam {
	public static void main(String[] args) {
		List<Dish> menu = DishData.menu;

//		for (Dish dish : menu) {
//			if (dish.isVegetarian()) {
//				System.out.println("이름: " + dish); // 메뉴명
//				System.out.println("채식여부: " + dish.isVegetarian()); // 메뉴명
//			}
//		}
//		
		//List -> Stream 변경하면 Stream의 Generic은 List의 Generic과 같아진다.
		menu.stream()
			.filter((Dish dish) -> dish.isVegetarian())
			.forEach(dish -> 
			{
				System.out.println("이름: " + dish); // 메뉴명
				System.out.println("채식여부: " + dish.isVegetarian()); // 메뉴명
			}
			);
			//.collect(Collectors.toList());
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3 ,4 ,4);
		//짝수만 추려와서 중복을 제거하고 나머지를 출력한다.

		List<Integer> evenNumbers = Arrays.asList(1, 2, 1, 3, 3 ,4 ,4);
		for(int number : numbers) {
			if(number % 2 == 0) {
				if(!evenNumbers.contains(number)) {
					evenNumbers.add(number);
				}
			}
		}
		
		System.out.println(evenNumbers);
		
		//짝수만 보관할 리스트
		numbers.stream()
				.filter( (Integer i) -> i % 2 == 0) //Stream<Integer> = {2,2,4}		
				.distinct() //중복제거
				//.forEach((Integer n) -> System.out.println(n))
				.forEach(System.out::println);
		
		//메뉴 중에 칼로리가 300보다 큰 것 중 아무거나(정렬안된 데이터 앞) 3개 가져와서 조회.
		//메뉴 3개만 넣을 리스트
		menu.stream()
			.filter(d->d.getCalories() > 300)
			.limit(3)
			.forEach((Dish dish) -> System.out.println(dish));
	}
}
