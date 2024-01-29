package vending_machine;

/**
 * 상속 받은 클래스가 추상 메소드가 존재하는 추상 클래스라면 추상 메소드를 이 클래스에서 구현을 시키거나 이 클래스도 추상 클래스로 만들어
 * 주어야 한다. <b>환불 불가능한 자판기<b>
 */
//public class VendingMachine extends Seller {
public class VendingMachine implements Sellable {
	private Product[] productArray; // product 멤버변수 생성..
	/**
	 * 돈
	 */
	private int money; // money 멤버변수 생성

	@Override
	public Product[] getProductArray() {
		return this.productArray;
	}

	@Override
	public int getMoney() {
		return money;
	}

	@Override
	public void setMoney(int money) {
		this.money = money;
	}

	public VendingMachine() {
		this(100_000);
	}

	public VendingMachine(int money) {
		this.money = money;

		this.productArray = new Product[3];

		this.productArray[0] = new Product();
		this.productArray[0].setName("제로펩시");
		this.productArray[0].setPrice(1600);
		this.productArray[0].setQuantity(50);

		this.productArray[1] = new Product();
		this.productArray[1].setName("제로콜라");
		this.productArray[1].setPrice(1500);
		this.productArray[1].setQuantity(30);

		this.productArray[2] = new Product();
		this.productArray[2].setName("제로스프라이트");
		this.productArray[2].setPrice(1400);
		this.productArray[2].setQuantity(20);
	}

	@Override
	public void insertMoney(Customer customer, String productName) {
		for (Product product : this.productArray) {
			if (product.equals(productName)) {
				this.money += product.getPrice();
				customer.pay(product.getPrice());
				break; // 반복중단
			}
		}

	}

	@Override
	public void pressButton(Customer customer, String productName) {
		this.pressButton(customer, productName, VendingMachine.PRODUCT_COUNT);

	}

	@Override
	public void pressButton(Customer customer, String productName, int orderCount) {
		for (Product product : productArray) {
			if (product.getName().equals(productName)) {
				if (product.getQuantity() < 0) {
					this.refund(customer, product.getPrice());
					return; // 메소드를 종료.
				}

				if (product.getQuantity() < orderCount) {
					this.refund(customer, product.getPrice());
					return; // 메소드 종료
				}

				int quantity = product.getQuantity();
				quantity -= orderCount;
				product.setQuantity(quantity);

				customer.addStock(product.getName(), product.getPrice(), orderCount);
			}
		}
	}

	protected void refund(Customer customer, int refundMoney) {
		
	}

	@Override
	public void printProducts() {
		System.out.println("자판기의 상품 금액: " + this.getMoney());
		for (Product product : this.productArray) {
			if (product != null) {
				System.out.println("자판기의 상품 수량: " + product.getQuantity());
				System.out.println("자판기의 상품 이름: " + product.getName());
			}
		}
	}

//	public VendingMachine() {
//		super();
//	}
//
//	public VendingMachine(int money) {
//		super(money); // 슈퍼 클래스의 int 파라미터가 있는 생성자를 호출한다.
//	}
//	
//	@Override
//	protected void refund(Customer customer, int refundMoney) {
//		System.out.println("재고가 없습니다.");
//		System.out.println("환불은 못 해드려요.");
//	}

}
