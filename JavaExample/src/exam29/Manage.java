package exam29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exam29.Mamber;


public class Manage {

	public static void main(String[] args) {
		List<Mamber> mamberlist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("================회원관리================");
		
		
		while(true) {
		
		System.out.println("[1.목록, 2.상세보기, 3.등록, 4.수정, 5.삭제");
		System.out.print("숫자 입력 : ");
		
		String num =sc.nextLine();	
		if(num.equals("종료")) {
			System.out.println("프로그램 종료");
			break;
		
		
		}else if(num.equals("1")) {
			System.out.println("================목록================");
			for(int i= 0; i<mamberlist.size(); i++) {
				
				mamberlist.get(i).Inventory();
			}
	
		
		}else if(num.equals("2")) { 
			System.out.println("=================상세보기=================");
			
			for(int i= 0; i<mamberlist.size(); i++) {
				mamberlist.get(i).Information();
			}
			
		
		}else if(num.equals("3")) {
			System.out.println("===회원 멤버 등록===");
			
			System.out.print("회원 아이디 : ");
            String mamberId = sc.nextLine();
            System.out.print("회원 비빌번호 : ");
            String mamberPw = sc.nextLine();
            System.out.print("회원 이름 : ");
            String mamberName = sc.nextLine();
            System.out.print("회원 연락처 : ");
            String mamberPhone = sc.nextLine();
            System.out.print("회원 주소 : ");
            String mamberaddress = sc.nextLine();
			
            Mamber mamber = new Mamber(mamberId,mamberPw,mamberName,mamberPhone, mamberaddress );
            mamberlist.add(mamber
            		);
			
			
		}else if(num.equals("4")) {
			System.out.println("4.수정");
		}else if(num.equals("5")) {
			System.out.println("5.삭제");
		}
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
