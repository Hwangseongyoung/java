package tut09;

import java.util.Arrays;

public class ArrEx02 {
	public static void main(String[] args) {
//		1. 타입[] 이름 = new 타입[] {1,2,3,4,5};
		
		int[] arr = new int[] {1, 2, 3, 4, 5};
		boolean[] arr2 = new boolean[] {true, false};
		double[] arr3 = new double[] {0.0, 0.1, 0.2};
		String[] arr4 = new String[] {"Red", "Green", "Blue"};
		
//		고정배열.length, 가변배열.size()  -> 배열 길이
		System.out.println(arr4.length);
		
//		toString -> 문자열로 표현
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr2));
		
//		2. 값을 출력
		
//		정수는 100입니다.
		for(int i=0;i<arr.length;i++) {
			System.out.println("정수는 "+arr[i]+"입니다.");
		}
		
//		<향상된 for문>
//		for(출력타입 별명 : 배열명) {
//			출력코드(별명);
//		}
		System.out.println("===========향상된 for===========");
//		1, 2, 3, 4, 5
		for(int v : arr) {
			System.out.println("정수는 "+v+"입니다.");
		}
		
//		true, false
		System.out.println("------------------------------");
		for(boolean b : arr2) {
			System.out.println("논리값은 "+b+"입니다.");
		}
		
//		Red, Green, Blue
		System.out.println("------------------------------");
		for(String s : arr4) {
			System.out.println("문자열은 "+s+"입니다.");
		}
		
//		3. 배열에 있는 값을 확인
	}
}
