package sub1;

public class Apple {
	
	private String country;
	private int price;
	
	public Apple() {
		this.price=2000;
		this.country = "���ѹα�";
	}
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("��� ����: "+country);
		System.out.println("��� ����:"+price);
		return super.toString();
	}
}
