package trading;

import deal.Transaction;

public class Income extends Transaction{
	   //	수입

	
	public Income(int amount, String date, String memo) {
		super(amount, date, memo);
	}
	@Override
	public void balance() { //잔액
		System.out.println("[수입 : "+amount+"원]");
		
	}
		}
