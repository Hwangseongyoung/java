package jdbcPrj03;

import java.sql.*;

// 동작을 별도 클래스 작업
class DBDao {
	void insertDB() throws ClassNotFoundException, SQLException { // i/o
//		**준비 단계**
//		1. 연결 - Connection 객체
		Connection conn = null;
//		2. 쿼리실행 : insert, update, delete, select 동작  --> Statement
		Statement stmt = null; // 연결객체.state
//		(3. 결과 출력 : ResultSet) --> 상황에 따라 생략가능
		
//		**접속 단계**
//		Class.forName();
		Class.forName("com.mysql.cj.jdbc.Driver");
//		접속 정보
		String url = "jdbc:mysql://localhost:3306/grp";
		String id = "root";
		String pwd = "1234";
		
		conn = DriverManager.getConnection(url, id, pwd);
//		쿼리 실행
		stmt = conn.createStatement(); // 쿼리 실행하기 위한 사전 작업
		String sql = "insert into member values(null, '부산아이티', now(), now());";
		stmt.execute(sql);
//		Comment 출력
		System.out.println("Insert Completed...");
	}
}

public class JDBCPrj03Ex {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DBDao db = new DBDao();
		db.insertDB();
	}
}
