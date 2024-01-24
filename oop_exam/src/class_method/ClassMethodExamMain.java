package class_method;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassMethodExamMain {
	public static void main(String args[]) {
		int age = 40;
		boolean isValidAge = ClassMethodExam.isValidAge(age, 29,55);
		System.out.println(isValidAge);
		
		double CourseCredit = ClassMethodExam.getCourseCredit(95);
		System.out.println(CourseCredit);
		String ABCDE = ClassMethodExam.getABCDE(67.5);
		System.out.println(ABCDE);
		
		Date formatDate = null;
		String today = "20240124";
		try {
		SimpleDateFormat forMatter = new SimpleDateFormat("yyyymmdd");
		formatDate = forMatter.parse(today);
		}catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(formatDate);
		
//		SimpleDateFormat formatter = new SimpleDateFormat();
//		Date today =  formatter.parse(today);
	}
}
