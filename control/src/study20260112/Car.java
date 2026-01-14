package study20260112;

public class Car {

	
	String model;
	int price;
	int stock;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	public Car(String model, int price, int stock) {
		super();
		this.model = model;
		this.price = price;
		this.stock = stock;
	}
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + ", stock=" + stock + "]";
	}
	
	
	public void buy(int money) {
		if(stock == 0) {
			System.out.println("재고없음");
		}else if (price <= money) {
			stock--;
			System.out.println("구매완료");
		}else
			System.out.println("구매불가");
	}
	
	
	
	
	
	
	
	
	
}
