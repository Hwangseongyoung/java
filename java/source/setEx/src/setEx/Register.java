package setEx;

public class Register {
	private int id;
	private String userid;
	private String passwd;
	
	public Register(int id, String userid, String passwd) {
		this.id = id;
		this.userid = userid;
		this.passwd = passwd;
	}
	
	public int getId() {
		return id;
	}

	public void disp() {
		System.out.println("회원번호 : "+id+", 아이디 : "+userid+", 비밀번호 : "+passwd);
	}
	
}
