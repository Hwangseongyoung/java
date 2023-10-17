package lamda;

// disp()
interface MyLamda {
	void disp();
}

// 람다식으로 화면 출력(syso)
public class LamdaEx {
	public static void main(String[] args) {
//		화살표 함수 뒤에 중괄호는 출력 내용이 한줄일 때는 생략이 가능
//		MyLamda m = () -> {작업내용};
		MyLamda m = () -> {
			System.out.println("Koreait Academy");
		};
		m.disp();
		System.out.println("----------------");
			
		MyLamda m2 = () -> System.out.println("코리아아이티 아카데미");
		m2.disp();
		System.out.println("----------------");
		
		MyLamda m3 = () -> {
			String str = "코리아아티이 아카데미2";
			System.out.println(str);
		};
		m3.disp();
	}
}
