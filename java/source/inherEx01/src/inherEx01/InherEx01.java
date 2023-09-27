package inherEx01;

class Add {
	String title = "계산기 프로그램";
	
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
//	정수 + 정수 = 정수
	int add(int num1, int num2) {
		return num1 + num2;
	}
}

class DeskTop extends Add{
	void Os() {
		System.out.println("Windows Ver 11...");
	}
}

class LapTop extends Add {
	void Os() {
		System.out.println("IOS Ver 11...");
	}	
}

public class InherEx01 {
	public static void main(String[] args) {
//		객체 => 상속 => 프로그램 확장(회원가입 -> 게시판 -> 다중 -> 일정...)
//		C++ -> 다중상속 -> 상속(자바) : 강제성X -> 인터페이스(다중) : 강제성O
//						  강제성 abstract
//							 extends	   |	implements
		
		DeskTop d = new DeskTop();
		
		System.out.println("데스크 탑 컴퓨터");
		d.title = "코리아아이티 계산기";
		d.turnOn();
		d.Os();
		
		System.out.println(d.title);
		System.out.println(d.add(100, 200));
		d.turnOff();
		
		System.out.println("---------------------------------");
		
		LapTop lap = new LapTop();
		lap.turnOn();
		lap.Os();
		System.out.println(lap.title);
		System.out.println(lap.add(1, 2));
		lap.turnOff();
	}
}
