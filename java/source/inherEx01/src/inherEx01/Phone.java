package inherEx01;

public class Phone {
	String model;
	String color;
	
	public Phone() {}
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void disp() {
		System.out.println("모델 : "+model+", 색상 : "+color);
	}
}
