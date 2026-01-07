package study20260106;

public class ArrayMain {

	public static void main(String[] args) {

		
//		String a = "good";
//		String aa= new String("member");
//	
//		System.out.println(aa +"    "+a);
//		
//		String word = " i like stellive";
//		
//		System.out.println(word);
//		
//		System.out.println(word.charAt(4));
//		
//		System.out.println(word.indexOf('t'));
//		
//		System.out.println(word.substring(2));		
//		
//		String name = "이순신-김유신-김춘추-이성계-박은수-박팽년";
//		
//		System.out.println(name);
//		
//		String[] names= name.split("-");
//		//String[] names = {"이순신","김유신","김춘추","이성계","박은수","박팽년}
//		System.out.println(names[0]);
//		
//		//반복문으로 이름을 전부 출력하세요.(한줄에 하나씩)
//		for(String num : names) {
////		if(num.charAt(0)=='김')	
////			if(num.indexOf('신')!=-1)
//			if(num.substring(2)== "순"
//					)
//			System.out.println(num);
//		}
//		
		
//		
//		
		String[] fruits = {"사과","딸기","배","수박",
				           "바나나","복숭아","파인애플","아보카도",
				           "오렌지","감","한라봉","망고"
				           } ;
		
		//문제 1. fruits 배열에서 과일이름이 3자 이상인것들만 출력하세요.
		
//		for(String fru : fruits ) {
//			if(fru.length()>=3)
//			System.out.println(fru);
//		}
//		
//		
//		//문제 2 friuts 배열에서 딸기와 수박은 제외하고 출력하세요.
//		
//		for(String fru : fruits) {
//			if( !fru.equals("딸기") && !fru.equals("수박"))
//				System.out.println(fru);		
//		}
//		
//		
		System.out.println("\n\n\n");
			
		//문제 3  과일을 한줄에 4개씩 세줄로 출력할것이다.
			
		for(int i = 0; i < fruits.length; i++) {
			if( i%4==0)
				System.out.println();
			System.out.print(fruits[i]+"   ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
	}

		
		
		
	
		
		
//		int b ;
//		
//		char[]	temp= new char[8];
//		
//		temp[0]='S';	temp[1] = 't';temp[2]='e'; temp[3] ='l'; temp[4]='l'; temp[5]='i'; temp[6]='v'; temp[7]='e';
//		System.out.println(temp);
//		
	
		
		//		int[] arr = new int[5];
//		// arr은 참조 변수이다. 참조 변수는 메모리 주소를 저장할 수 있는 변수이다.
//		//
//		System.out.println(arr);
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 55;
//		arr[3] = 11;
//		arr[4] = 99;
//
//		
//		System.out.println(arr[2]);
//		
//		
//		for(int i= 0; i< arr.length; i++ ) {
//			System.out.println( arr[i]);
//		}
//		
//		for(int num :arr) {
//			if (num>50)
//			System.out.println(num);
//		}
//		
//		
//		
//		
//		
//		
//		
//		int[] arr2 = { 10, 20, 30 };
//		
//		
//		
		
//	}
//
//}
/*


	배열- 동일한 데이터타입의 데이터 저장공간이 여녹적으로 나열되어있는 구조
	
	
	
	
*/