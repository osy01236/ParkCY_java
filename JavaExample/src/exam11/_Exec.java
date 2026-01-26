package exam11;

import java.util.HashSet;
import java.util.Set;

public class _Exec {

	public static void main(String[] args) {
		//Set- 중복을 허용하지 않는 (중복제거, 중복은 안들어간다)
		Set<String> set =new HashSet<>();
		System.out.println("set : "+set);//set : []
		set.add("사과");
		System.out.println("set : "+set);//set : [사과]
		set.add("바나나");
		System.out.println("set : "+set);//set : [사과,바나나]
		set.add("포도");
		System.out.println("set : "+set);//set : [포도,사과,바나나]
		set.add("사과");
		System.out.println("set : "+set);//set : [포도,사과,바나나]
		System.out.println("담긴개수 : "+set.size());
	
		if(set.contains("사과")) {
			System.out.println("사과가 먹고 싶네.");
		}
		
		for(String s : set) {
			System.out.println(s);  //포도
		}							//사과
									//바나나
		
		set.remove("포도");
		System.out.println(set); //[사과, 바나나]
		
		if(set.contains("체리")) {
			set.remove("체리");
			set.add("cherry");
	}
	
	
	
	
	}
}
