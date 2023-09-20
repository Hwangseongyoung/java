package tut01;

public class BooleanEx {
	public static void main(String[] args) {
//		컴퓨터는 0, 1 => false(거짓) 0
//				   => true(참) 0을 제외한 양수는 참(1)
//		기초타입의 초기값 설정
//		int i = 0;
//		double d = 0.0;
//		String str = "";
		boolean b = true;
		
//		참이면 통과, 아니면 재평가
		
//		equals() : String 값
//		그 외 같은 걸 비교할 때는 ==
		if(b) {
			System.out.println("통과");
		}
		else {
			System.out.println("재평가");
		}
		
//		***삼항연산자***
//		1) 조건이 참이면 "통과", 아니면 "재평가"를 출력하시오.
//		조건 ? "참일 때" : "거짓일 때";
//		String result = b ? "통과" : "재평가";
//		System.out.println(result);
		
//		2) 조건이 참이면 1, 아니면 0을 출력하시오.
//		조건 ? "참일 때" : "거짓일 때";
//		int result = b ? 1 : 0;
//		System.out.println(result);
		
//		3) 조건이 참이면 1.0, 아니면 0.0을 출력하시오.
//		조건 ? "참일 때" : "거짓일 때";
//		double result = b ? 1.0 : 0.0;
//		System.out.println(result);
		
//		4) 조건이 참이면 true, 아니면 false을 출력하시오.
//		조건 ? "참일 때" : "거짓일 때";
//		boolean result = b ? true : false;
//		System.out.println(result);
	}
}
