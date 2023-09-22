package list02;

import java.util.*;

public class MemberDao {
	List<Member> list = null;
	
	public MemberDao() {
		list = new ArrayList<>();	
	}
	
	public void addMember(Member m) {
		list.add(m);
	}
	
	public void showMember() { // 상세보기
		for(Member mem : list) {
			System.out.println(mem);
			System.out.println("-------------------------------------");
		}
	}
	
	public void deleteMember(int id) {
//		저장 자료 -> memberId == id -> 배열.remove(배열번호)
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getMemberID() == id) { // 0,1,2
				list.remove(i);
				System.out.println(id+" 회원번호를 삭제하였습니다.");
			}
		}
//		System.out.println(id+"는 존재하지 않는 회원번호입니다.");
		System.out.println();
	}
	
	public void findById(int searchID) {
		for(int i=0;i<list.size();i++) {
			int tmpID = list.get(i).getMemberID();
			if(tmpID == searchID) {
				Member m = list.get(i);
				
				System.out.println("검색된 회원을 출력합니다.");
				System.out.println("==========================");
//				System.out.println("회원아이디 : "+m.getMemberID()+" || 회원이름 : "+m.getMemberName());
				System.out.println(m.toString());
				System.out.println("==========================");
			}
		}
	}
}
