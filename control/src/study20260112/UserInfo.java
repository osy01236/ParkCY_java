package study20260112;

public class UserInfo {

	
	private String name;
	private String id;
	private int passWord;
	private int phone;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public int getPassWord() {
		return passWord;
	}
	public void setPassWord(int passWord) {
		this.passWord = passWord;
	}
	
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	
	public UserInfo(String name, String id, int passWord, int phone) {
		super();
		this.name = name;
		this.id = id;
		this.passWord = passWord;
		this.phone = phone;
	}
	
	
	
	@Override
	public String toString() {
		return "[이름 :" + name + "] [사용자 ID :" + id + "] [비밀번호 :" + passWord + "] [연락처 :010)" + phone + "]";
	}



}
