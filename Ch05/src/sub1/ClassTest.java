package sub1;

public class ClassTest {
	public static void main(String[] args) {
		
		Account kb = new Account("��������","123-12313-1234","������",10000);
		Account wr = new Account("�츮����","121-1010-1021","������",30000);
		

		kb.deposit(40000);
		kb.withdraw(5000);
		//kb.money++; //����ڵ�
		kb.show();
		
		
		
		wr.deposit(30000);
		wr.withdraw(7000);
		wr.show();
		
		
	}
}
