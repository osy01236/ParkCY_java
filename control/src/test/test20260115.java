package test;

import java.util.Scanner;

public class test20260115 {

	public static void main(String[] args) {
		
		//난이도 하 1~10 문제
		//1번.기본 자료형
		//정수형 변수 a에 10, 실수형 변수 b에 3.5를 저장하고 두 변수의 합을 출력하시오.
		int a=10;
		double b= 3.5;
		
		double sum=a+b;
		System.out.println(sum);
	
		
		
		//2번. 상수
        //원주율을 상수 PI로 선언하고, 반지름이 5인 원의 넓이를 구해 출력하시오.
        //(공식: 넓이 = PI × r × r)
	
		double PI=3.14;
		int r = 5;
		
		double ext= PI*r*r;
		System.out.println(ext+"m2");
		
	
		//3번. 형변환
		//정수형 변수 a = 7, b = 2가 있을 때
		//두 수를 나눈 결과를 실수로 출력하시오.
	
		int a1=7, b1=2;
		
		double sum1 = a1+b1;
		
		System.out.println(sum1);
		
		
		
		//4번. 산술 연산자
        // 정수 num이 주어졌을 때,
        // num의 몫과 나머지를 각각 출력하시오.
        // (예: num = 17, 나누는 수는 5)
	
		int num4= 17;
		int num_4= 5;
		System.out.println(num4/num_4);
		System.out.println(num4%5);
		
		
	
		//5번. 논리 연산자
		//정수 age가 주어졌을 때
		//age가 20 이상이고 30 이하이면 true, 아니면 false를 출력하시오.
	
		int age=40;
		
		if(age <= 30 && age>=20)
		System.out.println(true);
		else
			System.out.println(false);
		
		
	
		
		//6번. 대입 연산자

        //정수 x = 10이 있을 때

        //+=, -=, *= 연산자를 각각 한 번씩 사용하여 최종 결과를 출력하시오.
		
		int x = 10;
		
		System.out.println(x);
		
		
		
		//7번. if ~ else
		//	정수 변수 score를 선언하고 0~100 사이 값으로 초기화하시오.
        //score가 60 이상이면 "합격"을 출력
        //60 미만이면 "불합격"을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : "); 
		int score =sc.nextInt();
		if(score >= 60)
			System.out.println("합격");
			else
				System.out.println("불합격");
		
		
		
		//8번. 문자열 비교
        //문자열 변수 str을 선언하고 "java"로 초기화하시오.
        //str이 "java"이면 "자바"를 출력
        //아니면 "기타"를 출력
		
		String str = "java";

		if(str.equals("java")) {
		    System.out.println("자바");
		} else {
		    System.out.println("기타");
		}
		
		//9번. for문
        //정수 변수 i를 1로 초기화하고, 1부터 10까지 한 줄에 하나씩 출력하는 반복문을 작성하시오.
		int i=0;
		for(i= 0;  i<10; i++)
		System.out.println(i+1);
		
		
		
		
		
		//10번. while문
        //정수 변수 n을 5로 초기화하고,
        //n이 1보다 크거나 같을 동안 반복하며
        //반복할 때마다 n을 1씩 감소시키면서 출력
		int n =5;
		while(1<=n){
			System.out.println(n);
			n--;
		}
	}

}
