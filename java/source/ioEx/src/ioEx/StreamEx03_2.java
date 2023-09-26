package ioEx;

import java.io.*;

public class StreamEx03_2 {
	public static void main(String[] args) throws IOException {
		String filename = "c:\\temp\\koreait.txt";
		InputStream is = new FileInputStream(filename);
		
		int result= 0;
		while((result = is.read()) != -1) {
			System.out.print(result+" > ");
			System.out.println((char)result);
		}
		is.close();
	}
}
