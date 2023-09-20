package tut07;

import java.util.Scanner;

public class BalanceEx {
	public static void main(String[] args) {
		
		int sum = 0; //잔고
		int money = 0; //입력 금액
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			
			switch(menu){
			case 1:
				System.out.print("예금할 금액> ");
				money = sc.nextInt();
				System.out.println("예금금액 : "+money+"원");
				sum += money;
				System.out.println("잔고 : "+sum+"원");
				break;
				
			case 2:
				System.out.print("출금할 금액> ");
				money = sc.nextInt();
				System.out.println("출금금액 : "+money+"원");
				if(sum<money){
					System.out.println("잔액이 부족합니다.");
					break;
				}
				sum -= money;
				System.out.println("잔고 : "+sum+"원");
				break;
				
			case 3:
				System.out.println("잔고 : "+sum+"원");
				break;
				
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
				
			default:
				System.out.println("메뉴를 다시 입력해주세요.");
				break;
			}
		}
	}
}
