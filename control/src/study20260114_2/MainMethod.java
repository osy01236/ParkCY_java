package study20260114_2;

public class MainMethod {

	public static void main(String[] args) {
		
		DBConnect connect = new DBConnect();
		
		Item[] items = connect.find();
		
		System.out.println(items[0]);

	}

}
