package sub1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ��¥ : 2021/05/27
 * �̸� : ��ö��
 * ���� : �ڹ� ���� ����� ��Ʈ�� �ǽ� 
 */
public class BufferFileIOTest {
	public static void main(String[] args) {
	
		String path1 = "C:\\Users\\bigdata.DESKTOP-61ML0B4\\Desktop\\sample.jpg";
		String path2 = "C:\\Users\\bigdata.DESKTOP-61ML0B4\\Desktop\\sample2.jpg";
		
		// ���ϰ� �Է½�Ʈ�� ����
		try {
			// ���۽�Ʈ�� ����
			BufferedInputStream  bis = new BufferedInputStream(new FileInputStream(path1));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path2));
			
			int value = 0;
			
			while(true) {
				
				// ��Ʈ������ ���� ������ �б�
				value = bis.read();
				
				if(value == -1) {
					// �� �̻� ���� �����Ͱ� ������ ����
					break;
				}
				
				//char ch = (char)value;
				//System.out.print(ch);
				bos.write(value);
				
			}// while end
			
			// ��Ʈ�� ����
			bis.close();
			bos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����...");
	}// main end
}







