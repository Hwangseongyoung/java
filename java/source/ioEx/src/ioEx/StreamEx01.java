package ioEx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamEx01 {
	public static void main(String[] args) throws IOException {
//		입출력
//		1. (1)byte : 텍스트, 파일, 이미지
//			1) OutputStream / InputStream 
//					쓰기			  읽기
		
//		2. char : 텍스트 전용
		
//		버퍼, 캐시 메모리(L1, L2) => 속도 향상
		
//		자료 보냄
//		버퍼 비움(flush)
//		close
		
		
//		파일 생성
		String filename = "koreait.txt";
		File f = new File("c:\\temp\\"+filename); // 준비
		
		
//		파일생성+글쓰기 : OutputStream = FileOutputStream
		OutputStream os = new FileOutputStream(f);
		os.write('K');
		os.write('O');
		os.write('R');
		os.write('E');
		os.write('A');
		os.write('I');
		os.write('T');
		
		os.flush();
		os.close();
//		write();
//		flush();
//		close();
	}
}
