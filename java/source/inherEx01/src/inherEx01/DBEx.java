package inherEx01;

interface QueryEx {
//	입력
	void Insert();
	
//	수정
	void update();
	
//	삭제
	void delete();
	
//	출력
	void select();
}

class Mysql implements QueryEx {
	@Override
	public void Insert() {
		System.out.println("Mysql 데이터베이스를 이용해 회원가입합니다.");
	}

	@Override
	public void update() {}

	@Override
	public void delete() {}

	@Override
	public void select() {}
}

class Oracle implements QueryEx {
	@Override
	public void Insert() {}

	@Override
	public void update() {}

	@Override
	public void delete() {}

	@Override
	public void select() {
		System.out.println("Oracle 데이터베이스로 검색합니다.");
	}
}

public class DBEx {
	public static void main(String[] args) {
		Mysql m = new Mysql();
		m.Insert();
		
		System.out.println("--------------------------------");
		
		Oracle o = new Oracle();
		o.select();
	}
}
