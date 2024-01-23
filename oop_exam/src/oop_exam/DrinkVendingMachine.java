package oop_exam;

public class DrinkVendingMachine {

	/**
	 * 상품1
	 */
	Drink drink1;
	
	/**
	 * 상품2
	 */
	Drink drink2;
	
	/**
	 * 상품3
	 */
	Drink drink3;
	
	/**
	 * 상품4
	 */
	Drink drink4;
	
	public DrinkVendingMachine() {		//DrinkVendingMachine 생성자로 인스턴스 생성 시 생성된다.
		this.drink1 = new Drink(); 		//드링크 클래스를 인스턴스로 drink1 이름으로 생성      
		this.drink1.name = "박카스"; 	//drink1.이름에 박카스로 값 변경
		this.drink1.price = 900; 		//drink1.가격에 900 으로 값 변경
		this.drink1.stock = 15; 		//drink1.재고에 15 로 값 변경
		
		this.drink2 = new Drink();    	//드링크 클래스를 인스턴스로 drink2 이름으로 생성           
		this.drink2.name = "몬스터";   //drink2.이름에 몬스터로 값 변경                
		this.drink2.price = 1500;     	//drink2.가격에 1500 으로 값 변경             
		this.drink2.stock = 20;       	//drink2.재고에 20 로 값 변경               
		
		this.drink3 = new Drink();      	//드링크 클래스를 인스턴스로 drink3 이름으로 생성        
		this.drink3.name = "핫식스";     //drink3.이름에 핫식스로 값 변경                
		this.drink3.price = 1300;       	//drink3.가격에 1300 으로 값 변경             
		this.drink3.stock = 10;         	//drink3.재고에 10 로 값 변경               
		
		this.drink4 = new Drink();       	//드링크 클래스를 인스턴스로 drink4 이름으로 생성      
		this.drink4.name = "밀키스";      //drink4.이름에 밀키스로 값 변경                
		this.drink4.price = 1400;        	//drink4.가격에 1400 으로 값 변경             
		this.drink4.stock = 5;           	//drink4.재고에 5 로 값 변경               
	}
	
	/**
	 * 주문하기
	 * @param name 주문할 상품의 이름
	 * @param quantity 주문할 수량
	 * @return 주문한 상품의 정보
	 */
	public Drink order(String name, int quantity) {
		Drink orderedDrink = null; //드링크 클래스의 기본값을 null 형태로 할당
		
		// String 비교는 == 으로 할 수 없습니다.
		// 단, hard-coding된 String은 == 으로 비교할 수 있지만 추천하지 않습니다.
		// String은 "문자열".equals("비교할 문자열")과 같이 equals 메소드를 통해서 해야 합니다.
		if (this.drink1.name == name) {								//드링크1의 이름이 파라미터로 넘어온 이름과 같다면
			if (this.drink1.stock < quantity) {						//드링크1의재고가 파라미터로 넘어온 재고보다 적다면
				System.out.println("상품이 품절되었습니다.");		//상품이 품절되었습니다.를 출력
				return null;										//null 반환
			}
			this.drink1.stock -= quantity;							//드링크1의 재고가 파라미터로 넘어온 재고보다 많으면 드링크1의 재고에 재고 파라미터로 넘어온 재고값을 빼서 재할당
			orderedDrink = new Drink();								//반환할 드링크 인스턴스 생성
			orderedDrink.name = this.drink1.name;					//반환할 드링크 인스턴스의 이름값에 드링크1의 이름값 할당
			orderedDrink.stock = quantity;							//반환할 드링크 인스턴스의 재고값에 넘어온 파라미터 재고 값 할당
			orderedDrink.price = this.drink1.price;					//반환할 드링크 인스턴스의 가격값에 드링크1의 가격값 할당
		}
		else if (this.drink2.name == name) {                  		//드링크2의 이름이 파라미터로 넘어온 이름과 같다면                                                         		                                                
			if (this.drink2.stock < quantity) {               		//드링크2의재고가 파라미터로 넘어온 재고보다 적다면                                                                          
				System.out.println("상품이 품절되었습니다.");       //상품이 품절되었습니다.를 출력                                                                         
				return null;                                        //null 반환                                                                             
			}                                                                                                                                                                               
			this.drink2.stock -= quantity;                          //드링크2의 재고가 파라미터로 넘어온 재고보다 많으면 드링크2의 재고에 재고 파라미터로 넘어온 재고값을 빼서 재할당                     
			orderedDrink = new Drink();                             //반환할 드링크 인스턴스 생성                                                                     
			orderedDrink.name = this.drink2.name;                   //반환할 드링크 인스턴스의 이름값에 드링크2의 이름값 할당                                                     
			orderedDrink.stock = quantity;                          //반환할 드링크 인스턴스의 재고값에 넘어온 파라미터 재고 값 할당                                                 
			orderedDrink.price = this.drink2.price;					//반환할 드링크 인스턴스의 가격값에 드링크2의 가격값 할당
		}
		else if (this.drink3.name == name) {						//드링크3의 이름이 파라미터로 넘어온 이름과 같다면  
			if (this.drink3.stock < quantity) {						//드링크3의재고가 파라미터로 넘어온 재고보다 적다면
				System.out.println("상품이 품절되었습니다.");		//상품이 품절되었습니다.를 출력
				return null;										//null 반환
			}
			this.drink3.stock -= quantity;
					orderedDrink = new Drink();                     //드링크3의 재고가 파라미터로 넘어온 재고보다 많으면 드링크3의 재고에 재고 파라미터로 넘어온 재고값을 빼서 재할당          
					orderedDrink.name = this.drink3.name;           //반환할 드링크 인스턴스 생성                                                          
					orderedDrink.stock = quantity;                  //반환할 드링크 인스턴스의 이름값에 드링크3의 이름값 할당                                          
					orderedDrink.price = this.drink3.price;         //반환할 드링크 인스턴스의 재고값에 넘어온 파라미터 재고 값 할당                                      
		}
		else if (this.drink4.name == name) {                      	//드링크3의 이름이 파라미터로 넘어온 이름과 같다면                  
			if (this.drink4.stock < quantity) {                   	//드링크3의재고가 파라미터로 넘어온 재고보다 적다면                  
				System.out.println("상품이 품절되었습니다.");       //상품이 품절되었습니다.를 출력                                  
				return null;                                      	//null 반환                                      
			}
			this.drink4.stock -= quantity;                       	//드링크4의 재고가 파라미터로 넘어온 재고보다 많으면 드링크4의 재고에 재고 파라미터로 넘어온 재고값을 빼서 재할당          
			orderedDrink = new Drink();                         	 //반환할 드링크 인스턴스 생성                                                          
			orderedDrink.name = this.drink4.name;                	//반환할 드링크 인스턴스의 이름값에 드링크4의 이름값 할당                                          
			orderedDrink.stock = quantity;                       	//반환할 드링크 인스턴스의 재고값에 넘어온 파라미터 재고 값 할당                                      
			orderedDrink.price = this.drink4.price;
		}
		
		return orderedDrink;										//만들어진 Drink 인스턴스 리턴
	}
	
