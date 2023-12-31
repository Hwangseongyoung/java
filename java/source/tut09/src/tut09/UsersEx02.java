package tut09;

class Users2 {  // 객체 구성 요소
//	필드(멤버변수) : 공유 변수
	String userid;
	String passwd;
	int age;
	
	
//	생성자
	public Users2() {}
	
	public Users2(String userid, String passwd, int age) {
		this.userid = userid;
		this.passwd = passwd;
		this.age = age;
	}
	
	
//	캡슐화(데이터보호) 처리 : 저장하기 set, 가져오기 get
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


//	메소드
	@Override
	public String toString() {
		return "Users2 [userid=" + userid + ", passwd=" + passwd + ", age=" + age + "]";
	}
}

public class UsersEx02 {
	public static void main(String[] args) {
//		3명의 회원(Users2)을 생성자로 저장 후 출력
	/*	Users2 user = new Users2;  ---> 한명 저장할 때
		Users2[] user = new Users2[3]; ---> 여러명 저장할 때  */
		
		Users2[] user = new Users2[3];
//		3명 -> 초기화 3번
		user[0] = new Users2("a", "b", 10);
		user[1] = new Users2("1", "2", 22);
		user[2] = new Users2("3", "4", 55);
		
		for(int i=0;i<3;++i) {
			user[i] = new Users2("아이디"+i, "비번"+i, (0+i));
			
			System.out.println(user[i].toString());
		}
		
		System.out.println("------------------------------------------");
		
		for(int i=0;i<3;i++) {
//			set 이용해서 저장
			user[i] = new Users2(); // 초기화 해야함
			user[i].setUserid("Busan");
			user[i].setPasswd("1234");
			user[i].setAge(10);
			
			System.out.println(user[i].toString());
		}
		
	}
}
