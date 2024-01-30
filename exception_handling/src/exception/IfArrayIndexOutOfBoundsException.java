package exception;

public class IfArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		int[] scores = { 100, 200, 300 };

		if (scores.length > 0) {
			System.out.println(scores[0]);
		}
		if (scores.length > 1) {
			System.out.println(scores[1]);
		}
		if (scores.length > 2) {
			System.out.println(scores[2]);
		}
		if (scores.length > 3) {
			System.out.println(scores[3]);
		}
	}
}
