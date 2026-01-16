package test;

public class test20260115_2 {

	public static void main(String[] args) {
		//난이도 중 ? 11번~ 20번 문제

		//11번. if ~ else if
		//정수 변수 score를 선언하고 0~100 사이 값으로 초기화하시오.
		//score가 90 이상이면 "A"
		//80 이상이면 "B"
		//70 이상이면 "C"
		//그 외는 "F"를 출력
		
		
		int score = 40;
		
		if(score >= 90)
			System.out.println("A");
		else if (score >=80)
			System.out.println("B");
		else if (score >=70)
			System.out.println("C");
		else
			System.out.println("F");
		
		
		
		
		//12번. switch ~ case
		//정수 변수 month를 1~12 사이 값으로 초기화하시오.
		//1~3 → "봄"
		//4~6 → "여름"
		//7~9 → "가을"
		//10~12 → "겨울"
		int month= 4;
		switch(month) {
		
		case 1,2,3 :
			System.out.println("봄");
			break;
		case 4,5,6 :
			System.out.println("여름");
			break;
		case 7,8,9 :
			System.out.println("가을");
			break;
		case 10,11,12 :
			System.out.println("겨울");
			break;
		}
		
		//13번. for문 + 산술
		//정수 변수 i를 1로 초기화하고, 1부터 100까지 반복하여 3의 배수인 수만 더해서 합계를 출력하시오.
		int sum3= 0;
		for(int i = 1 ; i<100; i++) {
			if(i%3==0) {
				sum3+= i;			
			}
		}
		System.out.println(sum3);
		
	
		
		//14번. 중첩 for문
		//정수 변수 i를 1로 초기화하고, 다음과 같은 별 모양을 출력하시오.
		
		
		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("▲");
		    }
		    System.out.println();
		}
		
		
		
		//15번. do ~ while
			//정수 변수 n을 1로 초기화하고,
		//	n이 5보다 커질 때까지 반복
		//	반복할 때마다 n을 1씩 증가시키면서 출력
		
		
		int n =1;
		
		do {
		System.out.println(n);
			n++;
		}while(5>=n);
		
		
		//16번. 배열 기본 합
		//정수 배열 arr을 {1, 2, 3, 4, 5}로 선언
		//배열의 모든 요소를 더한 합을 출력
		
		int[] arr= {1,2,3,4,5};
		int sum=0;
		for(int i= 0; i<arr.length; i++) {
			sum+= arr[i];
		}
		System.out.println(sum);
		
		//17번. 배열 값 변경
		//정수 배열 arr1을 {1, 2, 3, 4, 5}로 선언
	    //배열의 모든 값을 2배로 변경한 후 출력
		int[] arr1= {1,2,3,4,5};
		int nnn =0;
		for(int i= 0; i<arr.length; i++) {
			arr[i]*=2;
			System.out.println(arr[i]);
			
		}
		
		
		System.out.println("---------------------------");
		
		
		//18번. 배열 + 조건문
		//정수 배열 arr을 {3, 6, 9, 12, 15}로 선언
		//배열 안에서 짝수의 개수를 세어 출력
		
		int[] arr2= {3,6,9,12,15};
		int num=0;
		
		for (int i=0; i<arr2.length; i++) {
			if(arr2[i]%2==0) {
			num++;
			}
		}		
		System.out.println(num);
		
		
		
		//19번. 이중 반복문 (구구단 일부)
		//2단부터 4단까지 구구단을 출력
		//반복 변수는 내부/외부에서 선언
		
		System.out.println("--------------------");
		for(int i=2; i<5; i++) {
			for(int j=1; j<10; j++) {
				
				System.out.println(i+"X"+j+" ");
			}
		}
		
		//20번. 배열 + 조건문 + 산술
		//정수 배열 arr을 {10, 20, 30, 40, 50}로 선언
		//배열 요소들의 평균을 구하고
		//평균보다 큰 값만 출력
		
		int[] arr3= {10,20,30,40,50};
		int sum1=0;
		int avg=0;
		int max=0;
		
		for(int i = 0; i<arr3.length; i++) {		
			if( i ==arr3.length-1) {
				sum1+=arr3[i];
			avg= sum1/arr3.length;
			}
				
			}
		System.out.println(avg);
		System.out.println(sum1);
		}
		
	
	}

	
	

