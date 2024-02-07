package fp_java.ch02.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class StreamExample {
	public static void main(String[] args) {
		List<Dish> menu = DishData.menu;
		
		//Stream은 최종 연산 전 과정인 중간연산 과정은 최종연산이 없으면 실행되지 않는다.
		Stream<Dish> menuStream =  menu.stream().filter(d -> d.getCalories() > 300);

		
		List<String> lowCaloricDishesName = 
				// List<Dish> -> Stream<Dish>로 변경
				// filter(Predicate<Dish>)
				// Predicate -> dish를 파라미터로 받아서
				// 				boolean으로 반환.
				// 				true가 반환된 것만 새로운 Stream으로 생성된다.
				menu.stream()
				// 400 칼로리 이하의 요리 선택
				.filter(d -> d.getCalories() > 300) 
				// 데이터 오름차순 정렬(칼로리 기준)
				// sorted(Comparator<Dish>)
				// Comparator -> compare(dish1, dish2)
				//			  -> dish1.getCalories() - dish2.getCalories()
				//			  	-> 오름차순.
				//			  -> dish2.getCalories() - dish1.getCalories()
				//			  	-> 내림차순. 
				//			  -> Comparator.comparing(Dish::getCalories)
				//			  	-> 오름차순
				.sorted(Comparator.comparing(Dish::getCalories)) //오름차순
				.sorted(Comparator.comparing(dish -> dish.getCalories())) //오름차순
				.sorted((dish1, dish2) -> dish1.getCalories() - dish2.getCalories()) //오름차순
				.sorted((dish1, dish2) -> dish2.getCalories() - dish1.getCalories()) //내림차순
				// map(Function<Dish, 반환되는 타입>)
				// map을 통해서 반한되는 데이터 형태를 정해준다.
				.map(Dish::getName)
				.skip(2) // 현재까지 처리된 Stream 데이터에서 상위 2개는 제외한다.
				//.limit(3) // 현재까지 처리된 Stream 데이터에서 가장 상위 데이터 3개만 가져온다.
				//.map(dish -> dish.getName())
				// 모든 요리명을 리스트에 저장
				// 최종함수 : stream을 일반 클래스 혹은 Primitive Type으로 반환
				// 이 때 , Stream의 제네릭이 List에도 동일하게 전달
				// Stream<String> ==> List<String>
				.collect(Collectors.toList());
		
		// 필터는 불린을 반환 predicate
		// 솔트는 Comparator
		
		// 병렬스트림인 parallelStream()은 결국에 반환되는 데이터가 정렬이 되어있지 않기 때문에 리스트로 반환 후 다시 정렬해야 한다.
		List<String> lowCaloricDishesName1 = 
				menu.parallelStream() 
				// 400 칼로리 이하의 요리 선택
				.filter(d -> d.getCalories() < 400)
				// 칼로리로 요리 정렬
				//.sorted(Comparator.comparing(Dish::getCalories))
				// 요리명 추출
				.map(Dish::getName)
				// 모든 요리명을 리스트에 저장
				.collect(Collectors.toList());
		
	
		lowCaloricDishesName
			// Stream 혹은 List의 데이터를 반복하며 Lamda를 수행
			// forEach(consumer<String>)
			// Consumer -> String을 파라미터로 받아 VOID를 반환.
			//.forEach(System.out::println);
			.forEach(menuName -> System.out.println(menuName));
	}
}
