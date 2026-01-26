package exam08;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberList2 {

	public static void main(String[] args) {
		
		List<MemberDTO> list = new ArrayList<>();
		
		String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
		String dbUsr = "javauser";
		String dbpwd = "1234";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 예외처리
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbpwd);
//			//--------------------------------------------------------------
			
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
			
				MemberDTO memberDTO = new MemberDTO();
				memberDTO.setNo(rs.getInt("no"));
				memberDTO.setId(rs.getString("id"));
				memberDTO.setPassword(rs.getString("password"));
				memberDTO.setName(rs.getString("name"));
				memberDTO.setPhone(rs.getString("phone"));
				memberDTO.setCreatedDate(rs.getDate("createdDate"));
		
//			MemberDTO memberDTO
//			=new MemberDTO(no, id, pw, name, phone, createdDate);
			
					list.add(memberDTO);
			}
			//-------------------------------------------------------------
		} catch (Exception e) {
			System.out.println("드리이버 로딩 실패..또는 접속 실패..");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
//       [주소, 주소, 주소, 주소, 주소, 주소, 주소,]
		for(int i=0; i<list.size(); i++) {
//		MemberDTO dto= list.get(i);
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t\n", list.get(i).getNo(),list.get(i).getId(), list.get(i).getName(), list.get(i).getPhone(), list.get(i).getCreatedDate());
		System.out.println(i+". ");
		}
		

	}

}