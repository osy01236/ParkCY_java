package study20260108;

public class JavaCalass2 {

	public static void main(String[] args) {
		//new Movie()     ( ):new 만들어진 공간에 대해 초기화 시키는 메서드
		//			  생성자 메서드	
		
		Movie movie = new Movie();
		System.out.println(movie.title);
		
		movie.title="아이언맨";
		movie.dir="시고르외국인";
		movie.limitAge=15;
		movie.year=2025;
		
		System.out.println(movie.title);

		
		Movie movie2 = new Movie("굿포춘",2025,15);
		
		System.out.println(movie2.title);
		System.out.println(movie2.year);
		System.out.println(movie2.limitAge);
		
		//Music 클래스의 객체를 생성하여
		//음악 제목 , 가수, 재생시간(총몇분) 저장되게 하기
		//매개변수 있는 생성자 메서드로 데이터 저장하고
		//출력하기
	
	
		Music music = new Music("할수있어","MC스나이퍼",5);
		
	System.out.println("노래제목 :"+music.musicName+"\n   가수 :"+music.singer+"\n노래시간 :"+music.time+"분");
		
	
//		Music music2= new Music(); //  사용할려면 music 타이틀에 메서드 추가할것
	
	
	
	}

}
