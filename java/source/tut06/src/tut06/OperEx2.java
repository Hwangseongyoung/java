package tut06;

public class OperEx2 {
	public static void main(String[] args) {
		int std1 = 80;
		int std2 = 70;
		int avg = 75;
//		AND 이고, 이면서
//		OR 이거나, 또느
//		학생1 점수가 평균 점수보다 높고 학생2 점수가 평균보다 높으면
//		통과, 아니면 재평가
		
//		if(조건1 && 조건2) {
//			출력코드(참)
//		}
//		else {
//			출력코드(거짓)
//		}
		if(std1 >= avg && std2 >= avg) {
			System.out.println("통과");
		}
		else {
			System.out.println("재평가");
		}
		
		System.out.println("----------------AND 연산자------------------");
		
		/*학생 점수가 90이상 100이하 이고 최우수
		80이상 89이하 이고 우수
		나머지는 보통으로 출력하시오.*/
		
		int jumsu = 88;
		
		if(jumsu >= 90 && jumsu <=100) {
			System.out.println("최우수");
		}
		else if(jumsu >=80 && jumsu <= 89) {
			System.out.println("우수");
		}
		else {
			System.out.println("보통");
		}
		
		System.out.println("------------------------------------------");
		
//		가입한 회원정보가 이메일과 비밀번호를 비교하여
//		모두 일치하면 로그인 되었습니다.
//		일치하지 않으면 로그인 정보가 일치하지 않습니다.로 표시
//		가입된 정보는 db 이메일, 비번
//		로그인 할 때 입력하는 이메일, 비번
		String db_id = "koreait";
		String db_passwd = "1234";
		
		String id = "koreait";
		String passwd = "1234";
		
		boolean id_check = db_id.equals(id);
		boolean passwd_check = db_passwd.equals(passwd);
		
		if(id_check && passwd_check) {
			System.out.println("로그인 되었습니다.");
		}
		else {
			System.out.println("로그인 정보가 틀립니다.\n로그인 페이지로 이동합니다.");
		}
		
		System.out.println( true && true); // 모두 같아야함
		System.out.println( false && true); // 하나라도 다르면 거짓
		
		System.out.println( false || true); // 하나라도 참이면 참
		System.out.println( true || true); // 하나라도 참이면 참
		
		boolean res = true && false;
		System.out.println(res);
		
		if(res) {
			System.out.println("위 결과는 참입니다.");
		}
	}
}
