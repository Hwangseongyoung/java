package tut07_2;

public class HelloEx {
	
//	유지보수
	
//	매개변수는 있을 수도 있고, 없을 수도 있음
//	public(아무나), private(나만 : 캡슐화)
//	syso(리턴타입->void), syso X(타입)
//	접근제한자 리턴타입 메소드명(매개변수) {
//		return 변수명;
//	}
	public void disp(String title) {
//		System.out.println("Koreait 아카데미");
		System.out.println(title+" Academy");		
	}
	
	public static void main(String[] args) {
////		System.out.println("코리아아이티");
//		
////		다른 메소드를 가져다가 쓰려면..
////		메소드가 있는 클래스명을 사용한다.
////		클래스명 이름 = new  클래스명();
//		HelloEx he = new HelloEx();
//		he.disp();
//		he.disp();
		
		HelloEx he = new HelloEx();
//		매개변수에서 보낼 때 값 -> 받을 때는 타입 변수
		he.disp("부산"); // 메소드를 동적으로 처리하기 위해
		he.disp("서울");
	}
}
