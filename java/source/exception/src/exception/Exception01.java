package exception;

import java.io.*;

public class Exception01 {
	public static void main(String[] args) {
//		- Exception : 컴파일
//		   1. ClassNotFoundE~ : Class.forName(디비);
//		   2. IOE~
//		   3. FileNotFoundE~ : 파일이 없는 경우
//		   4. InterrupE~ : 쓰레드
//		   5. CloneNotSupportEx~ : clone 객체 사용할 때
		
//		ClassNotFoundException
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결 성공");
		} catch(ClassNotFoundException e) {
			e.printStackTrace(); // 예외가 발생 부분 표시 : 개발자
			e.getMessage(); // 예외 메세지
			System.out.println("404 Error : 관리자에게 문의하세요.");
		} finally { // 성공, 실패 여부 상관없이 마지막에 꼭 실행해야 하는 내용
			System.out.println("프로그램 종료.");
		}
		
		
//		FileNotFoundException
		try {			
			FileInputStream fis = new FileInputStream("./koreait.txt");
			fis.read();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("404 Error : 관리자에게 문의하세요.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일에 데이터를 읽어올 수 없습니다.");
		} finally {
			System.out.println("종료합니다.");
		}
		
		
//		 - Runtime Exception : 실행 단위
//		    1. ArimetricEx~ : 나누기예외
//			2. ArrayIndexOutBoundE~
//			3. NullPointEx~
		
//		ArrayIndexOutOfBoundsException
		try {
			System.out.println(10/0);
		} catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			ae.getMessage();
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		String[] str = new String[] {"a", "b", "c"};
		try {
			System.out.println(str[3]);
		} catch(ArrayIndexOutOfBoundsException aiobe) {
			aiobe.printStackTrace();
			System.out.println("인덱스 번호 예외");
		}
		
		
//		NullPointerException
		String str2 = "Koreait";
//		String str3 = new String("Koreait");
//		글자 추출 후 char로 변경해서 출력
//		System.out.println(str2.charAt(0));
		
		String str3 = null;
		
		try {
			System.out.println(str3.charAt(0));
		} catch(NullPointerException npe) {
			npe.printStackTrace();
			System.out.println("데이터 값이 없습니다.");
		}
	}
}
