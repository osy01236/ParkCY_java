package study20260113;

import java.util.Arrays;

public class MainMethod {

	public static void main(String[] args) {
		
//		int[] a = new int[5];
//		
//		User[] users =new User[5]; 
//		
//		// User 클래스 생성
//		users[0] = new User("osy","qwer", "이순신", "01077777777");
//		
//		
////		users[0].setName("이순신"); 
//		System.out.println(users[0].getName()); 
		
		User[] users = {
				new User("AB","111", "에이비", "01011112222"), 
				new User("CD","222", "시디이", "01033334444"),
				new User("EF","333", "이에프", "01055556666"),
				new User("GH","444", "지에치", "01077778888"),
				new User("IJ","555", "아이제", "01099990000")
		};
		
		UserService us = new UserService();
		
		us.findid(users);
		
		
		us.FindPassword(users);
	
		System.out.println(Arrays.toString(users));
		
		
		us.login(users);
		
		
	}
	

}
