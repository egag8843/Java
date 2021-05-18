package sub1;

import java.util.Scanner;

public class IfTest {

	
	public static void main(String[] args) {
		int n1 = 1, n2 = 2;
		if (n1<n2) {
			System.out.println("n1은 n2보다 작다.");
		}
		
		if (n1>0) {
			if (n2>1) {
				System.out.println("n1은 0보다 크고 n2는 1보다 크다.");
			}
		}
		if (n1>0 && n2 >1) {
			System.out.println("n1은 0보다 크고 n2는 1보다 크다.");
		}
		
		int var1 =1 , var2 =2;
		if (var1>var2) {
			System.out.println("var1이 var2보다 크다");
		}else {
			System.out.println("var1이 var2보다 작다");
		}
		
		int a1=1, a2=2, a3=3 , a4=4;
		if (a1 > a2) {
			System.out.println("a1이 a2보다 크다");
		}else if (a2 > a3) {
			System.out.println("a2가 a3보다 크다");
		}else if (a3 > a4) {
			System.out.println("a3이 a4보다 크다");
		}else {
			System.out.println("a4가 가장 크다");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수입력 : ");
		int score = scan.nextInt();
		
		System.out.println("입력 점수 : "+score);
		
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
