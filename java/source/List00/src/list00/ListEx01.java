package list00;
import java.util.*;

public class ListEx01 {
	public static void main(String[] args) {
//		List -> ArrayList, Vector
//		입력, 수정, 삭제 -> 데이터 변동이 잦은
//		정수를 출력하는 ArrayList
		
		List<Integer> aList = new ArrayList<>();
		aList.add(100);
		aList.add(200);
		
		int count = aList.size();
		System.out.println(count);
		System.out.println("---------------------");
		
		System.out.println("for문(for 1)");
//		for(int i=0;i<조건;i++) {
//			출력코드();
//		}
		for(int i=0;i<count;i++) {
			System.out.println(aList.get(i));
		}
		System.out.println("---------------------");
		
		System.out.println("향상된 for문(for 2)");
//		for(출력타입 별명 : 배열) {
//			출력코드(별명);
//		}
		for(Integer num : aList) {
			System.out.println(num);
		}
	}
}
