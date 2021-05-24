package sub1;

public class InheritanceTest {
	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("KB증권", "121-101-2010", "홍길동", 100000, "삼성전자", 10, 80000);
		kb.sell(5,79000);
		kb.buy(10, 81000);
		kb.show();
		
	}
}
