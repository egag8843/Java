package sub5;

public class MathTest {
	public static void main(String[] args) {
		
		System.out.println("PI : "+Math.PI);
		System.out.println("���밪: " + Math.abs(-5));
		System.out.println("���밪: " + Math.abs(-3.14));
		System.out.println("������: " + Math.sqrt(667));
		System.out.println("�ø���: " + Math.ceil(1.2));
		System.out.println("�ø���: " + Math.ceil(1.7));
		System.out.println("������: " + Math.floor(1.2));
		System.out.println("������: " + Math.floor(1.7));
		System.out.println("�ݿø�: " + Math.round(1.2));
		System.out.println("�ݿø�: " + Math.round(1.7));
		
		double n1 = Math.random();
		System.out.println("n1 : "+n1);
		
		double n2 = n1 * 10;
		System.out.println("n2 : "+n2);
		
		double n3 = Math.ceil(n2);
		System.out.println("n3 : "+n3);
		
		double n = Math.ceil(Math.random() *10);
		System.out.println("1~45 Random Int:"+n);
	}
}
