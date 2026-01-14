package study20260114;

import java.sql.*;

public class DBCconnect {

	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
	
	
	public DBCconnect() {
		connect();   //데이터 베이스 연결을 위한 메서드
	}

	private void connect() {
		// 데이터베이스 드라이버 실행 - 연결
		// 계정 로그인

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "Yong";
			String pw = "park12!@chan";
			String url = "jdbc:mysql://localhost:3306/Yong";

			conn = DriverManager.getConnection(url, username, pw);

		} catch (Exception e) {
			System.out.println("접속실패");
		}
	}
	
	//GameMember 테이블 가져오기
	public GameMember[] findAll() {
		GameMember[] gameMembers = new GameMember[10];
		
		//쿼리문 작성하기
		String sql="select*from Game_Member";
		//쿼리문 보내기
		
		try {
			st=conn.createStatement();
			//결과받기
			rs=st.executeQuery(sql);
		
			int i = 0;
			while(rs.next()) {    //next -> boolean 타입
				GameMember data = new GameMember(
						rs.getString("name"), rs.getString("birth"),
						rs.getString("nick_name"),rs.getInt("level")
						);
						
				gameMembers[i] = data;
				i++;
			}
		}catch(Exception e) {
			
			System.out.println("질의 실패 및 객체생성 실패~");
		}
		//데이터를 클래스 객체에 저장하고 배열에 저장하기
		
		
		return gameMembers;
	}
}
