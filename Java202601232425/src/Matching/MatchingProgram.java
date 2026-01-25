package Matching;

import java.util.ArrayList;
import java.util.Scanner;

public class MatchingProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<WorkerInfo> wokerList = new ArrayList<>();
		wokerList.add(new WorkerInfo("박무씨", "네이버", "31", "010-1111-1111", "출장", "옥천", "사무"));
		wokerList.add(new WorkerInfo("이무씨", "카카오", "28", "010-2222-2222", "사무", "서울", "출장"));
		wokerList.add(new WorkerInfo("김무씨", "구글", "21", "010-3333-3333", "출장", "대전", "출장"));
	
		ArrayList<CompanyInfo> companyList = new ArrayList<>();
		companyList.add(new CompanyInfo("네이버", "서울", "사무"));
		companyList.add(new CompanyInfo("카카오", "옥천", "출장"));
		companyList.add(new CompanyInfo("구글", "대전", "출장"));

		
		
		
		
		
		System.out.print("숫자 입력 : ");
		
		while(true) {
			System.out.println("1.매칭, 2.회사정보, 3.정보수정, 4.종료");
			int num = sc.nextInt();
			if(num==4) {
				System.out.println("프로그램 종료");
				break;
			}else if(num==1) {
				System.out.println("1.매칭");
				System.out.println("직장인 이름 : ");
				String fineName = sc.nextLine();
				String hopeJob="";  //희망 업무 =   
				
				for(int i=0;  i<wokerList.size(); i++) { //wokerList 안에 있는 데이터 개수를 차례대로 꺼내옴
					
					if(fineName.equals(wokerList.get(i).getName())) {  // fineName 검색 한 이름이 wokrerList 안의 이름이랑 같은경우
						
						hopeJob = wokerList.get(i).getHopeJob(); // 희망업무는 wokerList 안의 희망업무
					}
				}	
				
				System.out.println("희망 업무 :"+ hopeJob);	
				
				
				
			}else if(num==2) {
				System.out.println("2.회사정보");
				
			}else if(num==3) {
				System.out.println("3정보수정");
			}
				
			
			
			
			
			
		}
		
		
		
		
	}
	}
	
	
	

		
	

