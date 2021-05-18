package sub2;

import java.util.Iterator;

public class ForTest {
	public static void main(String[] args) {
		int sum =0;
		//for
		
		for(int i = 1; i<=3 ; i++){
			System.out.printf("%d.hello java!\n",i);
		}
		//1 ~10 plus
		for(int i = 1; i<=10; i++) {
			sum += i;
		}
		System.out.println("sum :"+sum);
		// Â¦¼öÇÕ
		int sum2 = 0;
		for (int i =1; i<=10; i++) {
			if(i%2==0) {
				sum2+=i;
				
			}
		}
		System.out.println("Â¦¼öÇÕ:"+sum2);
		
		
		//ÁßÃ¸ for
		
		//±¸±¸´Ü
		
		for(int x=2; x<=9; x++) {
			System.out.printf("------%d´Ü-----\n",x);
			for (int y=1; y<=9;y++) {
				
				System.out.printf("%d x %d = %d\n",x,y,x*y);
				}
			
			}
		
		// º°»ï°¢Çü1
		
		for (int i=0; i<5; i++) {
			for(int j=0; j<=i; j++ ) {
				System.out.print("¡Ù");
			}
			System.out.print("\n");
		}
		// º°»ï°¢Çü2
		for(int i = 1; i<=5; i++) {
			for (int j=1; j<=5-i; j++) {
				System.out.print("¡Ú");
			}
			for (int x=1; x<=i; x++) {
				System.out.print("¡Ù");
			}
			System.out.println("");
		}
	}
}
