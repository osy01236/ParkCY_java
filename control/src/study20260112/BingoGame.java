package study20260112;

public class BingoGame {

	//사용자명, 레벨 , 승, 패, 무
	//저장할수 있는 객체가 생성될수 있게 만들기
	
	//모든 인스턴스변수는  private 으로
	// 생성자메서드를 통해 사용자명, 레벨, ,승, 패, 무
	//앱력받을수 있게 하기
	//출력 메서드 만들기

	
	
	
	private String name; 
	private int level;
	private int win;
	private int lose;
	private int draw;

	public BingoGame() {}
	
	public BingoGame(String name, int level, int win,int lose, int draw) {
		this.name= name;
		this.level= level;
		this.win=win;
		this.lose=lose;

		this.draw=draw;
		
	}

	
	public String toString() {
		return "이름 :"+name + level+"레벨 " + win+"승 " + lose+"패 " + draw+"무승부";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		if( win < 0) {
			System.out.println("잘못된 값입니다.");
			return;  //종료
		}
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	
	//private 지정된 변수 사용법
	//private 접근제어자는 내부에서만 사용가능하기 떄문에
	//외부에서 사용되기 위해 변수들의 set, get 메서드를 만들어 사용한다.
	
	//빈곳에 대고 오른쪽 클릭 source > generate > getters and setters
	//getter setter 쓸때 반드시 변수의 이름이 들어가야한다 set이름, get이름
	//getter : 데이터 출력
	//setter : 데이터 저장

}
	

	

