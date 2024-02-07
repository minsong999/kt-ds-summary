package datetime_handler.newapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExam {
	public static void main(String[] args) {

		LocalDateTime nowDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String strNowDateTime = dateTimeFormatter.format(nowDateTime);
		System.out.println(nowDateTime);
		System.out.println(strNowDateTime);

		nowDateTime = LocalDateTime.of(2022, 2, 1, 11, 33, 11);

		System.out.println(nowDateTime);
		System.out.println(strNowDateTime);

		nowDateTime = nowDateTime.plusDays(10);
		nowDateTime = nowDateTime.plusMonths(2);
		nowDateTime = nowDateTime.plusYears(3);
		nowDateTime = nowDateTime.plusHours(10);
		nowDateTime = nowDateTime.plusMinutes(5);
		nowDateTime = nowDateTime.plusSeconds(55);

		System.out.println(nowDateTime);
		System.out.println(strNowDateTime);

		nowDateTime = nowDateTime.minusDays(10);
		nowDateTime = nowDateTime.minusMonths(2);
		nowDateTime = nowDateTime.minusYears(3);
		nowDateTime = nowDateTime.minusHours(10);
		nowDateTime = nowDateTime.minusMinutes(5);
		nowDateTime = nowDateTime.minusSeconds(55);

		strNowDateTime = dateTimeFormatter.format(nowDateTime);
		System.out.println(nowDateTime);
		System.out.println(strNowDateTime);
	}
}
