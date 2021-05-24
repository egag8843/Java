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
		 * final 변수 : 상수
		 * final 메서드 : 오버라이드 금지
		 * final 클래스 : 상속 금지
		 */
		final int NUM = 1;
		//num+=1;;
	}
}
