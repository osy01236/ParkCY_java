package Main;

import deal.Transaction;
import trading.Expense;
import trading.Income;
import trading.Transfer;

public class MainMethod {

	public static void main(String[] args) {

		int balance=0;
		Transaction[] transactions = {
	            new Expense(-5000, "1월12일 월요일 ", "식비"),
	            new Expense(-6000, "1월13일 화요일", "식비"),
	            new Transfer(-30000, "1월 14일 수요일", "기름값"), 
	            new Transfer(-7000, "1월 15일 목요일", "식비"), 
	            new Income(100000, "1월 15일 금요일", "중고판매")
		
		};

	        for(Transaction t : transactions) {
	            t.balance();  // 처리 메시지 출력
	             balance += t.amount;  // 부호로 잔액 조절
	             System.out.println(t+"\n[현재 잔액 :"+balance + "원]");
	           
	        }
	       
	        System.out.println("=======================");
	        System.out.println("현재 남은 잔액 : " + balance + "원");
	    }
		
		
		
	}


