package setEx;

import java.util.*;

public class RegisterDao {
	Set<Register> set = null;
	
	public RegisterDao() {
	set = new HashSet<>();
	}
	
	public void addRegister(Register r) {
		set.add(r);
	}
	
	public boolean deleteRegister(int id) {
//		삭제되면 true, 아니면 false
		Iterator<Register> ir = set.iterator();
		while(ir.hasNext()) {
			int tmp = ir.next().getId();
			if(tmp==id) {
				ir.remove();
				return true;
			}
		}
		return false;
	}
	
	public void showInfo() {
		for(Register reg : set) {
			reg.disp();
		}
	}
}
