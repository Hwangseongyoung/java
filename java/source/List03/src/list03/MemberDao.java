package list03;

import java.util.*;

public class MemberDao {
//	생성잘르 통해서 List 생성, 저장 메소드, 삭제 메소드, 출력 메소드
	
	List<Member> list = null;
	
	public MemberDao() {
		list = new ArrayList<Member>();
	}
	
	public void addMember(Member mem) {
		list.add(mem);
	}
	
	public void deleteMember(String id) {
		for(int i=0;i<list.size();i++) {
			
			String tmp = list.get(i).getUserid();
			
			if(id.equals(tmp)) {
				list.remove(i);
				System.out.println("선택한 회원을 삭제하였습니다.");
			}
		}
	}
	
	public void showInfo() {
//		System.out.println(list.size());
//		for(출력타입 별명 : 배열) {
//			출력코드(별명);
//		}
//		for(Member m : list) {
//			m.disp();
//			System.out.println("--------------------------");
//		}
		
		for(int i=0;i<list.size();i++) {
//			배열명.get(i).disp();
			list.get(i).disp();
			System.out.println("--------------------------");
		}
	}
}
