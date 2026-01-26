package exam25;

import java.util.List;
//와일드 카드
public class UpperBoundExample {

	public static double sumOfList(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list) {
			s += n.doubleValue();
		}
		return s;
	}
}
