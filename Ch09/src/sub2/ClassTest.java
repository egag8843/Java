package sub2;

import sub1.Apple;

public class ClassTest {
	public static void main(String[] args) {
		//class class : ��ü ���� ���� Ŭ����
		
		Apple a = new Apple("�ѱ�",3000);
		a.toString();
		
		//������ü
		
		try {
			Class c = Class.forName("sub1.Apple");// Static Method
			Apple apple = (Apple)c.newInstance();
			
			apple.toString();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
