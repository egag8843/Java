package sub1;

import java.util.Scanner;

public class IfTest {

	
	public static void main(String[] args) {
		int n1 = 1, n2 = 2;
		if (n1<n2) {
			System.out.println("n1�� n2���� �۴�.");
		}
		
		if (n1>0) {
			if (n2>1) {
				System.out.println("n1�� 0���� ũ�� n2�� 1���� ũ��.");
			}
		}
		if (n1>0 && n2 >1) {
			System.out.println("n1�� 0���� ũ�� n2�� 1���� ũ��.");
		}
		
		int var1 =1 , var2 =2;
		if (var1>var2) {
			System.out.println("var1�� var2���� ũ��");
		}else {
			System.out.println("var1�� var2���� �۴�");
		}
		
		int a1=1, a2=2, a3=3 , a4=4;
		if (a1 > a2) {
			System.out.println("a1�� a2���� ũ��");
		}else if (a2 > a3) {
			System.out.println("a2�� a3���� ũ��");
		}else if (a3 > a4) {
			System.out.println("a3�� a4���� ũ��");
		}else {
			System.out.println("a4�� ���� ũ��");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int score = scan.nextInt();
		
		System.out.println("�Է� ���� : "+score);
		
		if (score >= 90 && score <= 100) {
			System.out.println("A");
		}else if (score >= 80 && score <=89) {
			System.out.println("B");

		}else if (score >=70 && score <= 79) {
			System.out.println("C");

		}else if (score >= 60 && score <=69) {
			System.out.println("D");
		}else if (score <= 59) {
			System.out.println("f");

		}
	}
}
