package tut07_2;

//public class는 같은 파일내에 하나만 존재해야한다.
//Hello.java를 생성하여 두 개의 파일로 나눌 수 있다.(기본적으로)
//class Hello {
//	public void welcome() {
//		System.out.println("코리아아이티 아카데미");
//	}
//}

public class WebEx {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.welcome();
	}
}
