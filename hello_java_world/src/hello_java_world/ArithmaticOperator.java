package hello_java_world;

public class ArithmaticOperator {
	/**
	 * 실행을 위한 코드 public static void main(String[] args)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int number1 = 10;
		// number1 = number1 + 2;
		number1 += 2;
		System.out.println(number1);

		int number2 = 10;
		// number2 = number2 - 2;
		number2 -= 2;
		System.out.println(number2);

		int number3 = 10;
		// number3 = number3 * 2;
		number3 *= 2;
		System.out.println(number3);

		int number4 = 10;
		// number4 = number4 / 4;
		number4 /= 4;
		System.out.println(number4);

		int number5 = 10;
		// number5 = number5 % 4;
		number5 %= 4;
		System.out.println(number5);

		++number5;
		System.out.println(number5);

		int num1 = 10;
		int num2 = 20;

		System.out.println(num1++);
		System.out.println(num1);
		System.out.println(num2++);
		System.out.println(num2);

		// num1--;
		// num2--;
		// System.out.println(num1);
		// System.out.println(num2);

		// System.out.println(num1--);
		// System.out.println(num2--);

		System.out.println(num1++);
		System.out.println(num2++);

		
	}
}
