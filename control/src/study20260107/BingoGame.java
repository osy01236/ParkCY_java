package study20260107;

import java.util.Arrays;
import java.util.Scanner;

public class BingoGame {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		//1차원 배열 25의 크기
		// 배열에 무작위 숫자 저장하기 (1~100)

		
		int[] binggo = new int[25];
		
		for(int i=0; i<binggo.length; i++) {               
		binggo[i] = (int)Math.floor(Math.random()*100)+1;
			for(int k = 0; k<i; k++) {
				if(binggo[i] == binggo[k]) {
					i--;
					break;
				}
			}
		}
		
		
		
		//25개 숫자 빙고판 모양으로 출력하기
		//5줄 5칸으로 출력하기
		
		// %d-정수   %f-실수   %c-문자   %s-문자열   %o-8진수  %x-16진수
	while(true) {	
		        System.out.println("┌─────┬─────┬─────┬─────┬─────┐");
	        for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5; k++) {
				if(binggo[i*5+k] == 0)
					
					System.out.printf("│ %3c ",'■');
				
				else
				System.out.printf("│ %3d ", binggo[i * 5 + k]);

			}
			if (i == 4)
				System.out.println("│\n└─────┴─────┴─────┴─────┴─────┘");
			else
				System.out.println("│\n├─────┼─────┼─────┼─────┼─────┤");
							
}


		//빙고를 위해 숫자 입력 만들기
	        System.out.printf("입력 : ");
	        int user = sc.nextInt();
		for(int i=0; i<binggo.length; i++) {  //배열에서 내가 입력한 숫자 찾기
			if(binggo[i] == user) {   //입력한 값이 배열에 있다면
				binggo[i] = 0;   // 화면의 체크표시를 위해 0으로 변경
			}
		}
		
	
		
		//가로 세로 대각선 빙고 확인하기
//		for(int i= 0; i<5; i++) { //줄 단위 표현을 i변수이다.
//			row=0;
//			for(int k=0; k<5; k++){//열 단위 표현은 k 변수이다.
//				if(binggo[i*5+k] == 0)row++;
//			}
//			if(row==5) end++;  //해딩 줄에 0이 5개라면 row는 5가 된다 1빙고완성
//		}
		//0,0   0,1   0,2   0,3   0,4
		//1,0
		//2,0
		//3,0    
		//4,0

		//세로빙고 확인
		
		int end=0;  //현재 몇 빙고인지
		int row=0;		//가로방향(줄 단위) 0개의 갯수가 몇개인지 확인
		
		int col=0;
		int cross1=0;
		int cross2=0;
		for(int i=0; i<5; i++) {            //줄 단위 표현은 i 변수이다
			row=0;
			col=0;
			
			
			for(int k=0; k<5; k++) {        //열 단위 표현은 k 변수이다
				if(binggo[i*5+k]==0) row++;
				if(binggo[k*5+i]==0) col++;
		
			}
			if(row==5) end++;               //해당 줄에 0이 5개라면 row는 5가 된다 .1빙고 완성
			if(col==5) end++;               //해당 열에 0이 5개라면 col은 5개가 된다 1빙고 완성
            if(binggo[i*6]==0) cross1++;
            if(binggo[i*4+4]==0) cross2++;
            
            if(cross1==5) end++;
            if(cross2==5) end++;
            
		}
		

		
	
	System.out.println("완성된 빙고 :"+end);

	
	if(end==5) {
		System.out.println("5줄 빙고 완성 !!!");
		break;
	 }
  }	
	
	
	
	
	
	//		System.out.println(Arrays.toString(binggo));
	
}

}
