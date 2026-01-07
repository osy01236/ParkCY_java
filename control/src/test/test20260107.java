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
	
	Scanner sc = new Scanner(System.in);           //인원수 입력
	
	for(int i=0; i<seats.length; i++) {       //0부터 49까지
		System.out.printf("%3d",i+1);        //영화관 좌석 번호 1~50
	}
	
	
	System.out.println();
	for(int i=0; i<seats.length; i++) {      //0부터 시작해서 49까지 반복
		seats[i]=(int) Math.floor(Math.random()*2); //0부터 49지 0 1 랜덤으로 
		System.out.printf("%3d",seats[i]);
	}
		
	
		
	System.out.print("\n예약된 인원수 : ");  
	int user=sc.nextInt();               //예약인원수 입력
	
	for(int i = 0; i< seats.length; i++) {  // 0부터 시작 49까지 반복
		
		if(i+user > seats.length)   //i번쨰부터 예약인원수 만큼 확인안되면  종료
		break;                        
	
		int a;                 //시작 i번째부터 몇칸까지 확인    
	for(a= 0; a< user; a++) {  //i번쨰 부터 user개 좌석을 +1 씩확인
		
		if(seats[i+a]==1);    // i번째부터 a번째 떨어진 자리 인데 값이 1일경우 종료
		break;
	}

	System.out.println();





	}			
	
	}
	
}

