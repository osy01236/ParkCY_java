package deal;

public abstract class Transaction {

	public int amount;    //금액
	protected String date;   //날짜
	protected String memo;	 //메모
	

	public Transaction() {	}

	public Transaction(int amount, String date, String memo) {
		super();
		this.amount = amount;
		this.date = date;
		this.memo = memo;
	}


	public abstract void balance(); //잔액
	
	
	
	@Override
	public String toString() {
		return "[현재 잔액 :" + amount + "원] [날짜:" + date + "] [비고 :"  + memo + "]";
	}

}
