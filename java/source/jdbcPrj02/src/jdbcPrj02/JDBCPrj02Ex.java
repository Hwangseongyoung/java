package jdbcPrj02;

import java.sql.*;

public class JDBCPrj02Ex {
	public static void main(String[] args) {
		JDBCPrj02Ex jdbc = new JDBCPrj02Ex();
		jdbc.insertDB();
	}
	public void insertDB() {
		try {
//			데이터베이스 연결 성공 시..
//			1. Class.forName();
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2. 연결 객체
//			DriverManager.getConnection(url, id, pwd);
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pwd = "1234";
			
//			정상적으로 연결 된다면 Connection 객체로 받아주기
			Connection conn = DriverManager.getConnection(url, id, pwd);
//			conn : 데이터베이스에 연결되었으니까...
			String sql = "insert into register values(102, '이영희', '7777')";
			
//			위 변수에 저장된 쿼리를 실행하는 createStatement() 객체 사용
			java.sql.Statement stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("회원가입이 완료 되었습니다.");
			
//			3. createStatement("INSERT INTO ..."); 
			
//			4. execute();
		}catch(Exception e) {
			System.out.println("데이터베이스 접속 실패..");
		}
	}
}
