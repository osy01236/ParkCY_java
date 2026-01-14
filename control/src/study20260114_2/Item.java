package study20260114_2;

public class Item {

	private String itemName;
	private int itemPrice;
	private String itemImage;
	private int itemStock;
	
	
	
	public Item() {
		super();
	}

	public Item(String itemName, int itemPrice, String itemImage, int itemStock) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemImage = itemImage;
		this.itemStock = itemStock;
	}

	
	
	
	
	
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemImage=" + itemImage + ", itemStock="
				+ itemStock + "]";
	}

	
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemImage() {
		return itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}
	
	
	
	
}
