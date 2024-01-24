package oop_exam;

import class_method.ClassMethodExam;

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
		
		double courseCredit2 =ClassMethodExam.getCourseCredit(average); //2.37
		String abcde2 = ClassMethodExam.getABCDE(average);
		String abcde3 = ClassMethodExam.getABCDE2(ClassMethodExam.getCourseCredit(average));
		
		System.out.println("합계: " +sum);
		System.out.println("평균: " +average);
		System.out.println("학점: " +courseCredit);
		System.out.println("등급: " +abcde);
		
		System.out.println("학점: " +courseCredit2);
		System.out.println("등급: " +abcde2);
		System.out.println("등급: " +abcde3);
	}
}
