package mapEx;

public class MemberEx {
	public static void main(String[] args) {
//		Map : 순서가 없고 key로 접근이 가능(반복문x), 배열명.put()
//		= json
		
//		순서 배열명.get(i), 배열명.add()
//		List : 줄 + Member 칸 =>
//		홍길동, 1234 => List<Member>
//		홍길동, 1234 => List<Member>
//		홍길동, 1234 => List<Member>
		
		MemberDao dao = new MemberDao();
		
		dao.putMember("u1", new Member("홍길동", "1234"));
		dao.putMember("u2", new Member("김철수", "0000"));
		dao.putMember("u3", new Member("이영희", "7777"));
		
		dao.showInfo();
		
		boolean result = dao.deleteMember("u1");
		if(result) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("존재하지 않는 key입니다.");
		}
		
		dao.showInfo();
	}
}
