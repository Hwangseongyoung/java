package tut07_2;

public class HelloEx2 {
	
//	접근제한자 리턴타입 메소드명() {
//		
//	}
	public void title(String str) {
//		부산 Koreait 아카데미
//		서울 Koreait 아카데미
//		광주 Koreait 아카데미
		System.out.println(str+" Koreait Academy");
	}
	public void info(String tel, String addr) {
		System.out.println("전화번호 : "+tel);
		System.out.println("주소 : "+addr);
	}
	
	public static void main(String[] args) {
//		HelloEx2 클래스 안의 내용 전체를 가져온다.
		HelloEx2 busan = new HelloEx2();
		busan.title("부산");
//		System.out.println("전화번호 : 051-123-4567");
//		System.out.println("주소 : 부산광역시");
		busan.info("051-123-4567", "부산광역시");
		busan.title("부산");
//		코리아아이티 아카데미 : syso
//		전화번호, 주소
//		코리아아이티 아카데미 : syso
		System.out.println("------------------------------");
		
		HelloEx2 seoul = new HelloEx2();
		seoul.title("서울");
//		System.out.println("전화번호 : 02-123-4567");
//		System.out.println("주소 : 서울특별시");	
		seoul.info("02-123-4567", "서울특별시");
		seoul.title("서울");
		System.out.println("------------------------------");
		
		HelloEx2 gwangju = new HelloEx2();
		gwangju.title("광주");
//		System.out.println("전화번호 : 063-123-4567");
//		System.out.println("주소 : 광주광역시");
		gwangju.info("063-123-4567", "광주광역시");
		gwangju.title("광주");
	}
}
