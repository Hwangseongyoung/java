package ioEx;

import java.io.*;

public class StreamEx03_1 {
	public static void main(String[] args) throws IOException {
//		k(1) o(1) r(1) e a i t   ->  -1 return(더 이상 읽어올 글자가 없으면)
		String filename = "c:\\temp\\koreait.txt";
		InputStream is = new FileInputStream(filename); // 파일 내용을 읽어올 준비
		
//		is.read(); 1byte
		while(true) {
			int result = is.read(); // 글자를 byte로 읽어오지만 정수로 처리
			if(result==-1) { // 더 이상 출력할 글자가 없으면 -1 return
				break; // 제일 가까운 반복문 벗어 남
			}
			System.out.print((char)result+" ");
			System.out.println("남은 byte(s)는 "+is.available()+"byte(s) 입니다.");
		}
		is.close();
	}
}
