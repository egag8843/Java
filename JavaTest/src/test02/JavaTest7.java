package test02;
/*
 * 날짜 : 2021/05/20
 * 이름 : 홍길동
 * 내용 : 배열 최대공약수 출력하기 
 */
public class JavaTest7 {
	public static void main(String[] args) {
		
		System.out.println(" 1과 5의 최대공약수 : "+gcd(1,5));
		System.out.println(" 3과 6의 최대공약수 : "+gcd(3,6));
		System.out.println(" 12과 18의 최대공약수 : "+gcd(12,18));
		System.out.println(" 60과 24의 최대공약수 : "+gcd(60,24));
	}
	
	public static int gcd(int a, int b) {
		int temp = 0;
		if (a < b) {
			temp = a;
		}else {
			temp = b;
		}
		while (true) {
			if (a % temp == 0 && b % temp == 0) {
				break;
			}
			temp--;
		}
		return temp;
	}
}
