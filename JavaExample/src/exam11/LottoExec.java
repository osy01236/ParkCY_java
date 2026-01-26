package exam11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoExec {

	public static void main(String[] args) {
		Set<Integer> lotto =new HashSet<>();
		Random random = new Random(); //1~45
//		System.out.println("--->"+ lotto.size());
	
		while(lotto.size()<6) {	
			int num = random.nextInt(45)+1;
			lotto.add(num);
			
		}
		System.out.println("이번주 로또 번호 : "+lotto );
		

	
	
	
	
	
	
	
	
	
	}

}
