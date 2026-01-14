package study20260113;

import java.util.Scanner;

public class UserService {

	private Scanner sc = new Scanner(System.in);
	//아이디 찾기 메서드 만들기
	//이름을 입력하여 아이디 찾기 할것이다.
	
	public void findid(User[]users) {
		System.out.println("======아이디 찾기======");
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		for(User user : users) {
			if(user.getName().equals(name)) 
				System.out.println("ID : "+user.getId());
			else 
					System.out.println("가입된 이력이 없습니다.");
				break;
			}
				
		}
	
	
	//비밀번호 찾기 메서드
	//아이디와 연락처를 입력하면 비밀번호를 변경할 수 있다.
	//
	
	public void FindPassword(User[]users) {
		System.out.println("====비밀번호 찾기 =====");
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("연락처 입력 : ");
		String tel = sc.nextLine();
		
		boolean isDis= true;
		
		for(User user : users) {
			if(user.getId().equals(id) && user.getTel().equals(tel)) {
				System.out.print("변경할 비밀번호 : ");
				String pw = sc.nextLine();
				user.setPassword(pw);
				isDis= false;
				System.out.println("변경되었습니다.");
				break;
			}
		}
		if(isDis) {
			System.out.println("일치하는 정보가 없습니다 다시 입력해주세요.");
		}
	}
	
	//로그인 메서드
	// 아이디와 비밀번호를 입력하여 로그인하기
	// 아이디와 비밀번호가 일치하면 "로그인성공"
	//일치하지 않으면 "아이디 또는 비밀번호가 일치하지 않습니다." 출력
	

	public void login(User[] users) {
		System.out.println("====로그인하기====");
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String pw = sc.nextLine();

		User temp= isID(users, id); //입력한 아이디와 일치하는 User 객체찾기
//	   =if(temp.getPassword().equals(pw)){
		if(temp!=null ){
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}else if (temp.getPassword().equals(pw)) {
			System.out.println("로그인성공");
		}else 
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		
//		boolean islogin = true;
//		for (User user : users) {
//			if (user.getId().equals(id) && user.getPassword().equals(password)) {
//				islogin = false;
//				System.out.println("로그인 성공");
//				break;
//			}
//		}
//		if (islogin)
//			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
	}
	
	
	
	
	
	private User isID( User[] users, String id) {  //반환을 가진 메소드
		for(User user : users) {
			if(user.getId().equals(id) ) return user;
			//아이디가 일치하는 User 객체를 반환
		}
		
		return null;  //일치하는 아이디가 없다면 null 반환
//	   =return new User
	}
	
	
}	
	

	

	


//데이터 저장 관리하기 위한 클래스에서
//데이터 필터링 이나, 파일저장(DB), 불러오기
//등등 을 수행하지  않는다.
//데이터 저장 관리하기 위한 클래스에서는
//저장에 관해 메서드를 주로 만들고
//데이터 변환에 대해서만 만든다.