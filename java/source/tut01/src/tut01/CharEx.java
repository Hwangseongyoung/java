package tut01;

public class CharEx {
	public static void main(String[] args) {
//		데이터타입 변수명 = 값;
		char c = 'a'; // ""쓰면 오류
		String str = "b"; // ''쓰면 오류
		int ch = 'a'; // ASCII코드로 출력
		
		System.out.println(c);
		System.out.println(str);
		System.out.println((char)(ch + 1));
		
		System.out.println("---------------------------");

//		회원가입 했을 때 저장된 아이디, 비밀번호
		String userid = "koreait";
		String passwd = "12345";
		
//		내가 지금 입력한 아이디, 비밀번호
		String userid2 = "seoul";
		String passwd2 = "67890";
		
		if(userid.equals(userid2) && passwd.equals(passwd2)) {
			System.out.println("로그인 되었습니다.");
		}
		else {
			System.out.println("다시 로그인해주세요.");
		}
		
//		값이 같냐 다르냐 A.equals("B") A와 B의 값이 같으면		
//		확인 => if -> 맞으면 로그인되었습니다. / 틀리면 다시 로그인해주세요.
		
	}
}
