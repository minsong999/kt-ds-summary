package oop_exam;

public class CallStudent {

	public static void main(String[] args) {
		Student student = new Student();
		student.cpp = 85;
		student.csharp =85;
		student.java = 85;
		student.python = 60;
		
		int sum = student.getSumAllScores();
		double average = student.getAverage();
		double courseCredit =student.getCourseCredit();
		String abcde = student.getABCED();
		
		
		System.out.println("합계: " +sum);
		System.out.println("평균: " +average);
		System.out.println("학점: " +courseCredit);
		System.out.println("등급: " +abcde);
	}
}