	/**
	 * 입고하기
	 * @param name 입고할 상품의 이름
	 * @param quantity 입고할 상품의 수량
	 */
	public void fill(String name, int quantity) {	
		if (this.drink1.name == name) {								//드링크1 인스턴스의 이름과 파라미터로 넘어온 이름이 같다면
			this.drink1.stock += quantity;							//드링크1 인스턴스의 재고값을 드링크1 인스턴스의 재고값 + 넘어온 파라미터 재고값으로 재할당
		}
		else if (this.drink2.name == name) {                        //드링크2 인스턴스의 이름과 파라미터로 넘어온 이름이 같다면                    
			this.drink2.stock += quantity;                          //드링크2 인스턴스의 재고값을 드링크2 인스턴스의 재고값 + 넘어온 파라미터 재고값으로 재할당 
		}
		else if (this.drink3.name == name) {                        //드링크3 인스턴스의 이름과 파라미터로 넘어온 이름이 같다면                    
			this.drink3.stock += quantity;                          //드링크3 인스턴스의 재고값을 드링크3 인스턴스의 재고값 + 넘어온 파라미터 재고값으로 재할당 
		}
		else if (this.drink4.name == name) {                        //드링크4 인스턴스의 이름과 파라미터로 넘어온 이름이 같다면                    
			this.drink4.stock += quantity;                          //드링크4 인스턴스의 재고값을 드링크4 인스턴스의 재고값 + 넘어온 파라미터 재고값으로 재할당 
		}
	}
	
	/**
	 * 상품 출력
	 */
	public void printStock() {
		System.out.println("===============================");		//출력
		System.out.println("자판기 재고 상황 출력");				//출력
		System.out.println("===============================");		//출력
		System.out.println("상품1: " + this.drink1.name + ", " + this.drink1.price + ", " + this.drink1.stock); //드링크1 인스턴스의 내용 출력
		System.out.println("상품2: " + this.drink2.name + ", " + this.drink2.price + ", " + this.drink2.stock); //드링크2 인스턴스의 내용 출력
		System.out.println("상품3: " + this.drink3.name + ", " + this.drink3.price + ", " + this.drink3.stock); //드링크3 인스턴스의 내용 출력
		System.out.println("상품4: " + this.drink4.name + ", " + this.drink4.price + ", " + this.drink4.stock); //드링크4 인스턴스의 내용 출력
		System.out.println();	//출력
	}
	
}