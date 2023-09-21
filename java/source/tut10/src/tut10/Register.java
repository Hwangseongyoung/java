package tut10;

public class Register {
//	1. 필드
	private String email;
	private String passwd;
	private String uname;

	
//	2. 생성자 : 기본 생성자
	public Register() {}  // ---> default생성자 만들기

	public Register(String email, String passwd, String uname) {
		this.email = email;
		this.passwd = passwd;
		this.uname = uname;
	}

	
//	3. getter, setter	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	
//	4. 메소드
	public String disp() {
		return "이메일 : "+getEmail()+", 비밀번호 : "+getPasswd()+", 이름 : "+getUname();
	}
}
