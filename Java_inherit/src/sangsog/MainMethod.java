package sangsog;

import products.Aircon;
import products.Refrigerto;
import products.Television;

public class MainMethod {

	public static void main(String[] args) {
		
			
		Television tv = new Television(); 
			tv.power();
			tv.power();	
		
			Refrigerto refrigerto = new Refrigerto();
			
			Aircon air = new Aircon("LG전자",310);
			
			System.out.println(air);
			
	}
	}



// 자바의 상속
// 오버라이딩  <- 부모로부터 물려받은 메소드의 내용만 바꾸는것
// 다형성   <- 이거때문에 상속을 하는거임~
// 추상화
//protected
// final
//instanceof


//상속공부 하기 위해 사용할만한 주제       //상속 = 부모와 자식
//  동물 에 대한 상속
//  직원 급여 계산 시스템 -  직원 부모 - 
//  결제 세스템  결제 부모 , 카드결제, 현금 , 이체는 자식
//  게임 캐릭터  캐릭터 부모, 직업들이 자식
//  교통수단 시스템	 교통수단 부모, 버스, 기차, 차, 오토바이 , 자전거

