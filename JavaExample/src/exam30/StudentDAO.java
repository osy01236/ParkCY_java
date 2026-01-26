package exam30;

import java.util.Map;

public class StudentDAO {

	public int setInsert(Map<String,String> map) {
		System.out.println("== serInsert()==");
		System.out.println("name : "+map.get("name"));
		System.out.println("ssd : "+map.get("ssd"));
		System.out.println("phone : "+map.get("phone"));
		System.out.println("address : "+map.get("address"));
		
	
		return 0;
	}
	
	
	
	
	
	
	
	
//	public int setInsert(String[] array) {
//		System.out.println("== serInsert()==");
//		System.out.println("name : "+array[0]);
//		System.out.println("ssn : "+array[1]);
//		System.out.println("phone : "+array[2]);
//		System.out.println("address : "+array[3]);
//	
//		return 0;
//	}
	

//	public int setInsert(String name, String ssn, String phone, String address) {
//		System.out.println("== serInsert()==");
//		System.out.println("name : "+name);
//		System.out.println("ssn : "+ssn);
//		System.out.println("phone : "+phone);
//		System.out.println("address : "+address);
//		
//		
//		return 0;
//	}
}
