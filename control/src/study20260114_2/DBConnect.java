package study20260114_2;

import java.sql.*;

public class DBConnect {

	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
	
	
	public DBConnect() {
		connect();
	}

	private void connect() {
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username ="Yong";
			String pw ="park12!@chan";
			String url="jdbc:mysql://localhost:3306/Yong";
					
			conn=DriverManager.getConnection(url, username, pw);
			
		
		}catch(Exception e) {
			System.out.println("접속 실패 하셨으니 자주 실수하는 오타 확인하세요");
		}
		
	}
	

	public Item[] find() {
		Item[] items = new Item[7];
		
		String sql="select*from item";  //아이템 테이블이 대문자 인지 소문자인지 까먹음..
		
		try {
			
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			
			int i = 0;
			while(rs.next()) {
				Item data =new Item(
						rs.getString("item_name"),rs.getInt("item_price"),
						rs.getString("item_main_image"),rs.getInt("item_stock")
						
						);
				items[i]=data;
				i++;
			}
			
		}catch(Exception e) {
			System.out.println("객채생성 실패 오타 확인하세요..");
		}
		 return items;
	}









}




