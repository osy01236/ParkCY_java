package sangsog;

import animals.Dog;
import animals.Rabbit;
import common.Animal;
import animals.Cat;
import animals.Bird;

public class MathMethod2 {

	public static void main(String[] args) {
		
		Animal[] animals = {
				new Dog("라이","핏불테리어"),
				new Cat("야몽"),
				new Rabbit("페토"),
				new Bird("구구")
		};
		
		for( Animal a : animals) {
			a.sound();
			a.sleep();
			if(a instanceof Dog)
				((Dog)a).getBreed();
			System.out.println();
		}
//		
//		((Dog)animals[0]).getBreed();
//		
//		Dog dog = (Dog)animals[0];
//		
//		Dog d= new Dog("a","b");
//		Animal aa=d;
	
	}

}

 	//bird 클래스르 만드시오
// 쨲쨱 소리 나게 하시오











