package mapEx;

import java.util.*;

public class MemberDao {
	Map<String, Member> map = null;
	
	public MemberDao() {
		map = new HashMap<>();
	}
	
	public void putMember(String id, Member m) {
		map.put(id, m);
	}
	
	public boolean deleteMember(String uid) {
//		Map -> loop 사용X
//		true, false
		if(map.containsKey(uid)) {
			map.remove(uid);
			return true;
		}
		return false;
	}
	
	public void showInfo() {
//		배열명.forEach((key, value) -> {
//			출력코드 = 배열명.get(키값)
//		});
		map.forEach((k, v) -> {
			Member mem = map.get(k);
			mem.disp();
		});
	}
}
