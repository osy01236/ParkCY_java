package test;

import java.util.Scanner;

public class test20260107 {

	public static void main(String[] args) {
//영화관 좌석은 이며, 1차배열로 관리한다.  

//0 : 빈 좌석  1 : 예약된 좌석
         //사용자로부터  예약인원 수 를 입력받아         -입력
		//원하는 위치(인덱스) 탐색하여 연속된 빈 좌석이 있으면 예약 처리하시오.
//규칙
//연속된 빈 좌석이 있으면 1로 변경
//예약이 완료되면 예약된 좌석 번호 출력
//연속 좌석이 없으면
//"연속 좌석이 없습니다" 출력
//1차원 배열만 사용
//앞자리 우선 예약
// 예시
//예약 인원 수 : 3
//3석 예약 완료 (1번 ~ 3번)
//예약 인원 수 : 5
//연속 좌석이 없습니다
int[] seats = new int[50];   //1차원 배열 50의 크기
	
	Scanner sc = new Scanner(System.in);
	
	
	for(int i=0; i<seats.length; i++) {
		seats[i]=(int) Math.floor(Math.random()*2);
					
		System.out.printf(seats[i]+"  ");
	}
		
	
		
	System.out.println("\n입력 : ");
	int user=sc.nextInt();
	for(int i=0; i<seats.length; i++) {
		if(seats[i] ==user) {
			seats[i]=1;
		}
	}
	
	
	
	
	
	
	
	



			
	
	}
	

}
