package setEx;

public class SetEx04 {
	public static void main(String[] args) {
		 RegisterDao dao = new RegisterDao();
		 dao.addRegister(new Register(101, "홍길동", "1111"));
		 dao.addRegister(new Register(102, "김철수", "2222"));
		 dao.addRegister(new Register(103, "이영희", "3333"));
		 
		 dao.showInfo();
		 
		 System.out.println("---------------------------------------");
		 
		 boolean result = dao.deleteRegister(102);
		 if(result) {
			 System.out.println("삭제되었습니다.");
		 }else {
			 System.out.println("존재하지 않는 회원번호입니다.");
		 }
		 dao.showInfo();
	}
}
