package test02;

import java.util.Scanner;

/*
 * ��¥ : 2021/05/20
 * �̸� : ȫ�浿
 * ���� : �Լ� ��������
 */
public class JavaTest6 {
	public static void main(String[] args) {
		intro();
		
		int a = input("a");
		int b = input("b");
		
		int output = add(a, b);
		result(output);
	}
	
	public static void intro() {
		System.out.println("****** START ******");
		System.out.println("�� ���� ���� �Է�");
	}
	public static int input(String name) {
		System.out.println("����" +name+"�� �Է� : ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
	
	public static void result(int val) {
		System.out.println("���� ���: "+val);
		System.out.println("****** END ******");
	}
	public static int add(int x, int y) {
		return x+y;
	}
}
