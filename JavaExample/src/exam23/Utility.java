package exam23;

public class Utility {
	//반환 타입앞에 T를 붙여 제네릭 메서드임을 선언
	public static <T> void printArray(T[] array) {
		for(T element : array) {
			System.out.println(element);
		}
	}
}
