package mainpkg;

import able.Actionable;
import dto.Cafe;
import dto.Member;

public class MainMethod {

	public static void main(String[] args) {
		//서로 다른클래스들의 하나의 이름으로 통합해서 사용할수 있게해주는 동작
		//주목적 설계도 
	
//		Actionable member = new Member("skyblue","이순신",34); 
//		
//		member.move();
//		member.drink();
//		System.out.println(member.toString());
	
		String[] menu= {"아메리카노","라떼","녹차","홍차","치즈케이크","티라미슈"};
		
		Cafe cafe = new Cafe("찬용카페", menu);
		
		cafe.showMenu();
		System.out.println("================   \n\n");
	
		cafe.order("녹차");
		System.out.println("================   \n\n");
		
		cafe.order("치즈케이크");
		System.out.println("================   \n\n");

		cafe.order("사이다");
		System.out.println("================   \n\n");

	
	}
	

}
