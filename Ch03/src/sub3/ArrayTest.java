package sub3;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		
		//�迭 ����
		System.out.println("�迭 nums�� ���� ���� : "+nums.length);
		
		
		//���� ���
		for(int i : nums) {
			System.out.println("�迭 nums�� ���� :" +i);
		}
		
		String[] people = {"������","������","�庸��","������","�̼���"};
		
		for(String person: people) {
			System.out.println(person);
		}
	}
}
