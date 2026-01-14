package common;

public abstract class Appliance {  //가전제품 (부모)

	protected boolean onoff = false; //전원여부
	protected String name; // 제품명
	protected int powerCon; // 소비전력
	
	
	protected Appliance() {}
	protected Appliance(String name, int powerCon) {
		this.name =name;
		this.powerCon =powerCon;
	}


	@Override
	public String toString() {
		return "Appliance [onoff=" + onoff + ", name=" + name + ", powerCon=" + powerCon + "]";
	}
	public abstract void power();//추상메서드  --안에 내용을 가질수 없다.
	
	//추상메서드를 가지고 있는 클래스는 반듯 ㅣ추상클래스여야만 한다.



}
