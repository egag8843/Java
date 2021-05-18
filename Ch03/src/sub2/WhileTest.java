package sub2;

public class WhileTest {
	public static void main(String[] args) {
		
		int k =1;
		int sum =0;
		
		while(k <= 10) {
			sum+=k;
			k++;
		}
		System.out.println("1~10까지의 합:"+sum);
		
		int total = 0;
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 1) {
				continue;
			}
			total += i;
		}
		System.out.println("1부터 10까지 짝수합 :"+total);

	}
}
