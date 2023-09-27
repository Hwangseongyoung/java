package inherEx01;

public class InherEx03 {
	public static void main(String[] args) {
//		interface, abstract -> 객체 생성해서 사용X(new X)
//		본체({}X)
		
		Std s = new Std();
		s.eat();
		s.study();
		s.stdID = "A200100001";
		s.name = "홍길동";
		s.age = 20;
		s.eat();
		s.sleep();
		
		System.out.println("------------------------------");
		
		Emp e = new Emp();
		e.eat();
		e.work();
		e.empID = "100300001";
		e.name = "나출근";
		e.age = 30;
		e.eat();
		e.sleep();
	}
}
