package test01;
/*
 * 
 * ��¥ : 2021/05/220
 * �̸� : �����
 * ���� : �ڹ� ������ ��������
 */
public class JavaTest5 {
	public static void main(String[] args) {
		int num = 0;
		int result;
		
		result = num++;
		System.out.println("result : "+result);
		
		result = ++num;
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
	}
}
