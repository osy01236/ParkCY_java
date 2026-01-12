package test;

public class test0109_2 {

	public static void main(String[] args) {
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
	    int max = monthlySales[0];
	    int min = monthlySales[0];
	    int num = 0;
	    	for(int i= 0; i<monthlySales.length; i++) {
	    		total += monthlySales[i];
	    	if(monthlySales[i]>max) 
	    		max=monthlySales[i];
	    	if(monthlySales[i]<min)
	    		min=monthlySales[i];
	    	else if(avl<monthlySales[i])
	    		num ++;
	    	}
	    	avl = total/monthlySales.length;
	   	System.out.println("연간 총 매출 : "+total+"만원");
	   	System.out.println("월 평균 매출 : "+avl+"만원");
	   	System.out.println("최고 매출 월 : "+max+"만원");
	   	System.out.println("최저 매출 월 : "+min+"만원");
	   	System.out.println("월 평균 이상 매출인 월의 개수 : "+ num+"개");
	
	
	
	
	
	   	//문제 2 훈련생 출결정보가 숫자 코드 배열로 관리되고 있다.
	   	//코드   의미
	   	//1		출석	
	   	//2		지각	
	   	//3		결석
	   	
	   	int[] attendance = {1, 1, 2, 1, 3, 1, 2, 3, 1, 1, 1, 2, 3, 3, 1,};
	
	   	//요구 사항
	   	//1)출석/지각/ 결석 횟수 각각 계산
	   	//2)출결점수계산
	   	//출석+1점
	   	//지각0점
	   	//지각-1점
	   	//3)아래조건에 해당하면 출결 위험 출력
	   	//결석 3회 이상 또는 출결점수 <=8
	
	
	
	
	
	
	
	}

}
