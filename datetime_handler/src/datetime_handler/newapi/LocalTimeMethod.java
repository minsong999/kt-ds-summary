package datetime_handler.newapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;

public class LocalTimeMethod {

	/**
	 * 전달 받은 날짜의 첫 번째 날짜부터 마지막 날짜까지를 출력 (요일 포함)
	 * 
	 * @param date 기준이 되는 날짜
	 */
	public static void printCalendar(LocalDate date) {
		// date 인스턴스를 YearMonth 변경
		YearMonth yearMonth = YearMonth.from(date);
		// 첫번째날짜를 구한다.
		LocalDate firstDay = yearMonth.atDay(1);
		// date 인스턴스 월의 총 길이(며칠)를 구한다.
		int days = yearMonth.lengthOfMonth();

		// 반복하며 날짜와 요일을 출력한다.
		for (int i = 0; i < days; i++) {
			System.out.println(firstDay.getDayOfWeek());
			firstDay = firstDay.plusDays(1);
		}

		System.out.println("========================================================");
	}

	/**
	 * 금일 제외가장 가까운 다음 영업일을 구한다.
	 * 
	 * @param date	
	 * @return
	 */
	public static Map<String, Object> getClosetWorkingDay(LocalDate date) {
		// 1. LocalDate에 하루를 더한다.
		// 2. 오늘의 요일을 구한다.
		// 3. LocalDate가 휴일인지 검사한다.
		// 4. LocalDate가 휴일이라면 하루를 더 한다.
		// 5. 만약 휴일이 아니라면 더한 결과를 반한한다.
		int dayCount = 0;
		boolean isCloseDay = true;
		while (isCloseDay) {
			dayCount++;
			date = date.plusDays(1);
			if (!(date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY)) {
				isCloseDay = false;
			}
		}

		Map<String, Object> result = new HashMap<>();
		result.put("workingDay", date);
		result.put("dayCount", dayCount);
		return result;
	}

	public static Period getBetweenDate(LocalDate startDate, LocalDate endDate) {
		Period between = Period.between(startDate, endDate);
		return between;
	}

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();

		Period between = getBetweenDate(now.of(2022, 1, 16), now.of(2024, 3, 28));
		System.out.println(between.getYears() + "," + between.getMonths() + "," + between.getDays());

		Map<String, Object> getCloseNowMap = getClosetWorkingDay(now);
		Map<String, Object> getClose20240209Map = getClosetWorkingDay(now.of(2024, 2, 9));

		System.out.println(getCloseNowMap.get("workingDay"));
		System.out.println(getCloseNowMap.get("dayCount"));

		System.out.println(getClose20240209Map.get("workingDay"));
		System.out.println(getClose20240209Map.get("dayCount"));

//		printCalendar(now);
//		
//
//		System.out.println(now.getDayOfWeek().name()); // LocalDate, LocalDateTime 사용
//
//		YearMonth yearMonth = YearMonth.from(now);
//
//		// 이번 달의 첫번째 날 구하기
//		LocalDate firstDay = yearMonth.atDay(1); //
//		System.out.println("이번 달의 첫번째 날 구하기");
//		System.out.println(firstDay);
//		System.out.println(firstDay.getDayOfWeek().name());
//
//		// 이번 달의 마지막 날 구하기
//		LocalDate lastDay = yearMonth.atEndOfMonth(); //
//		System.out.println("이번 달의 마지막 날 구하기");
//		System.out.println(lastDay);
//		System.out.println(lastDay.getDayOfWeek().name());
//
//		// 이번달은 몇일인지 구하기
//		int lengthOfDays = now.lengthOfMonth();
//		System.out.println("이번달은 몇일인지 구하기");
//		System.out.println(lengthOfDays);
//
//		// 올해가 몇일인지 구하기
//		int lengthOfYears = now.lengthOfYear();
//		System.out.println("올해가 몇일인지 구하기");
//		System.out.println(lengthOfYears);
	}

}
