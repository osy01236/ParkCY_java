package study20260105;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		//Integer.parseInt () 정수값으로 변경 할수 있다
		//math.floor()  소수점자르기
		                                                       //표현하고자하는 값      //7 ~ 15 범위
//		double num =(int)Math.floor(Math.random()*9)+7;    //7은 최소 값 9 값은 구하고자 하는 최대값(15) - 최소값 (7) +1 
//		System.out.println( num );

		//동전의 앞면 뒷몇 맞추기
		
//		Scanner sc = new  Scanner(System.in);
		
//		int coin = (int)Math.floor(Math.random()*2)+1;

//		//1 -앞면 ,  2 - 뒷면
//	
//		System.out.print("동전 앞면 뒷면 맞추기");
//		System.out.println("1-앞면 , 2-뒷면 \n 입력 : " );
//		int user = sc.nextInt();
//		
//		if(user == coin ) 
//			System.out.println("맞추기 성공!!");
//		else
//			System.out.println("맞추기 실패..");
//			
//		
//		int dice =(int)Math.floor(Math.random()*6)+1;
//		
//		System.out.println("주사위 숫자 맞추기");
//		System.out.print("1 ~ 6중에 하나 입력: ");
//		int num = sc.nextInt();
//		
//		if(num == dice)
//			System.out.println("숫자 맞추기 성공");
//		else
//			System.out.println("숫자 맞추기 실패");
//			
//		
	
		
//		//컴퓨터 주사위
//		int com = (int)Math.floor(Math.random()*6)+1;
//		
//		//내 주사위
//		int user = (int)Math.floor(Math.random()*6)+1;
//		
//		//내가 컴퓨터 보다 큰가 작은가 아니면 비겼나?
//		
//		
//		if(user > com || (user==1 && com==6)) {
//			if(user ==6 && com ==1)
//				System.out.println("나의 패배");
//			else 
//				System.out.println("나의 승리");
//			System.out.println("나의 승리");
//		}else if (user == com)
//			System.out.println("무승부");
//		else 
//			System.out.println("나의 패배");
		
		
		
		//컴퓨터 와 함께 하는 가위바위보 게임 !!
		//1 - 가위 2- 바위- 3-보
		
		//컴퓨터의 가위바위보는 랜덤으로
		//나의 가위바위보 값은 키보드로 입력으로
		//내가 이겼는지, 졌는지 , 비겼는지 출력하세요.
		
		
		int com = (int)Math.floor(Math.random()*3)+1;
//		int user = (int)Math.floor(Math.random()*3)+1;
		
		System.out.print("컴퓨터랑 가위 바위 보 게임\n1 = 가위 2 = 바위 3 = 보 \n숫자입력: ");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		System.out.println("컴퓨터 :"+com+" 나 :"+user);
		
		int res = user-com;
		if (res==0)
			System.out.println("무승부");
		else if( res== -2 || res ==1)
			System.out.println("나의 승리");
		else
			System.out.println("나의 패배");
		
		
//		if(user == com )
//			System.out.println("나의 무승부");
//		else if((user == 1 && com ==3) || user ==2 && com==3 ||(user==3 && com==1)) {
//			
//			System.out.println("나의 승리");
//			}
//		else 
//			System.out.println("나의 패배");
//			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}


