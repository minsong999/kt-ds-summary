package oop_exam;

public class CalcOperator {
	public int get(CalcType type, int num1, int num2) {
		
		System.out.println(type.getSymbol() + "를 합니다.");
		
		if (type == CalcType.ADD) {
			return num1 + num2;
		} else if (type == CalcType.SUB) {
			return num1 - num2;
		} else if (type == CalcType.MUL) {
			return num1 * num2;
		} else if (type == CalcType.DIV) {
			return num1 / num2;
		}

		return 0;
	}

	public static void main(String[] args) {
		CalcOperator calc = new CalcOperator();

		int gender = 2;

		int result = calc.get(CalcType.ADD, 10, 5);
		System.out.println(result);

		result = calc.get(CalcType.SUB, 10, 5);
		System.out.println(result);

		// result = calc.get(gender, 10, 5); //<- 이렇게 값만 같아도 실행이 되기 때문에 해석이 어려워지는 이슈가
		// 발생한다.
		//System.out.println(result);

		result = calc.get(CalcType.MUL, 10, 5);
		System.out.println(result);

		result = calc.get(CalcType.DIV, 10, 5);
		System.out.println(result);
	}
}
