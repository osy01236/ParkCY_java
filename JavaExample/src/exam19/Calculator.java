package exam19;

public class Calculator {

	void process(int a, int b) {
		class Operation{
			void add() {
				System.out.println("결과 : "+(a+b));
			}
		}
	
	Operation op =new Operation();
	op.add();  
	}
}
