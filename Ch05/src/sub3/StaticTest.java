package sub3;

public class StaticTest {
	public static void main(String[] args) {
		
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		/*������������ ��ü �������� �ٷ� ���� ����.
		 * */
		Increment.num2 += 3;
		Increment.add();
		
		//�̱��� ��ü
		Calc c = new Calc();
		int n1 = c.plus(1, 2);
		int n2 = c.minus(124, 122);
		int n3 = c.div(1241231, 115);
		int n4 = c.multi(1241, 123);
		
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		System.out.println("n3 : "+n3);
		System.out.println("n4 : "+n4);
		
	}
}
