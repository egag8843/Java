package sub1;

public class Banana {
	private String country;
	private int price;
	
	public Banana() {
		this.price=2000;
		this.country = "���ѹα�";
	}
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("�ٳ��� ����: "+country);
		System.out.println("�ٳ��� ����:"+price);
		return super.toString();
	}
}
