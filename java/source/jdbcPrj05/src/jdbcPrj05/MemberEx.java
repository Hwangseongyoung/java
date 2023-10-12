package jdbcPrj05;

import java.sql.SQLException;
import java.util.*;

public class MemberEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MemberDao dao = new MemberDao();
		Scanner sc = new Scanner(System.in);
		
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
				System.out.println("---------------------------------------------------------------");
				System.out.println("                  4. 코리아아이티 회원삭제 화면");
				System.out.println("---------------------------------------------------------------");
				System.out.println();
				System.out.print("삭제할 번호 입력 >> ");
				int id = sc.nextInt();
				
				int delNum = dao.deleteMember(id);
				if(delNum>0) {
					System.out.println("회원정보가 삭제되었습니다.\n회원목록을 확인하세요.");
				}else {
					System.out.println("회원정보가 삭제되지 않았습니다.\n관리자에게 문의하세요.");
				}
				break;
				
			case 5:
				System.out.println("---------------------------------------------------------------");
				System.out.println("                  5. 코리아아이티 회원검색 화면");
				System.out.println("---------------------------------------------------------------");
				System.out.println();
				System.out.print("검색할 번호 입력 >> ");
				int searchId = sc.nextInt();
				
				Member m = dao.searchMember(searchId);
				if(m==null) {
					System.out.println("검색된 회원이 없습니다.");
				}else {
					System.out.println(searchId+"(으)로 검색된 회원정보입니다.");
					System.out.println(m.toString());
				}
				System.out.println();
				break;
				
			default:
				dao.disconnect();
				break;
			}
		}
	}
}
