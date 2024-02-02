package oop_exam;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar nowDateTime = Calendar.getInstance();
		System.out.println(nowDateTime.get(Calendar.YEAR));
		System.out.println(nowDateTime.get(Calendar.MONTH) + 1);
		System.out.println(nowDateTime.get(Calendar.DAY_OF_MONTH));
		System.out.println(nowDateTime.get(Calendar.HOUR));
		System.out.println(nowDateTime.get(Calendar.MINUTE));
		System.out.println(nowDateTime.get(Calendar.DAY_OF_WEEK));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		System.out.println(sdf.format(nowDateTime.getTime()));
		
		nowDateTime.set(2022,01,01);
		nowDateTime.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println(nowDateTime.DAY_OF_MONTH);
		System.out.println(sdf.format(nowDateTime.getTime()));
		nowDateTime.add(Calendar.DAY_OF_MONTH, -20);
		System.out.println(nowDateTime.DAY_OF_MONTH);
		System.out.println(sdf.format(nowDateTime.getTime()));
		
		
	}
}
