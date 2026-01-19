package Main;

import deal.Transaction;
import trading.Expense;
import trading.Income;
import trading.Transfer;

public class MainMethod {

	public static void main(String[] args) {

		int balance=0;   //잔액 
		Transaction[] transactions = {      // 부모 클래스 Transaction(int amount, String date, String memo)
	            new Expense(-5000, "1월12일 월요일 ", "식비"),
	            new Expense(-6000, "1월13일 화요일", "식비"),
	            new Transfer(-30000, "1월 14일 수요일", "기름값"), 
	            new Transfer(-7000, "1월 15일 목요일", "식비"), 
	            new Income(80000, "1월 15일 금요일", "알바비"),
	            new Transfer (-10000, "1월16,17일 ","감기약" )
		};

	        for(Transaction t : transactions) {
	            t.balance();  // 반복문으로 부모클래스 t 를 반복해서 출력 출력 내용은  amount  date   memo
	             balance += t.amount;  // 부호로 잔액 조절
	             System.out.println(t+"\n[현재 잔액 :"+balance + "원]");
	           
	        }
	       
	        System.out.println("=======================");
	        System.out.println("현재 남은 잔액 : " + balance + "원");
	    }
		
		
		
	}


