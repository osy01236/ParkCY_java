package trading;

import deal.Transaction;

public class Expense extends Transaction {
		     //지출
	public Expense(int amount, String date, String memo) {
		super(amount, date, memo);
	}

	@Override
	public void balance() { //잔액
		
		System.out.println("[지출 : "+amount+"원]");
		
	}
}
