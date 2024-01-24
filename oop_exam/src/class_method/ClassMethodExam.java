package class_method;

public class ClassMethodExam {
	public static boolean isValidAge(int age, int min, int max) {
		return age >= min && age <= max;
	}
	
	public static double getCourseCredit(double average) {
		
		return (int)((average - 55) / 10 * 100)/100.0;
	}
	
	public static String getABCDE(double average) {
		String abced = "";
		if (getCourseCredit(average) >= 4.1) {
			return abced = "A+";
		} else if (getCourseCredit(average) >= 3.6) {
			return abced = "A";
		} else if (getCourseCredit(average) >= 3.1) {
			return abced = "B+";
		} else if (getCourseCredit(average) >= 2.6) {
			return abced = "B";
		} else if (getCourseCredit(average) >= 1.6) {
			return 	abced = "C";
		} else if (getCourseCredit(average) >= 0.6) {
			return abced = "D";
		} /*
			 * else { return abced = "F"; }
			 */
		return "F";
	}
	

	public static String getABCDE2(double CourseCredit) {
		String abced = "";
		if (CourseCredit >= 4.1) {
			return abced = "A+";
		} else if (CourseCredit >= 3.6) {
			return abced = "A";
		} else if (CourseCredit >= 3.1) {
			return abced = "B+";
		} else if (CourseCredit >= 2.6) {
			return abced = "B";
		} else if (CourseCredit >= 1.6) {
			return 	abced = "C";
		} else if (CourseCredit >= 0.6) {
			return abced = "D";
		} /*
			 * else { return abced = "F"; }
			 */
		return "F";
	}
}
