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
	}

}
