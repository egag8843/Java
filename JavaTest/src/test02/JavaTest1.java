package test02;
/*
 * 날짜 : 2021/05/20
 * 이름 : 홍길동
 * 내용 : 배열 문자 출력하기 
 */
public class JavaTest1 {
	public static void main(String[] args) {
		char str[] = {'I',' ','L','O','V','E',' ','Y','O','U'};
		int row,col;
		
		for (row = 1; row<10; row++) {
			for(col = 0; col <= row; col++) {
				System.out.print(str[col]);
			}
			System.out.print("\n");
		}
	}
}
