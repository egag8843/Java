package book_Ch05;

import java.util.Scanner;

public class P88 {
	public static void main(String[] args) {
		
		System.out.println("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		String grade = "";
		switch (score /10) {
		case 9 :
			grade = "A";
			break;
		case 8 :
			grade = "B";
			break;
		case 7 :
			grade = "C";
			break;
		case 6:
			grade = "D";
		break;
	
		}
		System.out.println("학점:" +grade);
	}
}
