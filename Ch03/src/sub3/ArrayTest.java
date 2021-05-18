package sub3;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		
		//배열 길이
		System.out.println("배열 nums의 원소 갯수 : "+nums.length);
		
		
		//원소 출력
		for(int i : nums) {
			System.out.println("배열 nums의 원소 :" +i);
		}
		
		String[] people = {"김유신","김춘추","장보고","강감찬","이순신"};
		
		for(String person: people) {
			System.out.println(person);
		}
	}
}
