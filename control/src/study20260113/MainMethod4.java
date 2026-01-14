package study20260113;

public class MainMethod4 {

	public static void main(String[] args) {
		
		DBConnect connect = new DBConnect();
		
		Product[] products = connect.selectData();
		
		System.out.println(products[0]);
		System.out.println(products[1]);
		System.out.println(products[2]);
		System.out.println(products[3]);
		System.out.println(products[4]);
		System.out.println(products[5]);
	
		
			
		}
		
	}
	


