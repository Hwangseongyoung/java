package inherEx00;

public class AutoEx {
	public static void main(String[] args) {
		HyundaiEx h = new HyundaiEx();
		h.start();
		h.model = "소나타";
		h.color = "Silver";
		System.out.println(h.model+", "+h.color);
		h.stop();
		
		System.out.println("-----------------------------");
		
		KiaEx k = new KiaEx();
		k.start();
		k.model = "k5";
		k.color = "Black";
		System.out.println(k.model+", "+k.color);
		k.stop();
	}
}
