package oop_exam;

public enum CalcType {
	ADD("더하기"), SUB("빼기"), MUL("곱하기"), DIV("나누기");

	private String symbol;

	CalcType(String CalcType) {
		symbol = CalcType;
	}

	public String getSymbol() {
		return symbol;
	}
}
