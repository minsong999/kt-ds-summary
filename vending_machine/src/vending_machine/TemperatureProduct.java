package vending_machine;

public class TemperatureProduct extends Product{
	/**
	 * 상품이 뜨거운지 아닌지
	 * true: 뜨거운 상품
	 * false: 차가운 상품
	 */
	
	boolean isHot;

	public boolean getIsHot() {
		return isHot;
	}

	public void setIsHot(boolean isHot) {
		this.isHot = isHot;
	}
}
