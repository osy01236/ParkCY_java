package study20260112;

public class ProductInfo {

	private String product;
	private int price;
	private String menu;
	private int stpck;
	
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getStpck() {
		return stpck;
	}
	public void setStpck(int stpck) {
		this.stpck = stpck;
	}
	
	
	public ProductInfo(String product, int price, String menu, int stpck) {
		super();
		this.product = product;
		this.price = price;
		this.menu = menu;
		this.stpck = stpck;
	}
	
	
	
	@Override
	public String toString() {
		return "[상품명 : " + product + "] [상품가격 : " + price+"만원"+ "] [카테고리 :" + menu + "] [재고 :" + stpck + "]";
	}
	
	
	
	
}
