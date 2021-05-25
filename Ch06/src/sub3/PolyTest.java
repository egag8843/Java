package sub3;
/*
 * ������(Polymorphism)
 * - ��Ӱ��迡 �ִ� �θ�Ŭ������ ��ü���� ����� �ڽ�Ŭ���� �ٽ� ������.,
 * - �θ�Ŭ���� Ÿ������ ��ü ����.
 * - �������� �̿��� ���α׷��� �ڵ��� �������� ����.
 */
public class PolyTest {
public static void main(String[] args) {
	
	Animal tiger = new Tiger();
	Eagle eagle = new Eagle();
	Shark shark = new Shark();
	
	tiger.move();
	eagle.move();
	shark.move();
	
	tiger.hunt();
	eagle.hunt();
	shark.hunt();
	
	Animal t = new Tiger();
	Eagle e = new Eagle();
	Shark s = new Shark();
	
	Animal objects[]= {t,e,s};
	
	for(Animal obj : objects) {
		obj.move();
		obj.hunt();
	}
	
}
}
