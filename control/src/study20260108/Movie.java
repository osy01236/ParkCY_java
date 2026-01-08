package study20260108;

public class Movie {      
	String title;  //영화 제목
	String dir;    //영화 감독
	int limitAge;  //관람연령
	int year;   	//개봉년도
	
	
	
	//생성자 메서드
	Movie(){  //객체를 초기화
		title="주토피아2";
	//매개변수가 있는 생성자 메서드	
	
		
	}
	//매개변수가 있는  메서드
	Movie(String title,int year, int limitAge){           //오버 로딩	
        
		this.title=title;  //생성자 메서드를 만들때 가장 일반적인 방법
        this.year=year;
        this.limitAge= limitAge;
	
	}
	
	
	
}
