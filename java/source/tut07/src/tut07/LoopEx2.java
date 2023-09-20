package tut07;

public class LoopEx2 {
	public static void main(String[] args) {
//		값을 누적할 때 전역(변수를 중괄호 위로 이동), static
//		1 ~ 100 : 1,2,3,4,5,6 ...
		
		int sum = 0;
		for(int i=1;i<100;i+=2) {
			sum += i; //1
		}
		System.out.println(sum);
	}
}
