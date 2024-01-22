package oop_exam;

public class Student {
	int java;
	int python;
	int cpp;
	int csharp;

	public int getSumAllScores() {

		return java + python + cpp + csharp;
	}

	public double getAverage() {

		double average;
		average =  (int)((getSumAllScores() / 4.0) * 100);
		return average / 100.0;
	}

	public double getCourseCredit() {
		int CourseCredit = (int)(((getAverage() - 55) / 10.0) * 10);
		return CourseCredit / 10.0;
	}

	public String getABCED() {
		String abced="";
		if(getCourseCredit() >=4.1) {
			abced = "A+";
		}else if(getCourseCredit() >3.6) {
			abced = "A";
		}else if(getCourseCredit() >3.1) {
			abced = "B+";
		
		}else if(getCourseCredit() >2.6) {
			abced = "B";
	
		}else if(getCourseCredit() >1.6) {
			abced = "C";

		}else if(getCourseCredit() >0.6) {
			abced = "D";
		}else {
			abced = "F";
		}
			
		return abced;
	}

}
