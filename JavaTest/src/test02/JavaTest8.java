package test02;
/*
 * ��¥ : 2021/05/20
 * �̸� : ȫ�浿
 * ���� : �迭 ���丮�� ����ϱ� 
 */
public class JavaTest8 {
	public static void main(String[] args) {
		int rs1 = fac(3);
		int rs2 = fac(4);
		long rs3 = fac(30);
		
		System.out.println("3! = "+rs1);
		System.out.println("4! = "+rs2);
		System.out.println("55! = "+rs3);
	}
	
	public static int fac(int n) {
		if(n <=1 )
			return 1;
		
		return n * fac(n-1);
	}
}
