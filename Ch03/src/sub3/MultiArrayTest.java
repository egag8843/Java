package sub3;

public class MultiArrayTest {
	//1�����迭
	public static void main(String[] args) {
	
		int[] scores = {80,60,78,62,92};
		int sum = 0;
		
		for(int i : scores) {
		 sum+=i;	
		}
		System.out.println(sum);
	
	//2�����迭
	int[][] arr2d = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	
	for(int a=0;a<3;a++) {
		for (int b=0;b<4;b++) {
			System.out.println("�迭 arr2d["+a+"]["+b+"]="+arr2d[a][b]);
			}
		}
	//3���� �迭
	int[][][] arr3d = {{{1,2,3},{4,5,6},{7,8,9}}
						,{{10,11,12},{13,14,15},{16,17,18}}
						,{{19,20,21},{22,23,24},{24,25,26}}};
	
	}
}
