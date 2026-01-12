package study20260112;

public class Student {

	static String schooLName; //클래스 변수
	
	public String name;//인스턴스 변수
	public String age; //인스턴스 변수
    private int tall;  //인스턴스 변수
    private int grade = 100;  //인스턴스 변수 값을 넣어주면 명시적 초기화
	
    //변수 초기화 순서
    //명시적 초기화 -> 초기화 블럭 -> 생성자메서드
    
    
    {  //인스턴스 초기화 블럭을 이용한 변수 초기화
    	name = "이성계";
    }
    
    
    public Student() {}
    public Student(String name, String age, int tall) { //매개변수,지역변수
    	this.name=name;  //this 객체를 의미
    	this.age = age;
    	this.tall = tall;
    	
    }
    
    public Student(String name, int tall) { // 지역변수
    	this.name=name;
    	this.tall = tall;

    }
    
    //클래스 객체에 저장되어있는 값을 출력할때
    // 자바에서는 일반적으로 toString 메서드를 사용한다.
    
    public String toString() {
    	return name+" : "+ age+" : "+tall+" : "+grade;
		
	}
    
    
}




//