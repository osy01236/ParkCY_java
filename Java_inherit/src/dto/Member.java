package dto;

import able.Actionable;

public class Member implements Actionable{

	
	private String memberid;
	private String name;
	private int age;
	
	
	
	
	public Member() { }
	
	public Member(String memberid, String name, int age) {
		super();
		this.memberid = memberid;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Member [memberid=" + memberid + ", name=" + name + ", age=" + age + "]";
	}
	
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void move() {
		System.out.println(name+ " 걷기 시작 ");
	}

	@Override
	public void drink() { 	
		System.out.println(name + "님이 화살콜라를 마셨습니다.");
	}
	
	
	
}
