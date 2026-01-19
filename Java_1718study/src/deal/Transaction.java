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


	public abstract void balance(); //잔액 이란 것이 있고 3명이서 알아서 계산해라 부모는 터치 안한다.
	
	
	
	@Override
	public String toString() {
		return "[현재 잔액 :" + amount + "원] "
		     + "[날짜:" + date + "] "
		     + "[비고 :"  + memo + "]";
	}

	
	
	
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	
}
