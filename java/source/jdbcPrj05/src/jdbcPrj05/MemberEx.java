package jdbcPrj05;

import java.sql.*;
import java.util.List;

public class MemberEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MemberDao dao = new MemberDao();
		
		boolean run = false;
		while(!run) {
			int choice = dao.menu();
			
			switch(choice) {
			case 1:
				List<Member> list = dao.getMembers();
//				if(list.size()==0)
				if(list.isEmpty()) {
					System.out.println("가입된 회원이 없습니다.");
				}else {
//					for(출력타입 변수 : 배열명) {
//						
//					}
					System.out.println("가입된 회원은 "+list.size()+"명 입니다.");
					for(Member mem : list) {
						System.out.println(mem.toString());
					}
				}
				break;
				
			case 2:
				int result = dao.setMember();
				if(result>0) {
					System.out.println("회원가입이 완료되었습니다.");
				}else {
					System.out.println("회원가입이 되지않았습니다.\n관리자에게 문의하세요.");
				}
				break;
				
			case 3:
				dao.updateMember(0);
				break;
				
			case 4:
				dao.deleteMember(0);
				break;
				
			case 5:
				dao.searchMember(0);
				break;
				
			default:
				dao.disconnect();
				break;
			}
		}
	}
}
