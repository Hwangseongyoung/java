package tut07_2;

public class HelloEx3 {
	public String title(String company) { // 이것만으로 화면 출력X
		return company+" 코리아아이티 아카데미";
	}
	
	public static void main(String[] args) {
//		부산 코리아아이티 아카데미
//		서울 코리아아이티 아카데미
//		광주 코리아아이티 아카데미
		HelloEx3 he = new HelloEx3(); // 클래스 안에 메소드 가져오려면...
		System.out.println(he.title("부산"));
		System.out.println(he.title("서울"));
		System.out.println(he.title("광주"));
	}
}
