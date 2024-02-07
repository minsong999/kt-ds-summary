package datetime_handler.newapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExam {
	public static void main(String[] args) {
		LocalDate nowDate = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String strNowDate = dateFormatter.format(nowDate);
		System.out.println(nowDate);
		System.out.println(strNowDate);

		nowDate.plusDays(10);
		nowDate.plusMonths(2);
		nowDate.plusYears(3);

		System.out.println(nowDate);
		System.out.println(strNowDate);

	}
}
