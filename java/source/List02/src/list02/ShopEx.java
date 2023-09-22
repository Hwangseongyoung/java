package list02;

public class ShopEx {
	public static void main(String[] args) {
//		판매자로 회원가입 -> 판매자 승인 -> 상품 등록(여러개-List)
//		황성영만 쓸 수 있는 List 배열 공간을 만들어줌
		Seller seller = new Seller(10001, "황성영");
		
		seller.addItem("삼성 노트북", 1000000, 10);
		seller.addItem("무선 마우스", 5000, 999);
		seller.showMemberInfo();

		System.out.println();
		System.out.println("==========================================");
		System.out.println();
		
		Seller seller2 = new Seller(20001, "김철수");
		
		seller2.addItem("LG 노트북", 1000000, 10);
		seller2.showMemberInfo();
	}
}
