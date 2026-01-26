package exam15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mart {

	public static void main(String[] args) {
		
		List<Map<String, String>> list = new ArrayList<>();
		System.out.println("list : "+ list);
		
		
		String name="라면";
		int price = 1000; 
		int count = 5;
		int tot = price*count;
		
		Map<String, String> mart1 = new HashMap<>();
		mart1.put("이름", name);
		mart1.put("가격", price+"");
		mart1.put("개수", count+"");
		mart1.put("합계", tot+"");
	
		list.add(mart1);
		System.out.println(mart1);
	
	
	
	    name="토마토";
		price = 3000; 
		count = 4;
		tot = price*count;
		
		Map<String, String> mart2 = new HashMap<>();
		mart2.put("이름", name);
		mart2.put("가격", price+"");
		mart2.put("개수", count+"");
		mart2.put("합계", tot+"");
		
		list.add(mart2);
		System.out.println(mart2);
		
		name="음료수";
		price = 2000; 
		count = 2;
		tot = price*count;
		
		Map<String, String> mart3 = new HashMap<>();
		mart3.put("이름", name);
		mart3.put("가격", price+"");
		mart3.put("개수", count+"");
		mart3.put("합계", tot+"");
		
		list.add(mart3);
		System.out.println(mart3);
		
		
		
		
		for(int i = 0; i<list.size(); i++) {
			Map<String, String> mart = list.get(i);
			String sum = mart.get("합계");
		    System.out.println(sum);
		
		}	
	
	}

}
