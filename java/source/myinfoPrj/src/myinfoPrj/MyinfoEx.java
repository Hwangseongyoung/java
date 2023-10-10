package myinfoPrj;

import java.sql.*;

class Myinfo {
//	필드
	private String userid;
	private String passwd;
	private int age;
	
//	생성자
	public Myinfo() {}
	
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
		return "Myinfo [userid=" + userid + ", passwd=" + passwd + ", age=" + age + "]";
	}
	
	
}

class InsertDB {
	void selectQuery() throws ClassNotFoundException, SQLException {
//		연결, 쿼리실행, 결과출력
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String id = "root";
		String pwd = "1234";
		
//		접속에 필요한 드라이버
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, id, pwd);
		
		String query = "SELECT * FROM myinfo ORDER BY userid ASC";
		pstmt = conn.prepareStatement(query); // 실행준비
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Myinfo m = new Myinfo();
			m.setUserid(rs.getString(1));
			m.setPasswd(rs.getString(2));
			m.setAge(rs.getInt(3));
			
			System.out.println(m.toString());
			
//			System.out.println("아이디 : "+rs.getString(1)+", 비밀번호 : "+rs.getString(2)+", 나이 : "+rs.getInt(3));
		}
	}
	
	
	
	void insertQuery() {
//		연결(Connection), SQL실행(PreparedStatement), (결과출력 - 생략가능)
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pwd = "1234";
			
//			접속에 필요한 드라이버
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pwd);
			
			String sql = "INSERT INTO myinfo VALUES(?, ?, ?);";
			pstmt = conn.prepareStatement(sql);
			Myinfo my = new Myinfo();
			my.setUserid("seoulit");
			my.setPasswd("5678");
			my.setAge(10);
			
//			pstmt.setString(1, "koreait");
//			pstmt.setString(2, "1234");
//			pstmt.setInt(3, 20);
			pstmt.setString(1, my.getUserid());
			pstmt.setString(2, my.getPasswd());
			pstmt.setInt(3, my.getAge());
			int row = pstmt.executeUpdate();
			
			if(row>0) {
				System.out.println(my.getUserid() + "님 회원가입이 완료되었습니다.");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class MyinfoEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		InsertDB db = new InsertDB();
//		db.insertQuery();
		db.selectQuery();
	}
}
