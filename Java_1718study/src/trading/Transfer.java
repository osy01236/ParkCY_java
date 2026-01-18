package trading;

import deal.Transaction;

public class Transfer extends Transaction{
        	//이체

	public Transfer(int amount, String date, String memo) {
		super(amount, date, memo);
	}
	@Override
	public void balance() { //잔액
		if(amount > 0) {
            System.out.println("[받은 금액 :" + amount + "원]");
        } else {
            System.out.println("[보낸 금액 :" + amount + "원]");
        }
    }	
	
}
