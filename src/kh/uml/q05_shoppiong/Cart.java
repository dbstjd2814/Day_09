package kh.uml.q05_shoppiong;

import java.util.ArrayList;
import java.util.List;

public class Cart { 
	private Item item = new Item();
	public Cart() {
		
	}
	public Cart(List<Item> i) {
		
	}
	public List<Item> getItems() {
		 this.item.getItemCode();
		 this.item.getItemName();
		 this.item.getItemPrice();
		 List<Item> items = new ArrayList<>();
		 items.add(item);
		 return items;
	}
	public void setItems(List<Item> a) {
		List<Item> b = new ArrayList<>(); 
		b = a;
	}
	public void addItem(Item c){
		this.item = c;
	}
}
