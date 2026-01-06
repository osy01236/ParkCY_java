package test20260105;

import java.util.Scanner;



public class test01 {

	public static void main(String[] args) {
//		1월 5일 과제
	//	
//		가위 바위 보 게임을 총 15판 진행  -자동으로 15회
//		게임을 진행 하면서 1판 끝날때 마다 
//		몇승 몇패 몇무 출력하기

		System.out.print("가위 바위 보 게임을 진행합니다.\n1=가위, 2=바위, 3=보 ");
		
//		Scanner sc= new Scanner(System.in);
	
		int DrawCount  = 0, WinCount = 0, LoseCount = 0;
		

		for (int i = 1; i <= 15; i++) {
			int com = (int) Math.floor(Math.random() * 3) + 1; // 컴퓨터 가위 바위 보
			int user = (int) Math.floor(Math.random() * 3) + 1; // 사용자 가위 바위 보
//			int user = sc.nextInt();

			System.out.println("\n==========");
			System.out.println("컴퓨터 : " + com + " :"); // 컴퓨터 값
			System.out.println(" Ai  : " + user + " :"); // 사용자 값
			System.out.println("==========");

			int num = user - com;

			if (num == 0) { // 무승부 조건 num 값이 0일 경우
				DrawCount++;
				System.out.println("결과 : 무승부");
			} else if (num == -2 || num == 1) { // 승리 조건 num이 -2 또는 1일 경우
				WinCount++;
				System.out.println("결과 : 승리");
			} else {
				LoseCount++; // 그 외 조건 패배 ?
				System.out.println("결과 : 패배");
			}

			System.out.println("\n무승부: "+ DrawCount + "무" + " 승리: "+WinCount+"승" + " 패배: " + LoseCount + "패");

		}
	}

}