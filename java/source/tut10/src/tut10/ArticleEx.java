package tut10;

import java.util.Scanner;

public class ArticleEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("게시물 개수 >> ");
		int count = sc.nextInt();
		
		Article[] art = new Article[count];
		
//		set 입력 -> 생성자를 통해 초기화
		for(int i=0;i<art.length;i++) {
			art[i] = new Article(); 
			art[i].setNum((i+1));
			art[i].setSubject("게시물 테스트"+(i+1));
			art[i].setVisit(art[i].getVisit()+i);
			
			System.out.println((i+1)+"번 게시물이 생성되었습니다.");
		}
		System.out.println(art.length+"개의 게시물 등록이 완료 되었습니다.");
		
		System.out.println("-----------------------------------------------");
		
//		get 입력
//		향상된 for문
//		for(출력타입 별명 : 배열) {
//			출력코드(별명);
//		}
		for(Article a : art) {
			System.out.println(a.toString());
		}
	}
}
