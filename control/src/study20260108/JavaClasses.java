package study20260108;

public class JavaClasses {

	public static void main(String[] args) {
	 User u= new User();    //new 만들어진 클래스는 참조 변수
	 User u2= new User();  
	 User u3= u;
	 		u.age= 32;
	 		System.out.println(u.age);
	        System.out.println(u3.age);
	        u.name="이나리";
	        u.job="군인";
	        System.out.println(u.name);
	        System.out.println(u.job);
	    
	        // 책 이름, 저자, 출판년도를 저장할수 있는 클래스 정의
	        //객채 생성하여 데이터 넣고 출력하기
	    
	        
	        Library a= new Library();
	        a.bookName="자바책";
	        a.userName="아무개";
	        a.year=2025;
	        
	        System.out.println(a.bookName+" "+a.userName+" "+a.year);
	        

	       
	       
	}

}


class User{  //User라는 클래스 정의
	
	int age;
	String name;
	String job;
	
}




class Library{
	String bookName;
	String userName;
	int year;
}

/*
	 자바 클래스
	 
	 데이터 저장 방법 - 변수 , 배열 , 구조체 , 클래스






*/