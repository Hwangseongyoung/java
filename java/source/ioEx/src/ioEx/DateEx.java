package ioEx;

import java.text.SimpleDateFormat;

public class DateEx {
	public static void main(String[] args) {
		
//		currentTimeMillis()
//		월(MM) - 분(mm)
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis()));
		
		System.out.println(System.currentTimeMillis());
		
//		substring(".")
//		원본저장 : koreait.txt
//		사본 : System.currentTimeMillis().txt
//		용량저장 : 1~10MB
	}
}
