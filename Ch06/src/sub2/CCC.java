package sub2;

public class CCC extends BBB{
	
	/*
	 * 부모클래스 BBB 메서드 1은 final 선언 이므로 오버라이드 불가.
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
