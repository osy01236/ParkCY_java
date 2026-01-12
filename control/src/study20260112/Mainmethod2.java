package study20260112;

public class Mainmethod2 {

	public static void main(String[] args) {
		// 
		Vending orange = new Vending("쿠우 오렌지", 1500, 4);
		Vending top = new Vending("top 블랙 ", 2700, 3);
		
		
		
		System.out.println(orange);
		System.out.println(top);
		
		
		orange.buy(3000);
		System.out.println(orange);

		top.buy(2000);
		System.out.println(top);

		orange.SoldOut();
		System.out.println(orange);
	
		orange.puls(4);
		System.out.println(orange);
		
	}

}
