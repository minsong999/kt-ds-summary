package util;

import java.time.LocalDate;
import java.time.Period;

public class localDateTimeUtil {
	public Period getBetweenDate(LocalDate startDate, LocalDate endDate) {
		Period between = Period.between(startDate, endDate);
		return between;
	}
}
