package study20260102;

import java.util.Scanner;

public class MainMethod2 {

	public static void main(String[] args) {
		 
		
		//if 문
		// 주차장에 요금이 기본요금은 1000원입니다.
		//기본시간은 30분입니다.
		//10분 당 100원씩 추가                       예)39분은 1000원 
		                                          //40분은 1100원
		   
		//단 4시간 이상 주차시 기본요금은 2500원이다.
		//                                        예)3시간 50분(230분) - 3000원
		//                                        예)4시간 12분(252분) ->2600원
		//분을 적으면 요금이 얼마나 나오는지 하라
	    //10분당 100원
		
		//
		// 기본  1000원 30분
		//             min                            
		//   -  1100원 40분 = 1000원 30분 + 100원 10분  
		//
		//   1000   (40-30)*10  100 1.0    
		//           42 30 12*10   120    120*10
        //                     
		//           42 30 12*100    1200/100 = 1.2=1.0*100
		//
		//           42 30 12/10  =  1.2  =  1.0 * 100              
		//
		
  
		

		int money = 1000;
		int time = 30;
		
		int hh4 = 240;
		int mh4 = 2500;
		
		
		System.out.print("몇분 주차 : ");
		Scanner kbd = new Scanner(System.in);
		int min = kbd.nextInt();
		
	
		
		if(min == 0) {
			System.out.println("0원");
		}
		else if(min <= 1 || min < time) {
			System.out.println(money+"원");
		}
		else if(min >= time && min < mh4)  {
			System.out.println(money+((min-time)/10)*100+"원");
//		if(min >=40  && min<50)  {
//			System.out.println("1100원");}
//		if(min >=50  && min<60)  {
//			System.out.println("1200원");}
//		if(min >=60  && min<70)  {
//			System.out.println("1300원");}
//		if(min >=70  && min<80)  {
//			System.out.println("1400원");}
//		if(min >=80  && min<90)  {
//			System.out.println("1500원");}
//		if(min >=90  && min<100) {
//			System.out.println("1600원");}
//		if(min >=100 && min<110) {
//			System.out.println("1700원");}
//		if(min >=110 && min<120) {
//			System.out.println("1800원");}
//		if(min >=120 && min<130) {
//			System.out.println("1900원");}
//		if(min >=130 && min<140) {
//			System.out.println("2000원");}
//		if(min >=140 && min<150) {
//			System.out.println("2100원");}
//		if(min >=150 && min<160) {
//			System.out.println("2200원");}
//		if(min >=160 && min<170) {
//			System.out.println("2300원");}
//		if(min >=170 && min<180) {
//			System.out.println("2400원");}
//		if(min >=180 && min<190) {
//			System.out.println("2500원");}
//		if(min >=190 && min<200) {
//			System.out.println("2600원");}
//		if(min >=200 && min<210) {
//			System.out.println("2700원");}
//		if(min >=210 && min<220) {
//			System.out.println("2800원");}
//		if(min >=220 && min<230) {
//			System.out.println("2900원");}
//		if(min >=230 && min<240) {
//			System.out.println("3000원");
//		
		}else if (min >= 240 ) {
			System.out.println(mh4+((min-hh4)/10)*100+"원");
			
	}
		
			
		
		
		
		
	}

}
	