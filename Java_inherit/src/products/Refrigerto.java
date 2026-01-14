package products;

import common.Appliance;

public class Refrigerto extends Appliance { //냉장고

	public Refrigerto() {
		power();
	}
	
	
	@Override
	public void power() {
		System.out.println("냉장고가 가동을 시작합니다.");
	}
}

