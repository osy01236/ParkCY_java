package exam13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList<>();
        System.out.println("1. "+List);
		
		List.add("홍길동");
		System.out.println("2. "+List);
		List.add("이성순");
		System.out.println("3. "+List);
		List.add("장천용");
		System.out.println("4. "+List);
		
		
		List.addFirst("111");
		System.out.println("5. "+List);
		List.addLast("999");
		System.out.println("6. "+List);
		
		//3.중간 삽입 (매우빠름)
		List.add(1,"222");
		System.out.println("7. "+List);
		
		List.removeFirst();
		System.out.println("8. "+List);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List arrayList = new ArrayList<>();
//		System.out.println("1. "+arrayList);
//		arrayList.add(1);
//		System.out.println("2. "+arrayList);
//		arrayList.add(2.2);
//		System.out.println("3. "+arrayList);
//		arrayList.add("홍길동");
//		System.out.println("4. "+arrayList);
//		arrayList.add(true);
//		System.out.println("5. "+arrayList);
//		arrayList.add(new int[5]);
//		System.out.println("6. "+arrayList);
		
	}

}
