package setEx;

import java.util.*;

public class SetEx01 {
	public static void main(String[] args) {
//		Set -> HashSet
//		Set<> set = new HashSet<>();
		
//		HashSet으로 정수 저장
//		HashSet으로 문자열 저장
//		삭제, 출력
		Set<Integer> set = new HashSet<>();
//		배열명.add(값또는객체);
		set.add(100);
		set.add(200);
		set.add(300);
//		값을 배열 형태로 ...
		System.out.println(set.toString());
		System.out.println(set.size());
		
		System.out.println("-----------------------------------");
		
		HashSet<String> hs = new HashSet<>();
		hs.add("Seoul");
		hs.add("Busan");
		hs.add("Seoul");  // ---> 중복된 값 허용X
		System.out.println(hs.toString());
		System.out.println(hs.size());
		
//		hs.remove(0);
		hs.remove("Seoul");
		
		for(String str : hs) {
			System.out.println(str);
		}
		
//		검색 배열명.contains(검색어) -> boolean
		Set<String> set2 = new HashSet<>();
		set2.add("Red");
		set2.add("Green");
		set2.add("Blue");
		
//		System.out.println(set2.contains("Black"));
//		System.out.println(set2.contains("Red"));
		
		System.out.println("---------Remove, RemoveAll---------");
		set2.remove("Green");
		System.out.println(set2.size());
		
		set2.removeAll(set2);
		System.out.println(set2.size());
	}
}
