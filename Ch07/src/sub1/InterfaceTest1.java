package sub1;

public class InterfaceTest1 {
	public static void main(String[] args) {
		//interface : Ŭ���� ������ ǥ�� ���̵� ����
		
		RemoteControl lg = new RemoteLG();
		RemoteControl ss = new RemoteSamsung();
		
		lg.powerOn();
		lg.chUp();
		lg.chDown();
		lg.powerOff();
		
		ss.powerOn();
		ss.chDown();
		ss.chUp();
		ss.powerOff();
	}
}
