package sub2;

public class CCC extends BBB{
	
	/*
	 * �θ�Ŭ���� BBB �޼��� 1�� final ���� �̹Ƿ� �������̵� �Ұ�.
	 */
	@Override
	public void method1() {
		System.out.println("CCC - method1...");
	}
	
	public void method2(int i) {
		System.out.println("CCC - method2...");
	}
	
	@Override
	public void method3(int a) {
		System.out.println("CCC - method3...");
	}
}
