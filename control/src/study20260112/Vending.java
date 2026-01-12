package study20260112;

public class Vending {
	//자판기 클래스
	
	private String productName;  //제품이름
	private int price;           //가격
	private int stpck;           //재고
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int getStpck() {
		return stpck;
	}
	public void setStpck(int stpck) {
		this.stpck = stpck;
	}
	
	
	public Vending(String productName, int price, int stpck) {
		super();
		this.productName = productName;
		this.price = price;
		this.stpck = stpck;
	}
	
	
	@Override
	public String toString() {
		return "Vending [productName=" + productName + ", price=" + price + ", stpck=" + stpck + "]";
	}
	
	
	//toString 과 매개변수 있는 생성자 메서드,
	//각 변수들의 set , set 메서드 만들기
	
	//문제
	//    음료를 구매하기 위해 돈을 넣었다.
	//    내가 넣은 돈으로 구매가 가능하면
	//    수량을 1 감소 시키세요.
	
	public void buy ( int money) {
		if( price<=money) {
			stpck--;
			
		}
	}
	
	//문제2
	// 음료를 자판기에서 구매하는데       돈을 넣었어
	// 수량이 충분한지 아니면 품절인지     stpck 재고를 보고
	// 확인할 수 있는 메서드 만들기       재고 출력하고
	// 품절이면 " 품절입니다." 출력      stpck == 0; 경우 "품절입니다."
	//수량이 있으면 수량 출력            stpck <= 1; stpck 출력
	
	public void SoldOut() {
	if(this.stpck==0) {
		System.out.println("품절입니다.");
	}else 
		System.out.println("잔여수량 "+this.stpck);		
	}
	
	//문제3
	// 음료수의 수량이 부족하여 자판기 관리자가 채우려고한다.  
	// 해당 음료수의 수량을 채우기 위해 얼만큼 넣었는지        
	// 그리고 해당 음료수의 수량을 증가시켜주세요.  
	
	public void puls(int num) {
		
		this.stpck= num +this.stpck;
		System.out.println("추가된 음료 수량 : "+num+"개"+"\n합쳐진 음료 수량 : "+this.stpck+"개");
	}
	
}
