package exam20;

public class _Exec {

	public static void main(String[] args) {
		remoteControl tv = new remoteControl() {
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다");
			
			}
		};
		tv.turnOn();
		
	

	}
}
