package tut06;

public class ScopeEx {
	public static void main(String[] args) {
//		변수가 미치는 범위 {}
		
//		int num1 = 10;
//		{
//			int num2 = 5;
//			System.out.println(num);
//		}
//		System.out.println(num1);
////		System.out.println(num2);
		
//		System.out.println("-------------예제1--------------");
		
//		int num = 10;
//		
//		for(int i=0;i<10;i++) {
//			System.out.println(num);
//			System.out.println(i);
//		}
//		System.out.println(num);
////		System.out.println(i);
		
//		System.out.println("--------------예제2-------------");
		
//		int num = 10;
//		
//		int i;
//		for(i=0;i<10;i++) {
//			System.out.println(num);
//			System.out.println(i);
//		}
//		System.out.println(i);
		
//		System.out.println("--------------예제3-------------");
		
//		1 ~ 10까지 더해서 총합을 출력하시오.(한 번)
//		누적되는 값을 처리하려면 반복문 밖에 변수를 선언하거나(전역변수)
//		static 메소드를 사용해야함
//		for(int i=1;i<10;i++) {
//			int sum = 0; // 총합을 저장하는 변수
//			sum = sum + i;
//		}
//		System.out.println(sum); // for문 안에서 sum이라는 변수를 선언하였기 때문에 밖에서는 사용못함
		
//		System.out.println("--------------예제3 문제해결-------------");
		
//		int sum = 0; // 총합을 저장하는 변수
//		for(int i=1;i<10;i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
//		System.out.println("--------------예제4-------------");
		
//		변수 값은 바로 위 중괄호 영역에서만 값을 사용
//		단, for()문은 오른쪽 {} 안에서만 값을 사용할 수 있다.
		
//		값을 누적할 때는 전역변수 형태로 또는 변수 앞에 static 붙혀서
//					(바로 위 중괄호 밖으로 이동)
//		int i = 0;
//		while(i<10) {
//			System.out.println(i);
//			++i;
//		}
//		System.out.println(i);
//		
//		for(int j=0;j<10;j++) {
//			
//		}
	}
}
