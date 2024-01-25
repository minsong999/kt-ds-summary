package class_method;

public class ClassMethodExamMain {
	public static void main(String args[]) {
		int age = 40;
		boolean isValidAge = ClassMethodExam.isValidAge(age, 29,55);
		System.out.println(isValidAge);
		
		double CourseCredit = ClassMethodExam.getCourseCredit(95);
		System.out.println(CourseCredit);
		String ABCDE = ClassMethodExam.getABCDE(67.5);
		System.out.println(ABCDE);
	}
}
