package oop_exam;

public class Calculator {
	
	int korScore;
	int engScore;
	int mathScore;
	int progScore;
	
	int sumScore;
	int averageScore;
	String grade;
	
	public int getSumScore() {
		sumScore = korScore + engScore + mathScore + progScore;
		return sumScore;
	}
	
	public int getAverageScore() {
		averageScore = sumScore / 4;
		return averageScore;
	}
	
	public String getGrade() {
		if(averageScore >= 95) {
			grade = "A+";
		}else if(averageScore >= 90) {
			grade = "A";
		}else if(averageScore >= 85) {
			grade = "B";
		}else if(averageScore >= 80) {
			grade = "B+";
		}else if(averageScore >= 75) {
			grade = "C";
		}else {
			grade = "F";
		}
		return grade;
	}
	
	
}
