package ioEx;

import java.io.*;

public class StreamEx02 {
	public static void main(String[] args) throws IOException {
		String filename = "c:\\temp\\koreait.txt";
		File f = new File(filename); // 파일이 생성될 준비
		
//		FileOutputStream : 기본 false, 안적으면(덮어쓰기), true(이어적기)
//		OutputStream os = new FileOutputStream(f, true);
		OutputStream os = new FileOutputStream(f);
//		byte(1), char(1)
		String str = "koreait";
//		byte -> 배열명.getBytes();
//		개행
		
//		k o r e a i t 출력 => -1(더 이상 출력할 것이 없으면)
		byte[] b = str.getBytes();
		os.write(b);
		os.write('\n');
		os.flush();
		os.close();
	}
}
