package jdbcPrj05;

import java.sql.*;
import java.time.LocalDate;
import java.util.*;

public class MemberDao {
	Scanner sc = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DBConnect db = DBConnect.getInstance();
	
//	화면 메뉴
	int menu() {
		System.out.println("============== 코리아아이티아카데미 회원가입 프로그램 Ver1.0 ==============");
		System.out.println("1. 회원목록 | 2. 회원가입 | 3. 회원수정 | 4. 회원삭제 | 5. 회원검색 | 6. 종료");
		System.out.println("---------------------------------------------------------------");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		
		return choice;
	}
	
//	화면 목록
	List<Member> getMembers() throws ClassNotFoundException, SQLException {
//		DBConnect.getInstance().getConnection();
		System.out.println("---------------------------------------------------------------");
		System.out.println("                1. 코리아아이티 회원 목록 출력");
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		List<Member> list = new ArrayList<>(); // list.add(객체명)
		conn = db.getConnection(); // 연결 여부를 저장하고 있는 객체(Connection)
		
		String sql = "SELECT * FROM member ORDER BY id DESC;";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
//			컬럼내용
			Member m = new Member();
			
			m.setId(rs.getInt(1));
			m.setEmail(rs.getString(2));
			m.setPasswd(rs.getString(3));
			m.setName(rs.getString(4));
			m.setDepart(rs.getString(5));
			m.setPosition(rs.getString(6));
			m.setSalary(rs.getInt(7));
			m.setStartDate(rs.getString(8));
			m.setEndDate(rs.getString(9));
			
			list.add(m);
		}
		
		return list;
	}
	
//	회원가입
	int setMember() throws ClassNotFoundException, SQLException {
		conn = db.getConnection(); // Connection
		String sql = "INSERT INTO member VALUES(null, ?, ?, ?, ?, ?, ?, now(), ?);";
		
		Member m = new Member();
		m.setEmail("mail3@mail.com");
		m.setPasswd("11224212");
		m.setName("이영희");
		m.setDepart("총무과");
		m.setPosition("총무과장");
		m.setSalary(1100000);
		m.setEndDate(String.valueOf(LocalDate.now()));
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, m.getEmail());
		pstmt.setString(2, m.getPasswd());
		pstmt.setString(3, m.getName());
		pstmt.setString(4, m.getDepart());
		pstmt.setString(5, m.getPosition());
		pstmt.setInt(6, m.getSalary());
		pstmt.setString(7, m.getEndDate());
		
		int result = pstmt.executeUpdate();
		
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("                  2. 코리아아이티 회원가입 화면");
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		return result;
	}
	
//	회원수정
	int updateMember(int pk) {
		System.out.println("---------------------------------------------------------------");
		System.out.println("                  3. 코리아아이티 회원수정 화면");
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		return 0;
	}
	
//	회원삭제
	int deleteMember(int pk) throws ClassNotFoundException, SQLException {
		conn = db.getConnection();
		
		String sql = "DELETE FROM member WHERE id = ?;";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, pk);
		int result = pstmt.executeUpdate();
		
		return result;
	}
	
//	회원검색
//	pk검색
	Member searchMember(int searchId) throws ClassNotFoundException, SQLException {
		conn = db.getConnection();
		
		String sql = "SELECT * FROM member WHERE id = ?;";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, searchId);
		rs = pstmt.executeQuery();
		
		Member m = null;
		if(rs.next()) {
			m = new Member();
			m.setId(rs.getInt(1));
			m.setEmail(rs.getString(2));
			m.setPasswd(rs.getString(3));
			m.setName(rs.getString(4));
			m.setDepart(rs.getString(5));
			m.setPosition(rs.getString(6));
			m.setSalary(rs.getInt(7));
			m.setStartDate(rs.getString(8));
			m.setEndDate(rs.getString(9));
		}
		
		return m;
	}
//	종료
	void disconnect() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("                6. 코리아아이티 회원가입 프로그램 종료");
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		System.exit(0);
	}
}
