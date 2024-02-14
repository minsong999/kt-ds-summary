package fp_java.ch09.collectors;

import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class CollectorsExample {
	public static void main(String[] args) {

		Map<String, String> menuMap = new HashMap<>();
		menuMap.put("빅맥", "13500");
		menuMap.put("빅맥2", "24500");
		menuMap.put("빅맥3", "35500");
		menuMap.put("빅맥4", "46500");
		menuMap.put("빅맥5", "57500");
		menuMap.put("빅맥6", "68500");
		menuMap.put("빅맥7", "79500");

		List<String> menuName = menuMap.entrySet() // Set<Entry<Key, Value>> -> Set<Entry<String, String>>
				.stream() // Stream<Entry<String, String>>
				.map(entry -> entry.getKey()) // Stream<String>
				.collect(Collectors.toList()); // List<String>
		menuName.forEach(System.out::println);

		List<Dish> menu = DishData.menu;
		// 모든 집계 구하기 ( 개수, 합계, 최소값, 최대값, 평균) 구하기
		IntSummaryStatistics intSummaryStatistics = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));

		System.out.println(intSummaryStatistics);

		// 문자열 연결하기
		// 1. Stream 사용하지 않고 하기

		String menuNames = "";
		for (Dish item : menu) {
			menuNames += (item.getName() + ",");
		}

		menuNames = menuNames.trim();
		menuNames = menuNames.substring(0, menuNames.length() - 1);
		System.out.println(menuNames);

		// 문자열 연결하기
		// Stream 이용하기
		String menuNames2 = "";

		menuNames2 = menu.stream().map(Dish::getName).collect(Collectors.joining(", "));

		System.out.println(menuNames2);

		// 그룹핑하기
		// 메뉴의 타입으로 그룹핑
		// 채식메뉴와 일반 메뉴를 그륩핑
		Map<Dish.Type, List<Dish>> dishesByType = menu.stream() // Stream<Dish>
				.collect(Collectors.groupingBy(Dish::getType));
		System.out.println(dishesByType);
		System.out.println(dishesByType.get(Dish.Type.FISH));
		System.out.println(dishesByType.get(Dish.Type.MEAT));
		System.out.println(dishesByType.get(Dish.Type.OTHER));

		// 채식 메뉴와 일반 메뉴를 그룹핑.
		Map<Boolean, List<Dish>> dishesByisVegetarian = menu.stream()
				.collect(Collectors.groupingBy(Dish::isVegetarian));
		System.out.println(dishesByisVegetarian);
		System.out.println(dishesByisVegetarian.get(true));
		System.out.println(dishesByisVegetarian.get(false));

		// 커스텀 그룹핑 하기
		Map<String, List<Dish>> dishesByCustom = menu.stream().collect(Collectors.groupingBy(dish -> {
			if (dish.getCalories() <= 400) {
				return "Diet";
			} else if (dish.getCalories() <= 700) {
				return "NORMAL";
			} else {
				return "FAT";
			}
		}));

		System.out.println(dishesByCustom);

		// 다수준 그룹화
		menu.stream()
		.collect(Collectors.groupingBy(Dish::getType, 
				Collectors.groupingBy
				(dish -> 
					{
						if (dish.getCalories() <= 400) {
							return "Diet";
						} else if (dish.getCalories() <= 700) {
							return "NORMAL";
						} else {
							return "FAT";
						}
					}
						)
				)
		);

	}
}
