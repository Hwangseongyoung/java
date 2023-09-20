package tut01;

public class DoubleEx {
	public static void main(String[] args) {
//		실수를 저장하는 변수 -> 값을 지정하지 않았을 때
//		값을 1.0으로 바꿀 때
		
		double d = 0.0;
		System.out.println("(초기값)d = "+d);
		
//		변수 선언은 기본적으로 overwrite(덮어쓰기)
		d = 1.0;
		System.out.println("(변경후)d = "+d);
		
//		d2라는 변수를 추가하는데 값은 2.0 / d와 d2를 더하기
		double d2 = 2.0;
		System.out.println("d + d2 = "+(d + d2));
		
		System.out.println("-------------------------------");
		
		double do1 = 1.23456;
		double do2 = 2.23456;
//		double do1, do2;
//		do1 = 1.23456;
//		do2 = 2.23456;
		System.out.println("(실수형)do1 + do2 = "+(do1 + do2));
//		쇼핑몰 -> 1.2 + 2.2 = 3.4 => 3
		
//		연산자 우선순위
//		특별히 지정하지 않으면 가까운 쪽에 것을 먼저 처리
//		순수한 숫자를 제외하면 +연산자는 앞뒤를 연결할 때 사용
		System.out.println("(정수형 변환)do1 + do2 = "+(int)(do1 + do2));
		
		System.out.println("-------------------------------");		
		System.out.println(3 % 2);
		System.out.println(3 % 4);
		
		System.out.println("-------------------------------");
//		0012345-1234567 주민번호의 8번째 숫자를 이용하여 남자, 여자를 표시하시오.
//		(단, %, if를 사용해서 표시하시오.)
		
//		1이면 남자, 2이면 여자로 표시하시오
		int jumin = 2;
		
		if(jumin % 2 == 1) {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
		
//		***삼항연산자***
//		조건 ? "참일 때" : "거짓일 때";
//		String result = jumin % 2 == 1 ? "남자" : "여자";
//		System.out.println(result);
	}
}
