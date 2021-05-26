package sub3;

public class StringMemberTest {
	public static void main(String[] args) {
		
		String str = "Hello Korea";
		//length - ���� ����
		System.out.println("length of str: "+str.length());
		//charAt - Ư�� ���� ����
		System.out.println("1st char of str: "+str.charAt(0));
		System.out.println("7rd char of str: "+str.charAt(7));
		//substring
		System.out.println("0~5 char of str: "+str.substring(0,5));
		System.out.println("6~end char of str: "+str.substring(6));
		//indexOf,lastIndexOf - Ư������ �ε��� ����
		System.out.println("e���� �� �ε���"+str.indexOf("e"));
		System.out.println("e���� �� �ε���"+str.lastIndexOf("e"));
		//replace - ���ڿ� ��ü
		System.out.println("str ���ڿ����� 'Korea'���ڸ� 'Busan'���� ��ü:"+
				str.replace("Korea","Busan"));
		System.out.println("str ���ڿ����� 'Korea'���ڸ� 'Busan'���� ��ü:"+
				str.replace("Hello","Welcome"));
		//valueOf - �⺻Ÿ�� ������ ���ڿ��� ��ȯ
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
	}
}
