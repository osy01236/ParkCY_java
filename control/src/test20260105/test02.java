package test20260105;

import java.util.Scanner;

public class test02 {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("================= 숫자 야구 ================");
		
		int com1 =(int)Math.floor(Math.random()*9)+1;
		int com2=0; 
		int com3=0;
		while(true) {    //숫자 3개가 중복 없이 나오 하기
			 com2 =(int)Math.floor(Math.random()*9)+1 ; 
			 com3 =(int)Math.floor(Math.random()*9)+1 ;
			if( com1 != com2 && com1 != com3 && com2 !=com3) break;		
		}
			
		
		while(true) { 
			
			int str=0 , ball=0;
		System.out.println("1~9중에 숫자 세개 입력 : ");
			int user1= sc.nextInt();
			int user2= sc.nextInt();
			int user3= sc.nextInt();
		
			if(com1 ==user1) str++;
			if(com2 ==user2) str++;
			if(com3 ==user2) str++;
			
			if(user1 == com2 || user1 == com3) ball++;
			if(user2 == com1 || user2 == com3) ball++;
			if(user3 == com1 || user3 == com2) ball++;
			
			System.out.println(str+" 스트라이크 "+ ball+" 볼 "+(3-str-ball)+"아웃");
		}

		}
		
		}