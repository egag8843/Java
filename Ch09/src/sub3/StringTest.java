package sub3;

public class StringTest {
	public static void main(String[] args) {
		String str = "Hello";
		char[] arr = {'H','e','l','l','o'};
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = "Hello";
		
		
		//���ڿ� ��
		if (str1 == str2) {
			System.out.printf("��");	
		} else {
			System.out.printf("����\n");
		}
			
		if (str3 == str4) {
			System.out.println("str3�� str4�� �������� ����");
		} else {
			System.out.println("str3�� str4�� �������� �ٸ���");
		}
		
		if (str.equals(str4)) {
			System.out.println("str1�� str4�� ���ڿ��� ���� ����");
		} else {
			System.out.println("str1�� str4�� ���ڿ��� ���� �ٸ���");
		}
	}
}
