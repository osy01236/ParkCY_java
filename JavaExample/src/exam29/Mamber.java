package exam29;

public class Mamber {

	String id;
	String pw;
	String name;
	String phone;
	String address;
	
	
	
	public Mamber(String id, String pw, String name, String phone, String address) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public void Inventory() {
		System.out.printf("%S %S \n", id ,name);
	}
	
	public void Information() {
		System.out.printf("%S \t %S \t %S \t %S \t %S \n",id,pw,name,phone,address);
	}
	
	
	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
