package tut09;

class Users3 {
//	필드
	String userid;
	String passwd;
	int age;
	
	
//	생성자
	public Users3() {}

	
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

	
//	메소드
	@Override
	public String toString() {
		return "Users3 [userid=" + userid + ", userpw=" + passwd + ", age=" + age + "]";
	}
}


public class UsersEx03 {
	public static void main(String[] args) {
		Users3[] u3 = new Users3[3];
		
//		set 저장
//		for(int i=0;i<u3.length;i++) {
//			u3[i] = new Users3();
//			
//			u3[i].setUserid("아이디"+i);
//			u3[i].setPasswd("비밀번호"+i);
//			u3[i].setAge(i);
//			
//			System.out.println(i+"번째 회원정보를 출력합니다.");
//			System.out.println(u3[i].getUserid());
//			System.out.println(u3[i].getPasswd());
//			System.out.println(u3[i].getAge());
//			System.out.println("--------------------------------------");
//			System.out.println();
//		}
		
		for(int i=0;i<u3.length;i++) {
			u3[i] = new Users3();
			u3[i].setUserid("코리아"+i);
			u3[i].setPasswd("비번"+i);
			u3[i].setAge(i);
		}
		System.out.println(u3.length+"명의 회원정보가 저장되었습니다.");
		
		System.out.println();
		System.out.println("회원정보를 출력합니다.");
		
		for(int i=0;i<u3.length;i++) {
			Users3 member = u3[i];
			System.out.println(member.getUserid());
			System.out.println(member.getPasswd());
			System.out.println(member.getAge());
		}
	}
}
