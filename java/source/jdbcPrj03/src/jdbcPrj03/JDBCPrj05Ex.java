package jdbcPrj03;

import java.sql.*;

class UpdateDao {
	void updateDB() {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/grp";
			String id = "root";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, id, pwd);
			
			String sql = "UPDATE member SET com_name = '광주아이티' WHERE com_id = 2";
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("회원 정보가 수정 되었습니다.");
			}else {
				System.out.println("관리자에게 문의하세요.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("연결 실패");
		}
	}
}


class DeleteDao {
	void deleteDB() {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/grp";
			String id = "root";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, id, pwd);
			String sql = "DELETE FROM member WHERE com_id = 5";
			
			stmt = conn.createStatement();
			int row = stmt.executeUpdate(sql);
			
			if(row>0) {
				System.out.println("회원 정보가 삭제되었습니다.");
			}else {
				System.out.println("삭제할 수 없습니다.\n관리자에게 문의하세요.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("관리자에게 문의하세요.");
		}
	}
}
public class JDBCPrj05Ex {
	public static void main(String[] args) {
//		UpdateDao dao = new UpdateDao();
//		dao.updateDB();
		
		DeleteDao del = new DeleteDao();
		del.deleteDB();
	}
}
