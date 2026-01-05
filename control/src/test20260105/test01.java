package test20260105;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
//		1월 5일 과제
	//	
//		가위 바위 보 게임을 총 15판 진행
//		게임을 진행 하면서 1판 끝날때 마다 
//		몇승 몇패 몇무 출력하기

		int count =0;
		int count2=0;
		System.out.print("1=가위, 2=바위, 3=보");
		
		
		
		
		
		
		for(int i = 1 ; i>=15; i++) {
			int com = (int)Math.floor(Math.random()*3)+1;
			int user = (int)Math.floor(Math.random()*3)+1;
			
			int num = user - com;
			if(num == 0 ) {
				count++;
				System.out.println("무승부");
			}else if(num == -2 || num == 1);
				count2++;
			    System.out.println("나의 승리");
			
		}
		System.out.println("무승부 :" + count);
		System.out.println("나의 승리 :" + count2);
	}		
}
