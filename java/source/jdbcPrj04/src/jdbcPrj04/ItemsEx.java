package jdbcPrj04;

import java.sql.*;

class ItemCrud {
	void selectItem() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		String id = "root";
		String pwd = "1234";
		
		conn = DriverManager.getConnection(url, id, pwd);
		String sql = "SELECT * FROM items ORDER BY item_id DESC;";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) { // 디비 -> 객체 -> 화면 출력
			Items item = new Items(); // Items.java 3개  --> 초기화를 계속 진행하여 각각의 객체생성
			
			item.setItemId(rs.getInt(1));
			item.setItemName(rs.getString(2));
			item.setItemPrice(rs.getInt(3));
			item.setItemStock(rs.getInt(4));
			item.setItemDate(rs.getString(5));
			
			System.out.println(item.toString());
		}
	}
	
	
	
	void insertItem() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String id = "root";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, id, pwd);
			
			String sql = "INSERT INTO items VALUES(null, ?, ?, ?, now());";
			pstmt = conn.prepareStatement(sql);
			
			Items item = new Items(); // 임시로 값을 객체 저장
			item.setItemName("한돈");
			item.setItemPrice(100000);
			item.setItemStock(10);
			
			pstmt.setString(1, item.getItemName()); // 실제 디비 저장
			pstmt.setInt(2, item.getItemPrice());
			pstmt.setInt(3, item.getItemStock());
			int row = pstmt.executeUpdate();
			
			if(row>0) {
				System.out.println("'"+item.getItemName()+"'상품 등록이 완료되었습니다.");
			}else {
				System.out.println("상품 등록에 실패하였습니다.\n확인하세요.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class ItemsEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ItemCrud crud = new ItemCrud();
//		crud.insertItem();
		crud.selectItem();
	}
}
