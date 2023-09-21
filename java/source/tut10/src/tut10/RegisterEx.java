package tut10;

import java.util.Scanner;

public class RegisterEx {
	public static void main(String[] args) {
//		Scanner를 이용해서 배열 생성 : 3개
//		입력 Scanner
//		for문 사용
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가입할 회원 수 >> ");
		int count = sc.nextInt();
		
		Register[] r = new Register[count]; // 객체 개수
//		System.out.println(r.length);
		
//		for 입력
		for(int i=0;i<r.length;i++) {
//			r[0]
			System.out.print("이메일 >> ");
			String email = sc.next();
			
			System.out.print("비밀번호 >> ");
			String passwd = sc.next();
			
			System.out.print("이름 >> ");
			String uname = sc.next();
			
			r[i] = new Register(email, passwd, uname);
			System.out.println((i+1)+"번째 회원이 등록되었습니다.");
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		System.out.println("회원가입이 완료 되었습니다.");
		System.out.println();
		System.out.println("================="+r.length+"명 회원출력==================");
		
		
//		향상된 for문
//		for(타입 별명 : 배열) {
//			출력코드(별명);
//		}
		for(Register reg : r) {
			System.out.println(reg.disp());
			System.out.println("--------------------------------------------");
		}
	}
}
