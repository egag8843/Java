package sub2;

public class OverrideTest {
	public static void main(String[] args) {
		
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method2(100);
		c.method3(0);
		c.method3(200);
		
		/*
		 * final ���� : ���
		 * final �޼��� : �������̵� ����
		 * final Ŭ���� : ��� ����
		 */
		final int NUM = 1;
		//num+=1;;
	}
}
