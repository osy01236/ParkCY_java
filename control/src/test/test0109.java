package test;

public class test0109 {

	public static void main(String[] args) {
		
		//문제 1 다음 정보를 각각 알맞은 자료형의 변수로 선언하고 값을 저장한뒤에 출력하시오.
		
		String value = "값";
		String name ="홍길동";
		int age = 25;
		double stend = 175.5;
		String gender= "남";
		boolean stud = true;
		
		System.out.println("항목     "+value);
		System.out.println("이름     "+name);
		System.out.println("키      "+age);
		System.out.println("성별     "+gender);
		System.out.println("학생여부  "+ stud);
		
		
		//문제 2 정수형 변수 a와 b가 다음 과 같이 선언되어 있다.
		//a= 10 b= 20 임시 변수 (temp)를 사용하여
		//두 변수의 값으 서로 바꾼뒤 출력하시오.
				
		int a= 10;
		int b= 20;
		int temp=0;
//		temp=a=b;
		temp=a;	a=b; b=temp;
		System.out.println(a+"   "+b);
	
	
		//문제3 가로(width)가 8, 세로(height)가 5인 사각형이 있다.
		//		사각형의 넓이를 계산하여 출력하시오.
		
		int width = 8;
		int height =5;
		int mul= width * height;
	
		System.out.println(mul);
	
		
		
		
		
		
		
		
		
		//문제4 다음 세 과목 점수가 주어져 있다.
		// 국어 85, 영어90, 수학 78
		//총점을 계산하시오.
		//평균을 구하시오.
	

		
		
		
		int kor = 85;
		int eng = 90;
		int mat = 78;
		int sum = kor + eng + mat;
		int avg = sum/3;
		
		System.out.println("총점 :"+sum+" 평균 :"+avg );
		
		
		
		
		
		
		
		
		
		
		
		//문제 5
		//전체 초(second)가	3,726초로 주어져 있다.
		//이를 다음과 같이 변환하여 출력하시오.
		//시(hour)    분(minute)    초(second)
	
		
		
		int second=3726;
		int hour=0;
		int minute=0;
		int second2=0;
		
		hour=(int)(second/3600);
		minute=(int)(second/60)%60;		
		second2=second%60;
		
		System.out.println(hour+"시간 "+minute+"분 "+second2+"초");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//문제 6
		//정수형 변수 score에 시험 점수가 저장되어 있다.
		//점수가 60점 이상이면 합격
		//그렇지 않으면 불합격을 출력하세요.
	
		
		
		
		
		
		
		
		int score = 72;
		if( score >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		
		
		
		
		
		
		
		
		
		
		
		//문제 7
		//정수형 변수 score가 다음과 같이 주어진다.
		//점수에 따라 아래 기준으로 학점을 출력하세요.
		//점수 범위     학점
		//90 이상		A
		//80 이상		B
		//70 이상		C
		//60 이상		D
		//60 미만		F
	
		
		
		int score_ = 60;
		if (score_ >= 90)
			System.out.println("A");
		else if (score_ >= 80)
			System.out.println("B");
		else if (score_ >= 70)
			System.out.println("C");
		else if (score_ >= 60)
			System.out.println("D");
		else
			System.out.println("F");
		
		
		
		
		
		
		
		
	   //문제 8
	   //정수형 변수에 n에 값이 저장되어야한다.
	   // 1부터 n까지의 합을 계산하오 출력하시오.
		
		int n = 10;
		int sum8 = 0;

		for (int i = 0; i <= n; i++) {
			sum8 += i;
		}
		System.out.println(sum8);
			
		 
		
		
		
		
		
		
		
		
		
		
		//문제 9
		//다음 정수 배열이 주어진다.
		//     int[] arr = {10,20,30,40,50};
		//배열의 모든 값의 총합을 구하고 평균(정수)을(를) 구하여 출력하시오.
		     
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum9 = 0;
		int avl9 = 0;
		for (int ar : arr) 
			sum9 += ar;
			
		avl9 = sum9 / arr.length;
		
		System.out.println("총합 : " + sum9 + " 평균 : " + avl9);
		
		
		
		
		
		
		
		
		
		
		
		// 문제 10 담음 정수 배열이 주어진다.
		// int[] scores = {87, 65,92,100,74};
		//배열에서 최대값 최소값 찾기
		
		int[] scores = {87,65,92,100,74};
	
		int max=scores[0];
		int min=scores[0];
		
			for(int i = 0; i<scores.length; i++) {
				if(scores[i]>max)
					max=scores[i];
				if(scores[i]<min)
					min=scores[i];
			}
	System.out.println("최대값: "+max+" 최소값 : "+min);
	
	
	
		//문제 11
		//다음 정수 배열이 주어진다.
		//int[] nums = {3, 8 , 15, 22, 7, 10}
		//배열을 순회하면서 아래 규칙으로  result를 계산하시오
		//값이 짝수면 result에 더한다
		//값이 홀수이면 result에서 뺀다.
		//마지막 result 값을 출력하시오.
	
	    int[] nums = {3, 8 , 15, 22, 7, 10};
	   
	    int result =0;
	    
	    
	    
	    for (int num10 : nums) {
	    	if(num10%2==0)
	    		result +=num10;
	        else 
	    		result -=num10;
	    	}
	    System.out.println(result);
    
	
	    //문제 12
	    //학원 관리 시스템에서 월별 매출 데이터를 배열로 관리하고 있다.
	    //int[] monthlySales = {1200, 950, 1430, 800, 1600, 1700, 900, 1100, 1550, 1800, 1300, 2000};
	    //(1월~ 12월 순서 , 단위 :만원)
	    //요구 사항 아래 정보를 계산하여 출력하시오.
	    //연간 총 매출
	    //월 평균 매출(정수)
	    //최고 매출 월과 금액
	    //최저 매출 월과 금액
	    //평균 이상 매출인 월의 개수
	    
	    int[] monthlySales = {1200, 950, 1430, 800, 1600, 1700, 900, 1100, 1550, 1800, 1300, 2000};
	    
	    int total = 0;
	    int avl   = 0;
//	    int max12 = monthlySales[0];
//	    int min12 = monthlySales[0];
//	    int num12 = 0;
	    	for(int i= 0; 1<monthlySales.length; i++) 
	    		total += monthlySales[i];
	    		avl = total/monthlySales.length;
	    	
	    
	    System.out.println("연간 총 매출 : "+total+" 월 평균 매출 : "+avl);
	    
	}
	
	
}
















