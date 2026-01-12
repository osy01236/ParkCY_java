package study20260112;

public class MainMethod1 {

	public static void main(String[] args) {
		//


	Board board = new Board("홈페이지 ","아무개",45); 
		System.out.println(board);
	
		board.hitUp("이순신");
		System.out.println(board);
		board.hitUp("아무개");
		System.out.println(board);
		
		board.updateTitle("아무개", "네이버");
		board.updateTitle("이순신", "크롬");
		System.out.println(board);
		
		System.out.println(board);
	}

}
