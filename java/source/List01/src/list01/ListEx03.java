package list01;

import java.util.*;

//접근제한자 : public > protected > default > private

class Item {
	private Long itemNum;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	
	public Item(Long itemNum, String itemName, int itemPrice, int itemStock) {
		this.itemNum = itemNum;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}
	
	public void itemDisp() {
		System.out.println("상품번호 : "+itemNum+", 상품명 : "+itemName+", 상품가격 : "+itemPrice+", 상품재고 : "+itemStock);
	}
}

class ItemDao {
	public List<Item> getItems() {
		List<Item> aList = new ArrayList<>();
		
		aList.add(new Item(10001000L, "IBM 노트북", 2000000, 10));
		aList.add(new Item(20002000L, "게이밍 마우스", 50000, 999));
		aList.add(new Item(20001000L, "LG LED 모니터", 750000, 50));
		
		return aList; // ----> 리턴값의 형태가 중요함
	}
}


public class ListEx03 {
	public static void main(String[] args) {
//		객체(Item) : 상품번호, 상품명, 가격, 재고
//		List<Item> aList = new ArrayList<>();
		
//		aList.add(new Item(10001000L, "IBM 노트북", 2000000, 10));
//		aList.add(new Item(20002000L, "게이밍 마우스", 50000, 999));
//		aList.add(new Item(20001000L, "LG LED 모니터", 750000, 50));
		
//		System.out.println("등록된 상품은 "+aList.size()+"개입니다.");
//		System.out.println("---------for 1 상품출력-------------");
//		for(int i=0;i<aList.size();i++) {
//			aList.get(i).itemDisp();
//		}
		
		ItemDao dao = new ItemDao();
		
		System.out.println("---------for 2 상품출력-------------");
//		for(Item item : dao.getItems()) {
//			item.itemDisp();
//		}
		
		List<Item> list = dao.getItems(); // 변수로 받아오기
		for(Item item : list) {
			item.itemDisp();
		}
		
		
	}
}
