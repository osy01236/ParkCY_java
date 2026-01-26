package exam28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Example_ {

	public static void main(String[] args) {
		List<ProdductDTO> Productlist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):");
			System.out.print("숫자 입력 : ");

			String num =sc.nextLine();	
			if(num.equals("0")) {
				System.out.println("===[프로그램종료]===");
				
				break;
			}else if (num.equals("1")) {
				System.out.println("[1 : 목록]"); 
				int hab = 0;
				for(int i=0; i<Productlist.size(); i++) {
					
					Productlist.get(i).display();
					hab += Productlist.get(i).getTotal();
//					System.out.println(Productlist.get(i).getProductName()+ "," +
//				                       Productlist.get(i).getProductPrice()+ ","+ 
//				                       Productlist.get(i).getBuyCounter()            );
				}
				System.out.println("---------------------------");
				System.out.println("합 계 : " + hab
						);
				
			}else if (num.equals("2")) {
            System.out.println("[2-1 : 이름], [2-2 : 가격], [2-3 : 구매수량] ");
			
            System.out.print("2-1 : 이름 : ");
            String productName = sc.nextLine();
            
            System.out.print("2-2 : 가격: ");            
            String productPrice_ = sc.nextLine();
			int productPrice = Integer.parseInt(productPrice_);
            
			System.out.println("2-3 : 구매수량: ");
            String buyCounter_ = sc.nextLine();
            int buyCounter = Integer.parseInt(buyCounter_);
			
			
            ProdductDTO dto = new ProdductDTO(productName,productPrice,buyCounter);
            Productlist.add(dto);
			
				
			}else if (num.equals("3")) {
				System.out.println("[3 : 수정]");
			}else if (num.equals("4")) {
				System.out.println("[4 : 삭제]");
			}

			
		
	
		
		
		

		
		

		}	
	}	
}


