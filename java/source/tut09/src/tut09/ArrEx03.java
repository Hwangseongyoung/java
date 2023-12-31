package tut09;

//class Cal {   // ------------> 외부 클래스로 분리함
////	합계 메소드 : 동작
//	public int sum(int[] scores) {
////		누적하는 전역
//		int sum = 0;
//		for(int i=0;i<scores.length;i++) {
//			sum += scores[i];
//		}
//		return sum;
//	}
//	
////	평균 메소드 : 동작
//	public double avg(int[] scores) {
//		int sum = 0;
//		for(int i=0;i<scores.length;i++) {
//			sum += scores[i];
//		}
//		return (double)sum / scores.length;s
//	}
//}

//class Display {   // -----------> 외부 클래스로 분리함
//	public void title() {
//		System.out.println("코리아아이티 아카데미 계산기");
//	}
//	
//	public String close() { // 프로그램 종료
//		return "프로그램 종료";
//	}
//}

public class ArrEx03 {
	public static void main(String[] args) {
//		프로그램 시작 알림 출력
		Display d = new Display();
		d.title("컴퓨터 프로그램");
		
//		메소드를 이용하여 출력
//		정수에 5개 점수를 입력 후
//		합계
//		평균
		
//		int[] scores = new int[] {1, 2, 3, 4, 5};
		int[] scores = null;
		scores = new int[] {11, 22, 33, 44, 55, 66, 77, 88};
		
//		보낼 때는 값(오른쪽), 받을 때는 타입(왼쪽)
		Cal c = new Cal(); // 생성자를 통해 접근
		
//		합계
//		배열 10개의 합은 100입니다.
//		System.out.println(c.sum(scores));
		System.out.println("배열 "+scores.length+"개의 합은 "+c.sum(scores)+"입니다.");
		
//		평균
//		평균은 88.00입니다.
		System.out.printf("평균은 %.2f입니다.\n", c.avg(scores));
		
//		프로그램 종료 알림 출력
		System.out.println(d.close("시스템 종료"));
	}
}
