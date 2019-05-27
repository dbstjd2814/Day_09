package kh.uml.q05_shoppiong;

public class Item {
	private String calegory;
	private String itemCode;
	private String itemName;
	private int itemPrice;
	
	public Item() {
		super();
	}
	public Item(String calegory, String itemCode, String itemName, int itemPrice) {
		super();
		this.calegory = calegory;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	public String getCalegory() {
		return calegory;
	}
	public void setCalegory(String calegory) {
		this.calegory = calegory;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
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
}
