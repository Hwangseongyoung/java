package tut07;

public class IfEx {
	public static void main(String[] args) {
//		임의의 점수(정수) 생성 : 0 ~ 100
//		점수가 90보다 크면 100점보다 적습니다. 학점은 A학점입니다.
//		80보다 크면 B학점
		
//		if(), if() ~ else, if() ~ else if() ~ else
		
//		int[] arr; // 배열 선언
//		arr = new int[3]; // 초기화
		
		int num; // 변수를 선언 -> 메모리 생성 -> 값X -> 초기화
		num = 88;
		
		if(num >= 90) {
			System.out.println("100점 보다 적습니다.");
			System.out.println("학점은 A학점입니다.");
		}
		else {
			System.out.println("90점 보다 적습니다.");
			System.out.println("학점은 B학점입니다.");
		}
	}
}
