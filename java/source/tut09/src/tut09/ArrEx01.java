package tut09;

public class ArrEx01 {
	public static void main(String[] args) {
//		배열 + 반복문(for - 배열번호가 필요한 경우, 향상된 for - 값만 출력)
//		배열번호(index)는 0부터 시작
//		i, idx, index 변수이름이 보이면 배열처리
//		<for문>
//		for(int i=0;i<배열명.length;i++) {
//			출력코드(배열명[i]);
//		}
		
//		<향상된 for문>
//		for(출력타입 별명 : 배열명) {
//			출력코드(별명);
//		}
		
//		데이터타입[] 변수명 = new 데이터타입[];
//		int[] value = null;
//		value = new int[10];
		
////		생성자 : 초기화
//		Member m = new Member(); // 초기화  ->  헷갈리지 않게 조심
		
//		정수 100개에 값을 저장하는 프로그램을 완성하시오.
		int[] value = new int[3]; // 4byte * 100개의 공간이 생성 -> 초기화아니고 공간만 생성 값을 넣어서 초기화 해줘야 함 		
		value[0] = 100; // 초기화
		value[1] = 200; // 초기화
		value[2] = 300; // 초기화
		
//		배열 0 ~ 2까지 출력하시오.
//		배열명[인덱스번호]
//		System.out.println(value[0]);
//		System.out.println(value[1]);
//		System.out.println(value[2]);
		
//		for
//		value[0]의 값은 0입니다.
//		1번 값은 100입니다.
//		2번 값은 200입니다.
//		3번 값은 300입니다.
		for(int i=0;i<3;i++) {
//			System.out.println(value[i]);
//			System.out.println("value["+i+"]의 값은 "+value[i]+"입니다.");
			System.out.println((i+1)+"번 값은 "+value[i]+"입니다.");
		}
		
		System.out.println("-------------------------------------------");
//		int[] num = {1, 2, 3, 4, 5};     -> 초기값을 설정하면 배열 개수가 생성
//		학생 3명 점수를 초기값으로 설정 후
//		화면에 출력하시오.
//		합계를 출력하시오.
//		평균을 출력하시오.
		
		int[] jumsu = {88, 55, 66, 45, 93};
		
//		등록된 학생 수는 1000개입니다.
		System.out.println("등록된 학생 수는 "+jumsu.length+"명 입니다.");
		
		System.out.println("===========화면 출력===========");
		for(int i=0;i<jumsu.length;i++) {
			System.out.println((i+1)+"번 학생의 점수는 "+jumsu[i]+"점 입니다.");
		}
		
		System.out.println("===========합계 출력===========");
//		합계 : 누적(전역, static)
		int sum = 0;
		
		for(int i=0;i<jumsu.length;i++) {
			sum += jumsu[i];
		}
		System.out.println("학생들의 점수 합계는 "+sum+"점 입니다.");
		
		System.out.println("===========평균 출력===========");
		double avg = (double)sum / jumsu.length;
		System.out.println("학생들의 점수의 평균은 "+avg+"점 입니다.");
		
//		출력 포맷 변경 소수점 2자리로 설정
//		평균은 87.55입니다.(소수점 두 번째 자리까지 출력)
		System.out.println(String.format("평균은 %.2f입니다.", avg));
		System.out.printf("평균은 %.2f입니다.", avg);
	}
}
