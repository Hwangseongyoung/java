package tut09;

class Users {  // 객체 구성 요소
//	필드(멤버변수) : 공유 변수
	String userid;
	String passwd;
	int age;
	
	
//	생성자 : 객체 초기화 -> public 시작하고 클래스 이름과 동일 리턴X
	public Users() {}
	
	public Users(String userid) {
		this.userid = userid;
	}
	
	public Users(String userid, String passwd) {
			this.userid = userid;
			this.passwd = passwd;
	}

	public Users(String userid, String passwd, int age) {
		this.userid = userid;
		this.passwd = passwd;
		this.age = age;
	}

//	public Users(String userid, String passwd, int age) {
//		this.userid = userid;
//		this.passwd = passwd;
//		this.age = age;
//	}

	
//	getter, setter
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", passwd=" + passwd + ", age=" + age + "]";
	}
}

public class UsersEx {
	public static void main(String[] args) {
//		회원가입 1명을 처리하시오.
//		생성자를 이용해서 저장
//		getter, setter
		
//		Users[] user = new Users[1]; // 회원 한명 저장(아이디, 비밀번호, 나이)
////		user[0].userid = "코리아아이티"; // 필드 직접 저장   ---> 안쓰는게 좋음
////		user[0].passwd = "1234";
////		user[0].age = 10;
//		
////		생성자를 이용해서 초기화(값 할당)
//		user[0] = new Users("코리아아이티", "1234", 20);
//		System.out.println(user[0].toString());
		
		
//		User.java * 2개
//		Users[] user = new Users[2];
//		
//		user[0] = new Users("아이디1", "비번1", 10);
//		user[1] = new Users("아이디2", "비번2", 20);
//		
//		System.out.println(user[0].toString());
//		System.out.println(user[1].toString());
		
		
//		User.java * 3개
//		Users[] user = new Users[3];
//		user[0] = new Users();  // 초기화
//		user[1] = new Users();  // 초기화
//		user[2] = new Users();  // 초기화
//		
//		user[0].toString();
//		user[1].toString();
//		user[2].toString();
//		
//		for(int i=0;i<user.length;i++) {
//			user[i] = new Users(); // 왜 이 구문이 필요한 지...
//		/*	user[i] = new Users("아이디"); // 왜 이 구문이 필요한 지...
//			user[i] = new Users("아이디", "비번"); // 왜 이 구문이 필요한 지...
//			user[i] = new Users("아이디", "비번", 10); // 왜 이 구문이 필요한 지...  
//		}  */
		
		
//		getter, setter
		Users[] user = new Users[1];
		
		user[0] = new Users("서울아이티");
		
		user[0].setUserid("코리아아이티");
		System.err.println(user[0].getUserid());
	}
}
