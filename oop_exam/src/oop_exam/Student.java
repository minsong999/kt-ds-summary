package oop_exam;

public class Student {

	// 멤버변수
	int java;
	int python;
	int cpp;
	int csharp;

	public int getSumAllScores() {

		return java + python + cpp + csharp;
	}

	public double getAverage() {
		int average = (int) ((getSumAllScores() / 4.0) * 100);
		return average / 100.0;
	}

	/**
	 * 학점 구하기
	 * @return (평균 점수 - 55) / 10
	 */
	public double getCourseCredit() {

		int CourseCredit = (int) ((getAverage() - 55) / 10 * 100);
		return CourseCredit / 100.0;
	}

	public String getABCED() {
		String abced = "";
		if (getCourseCredit() >= 4.1) {
			return abced = "A+";
		} else if (getCourseCredit() >= 3.6) {
			return abced = "A";
		} else if (getCourseCredit() >= 3.1) {
			return abced = "B+";
		} else if (getCourseCredit() >= 2.6) {
			return abced = "B";
		} else if (getCourseCredit() >= 1.6) {
			return 	abced = "C";
		} else if (getCourseCredit() >= 0.6) {
			return abced = "D";
		} /*
			 * else { return abced = "F"; }
			 */
		return "F";
	}

}
