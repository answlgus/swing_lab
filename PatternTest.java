package site.metacoding.practice;
//��� ���� : �Ⱦ��� �޼��� �ɷ�����

interface Knife {
	void attack();
	void cook();
}

abstract class �丮������{ //�߻�Ŭ������ �߻�޼��� ���� �� �ʿ� ����
	
	public void attack() {}
}
abstract class �ο��{
	
	public void cook() {}
} 

class ������ implements Knife{

	@Override
	public void attack() {
		//������
		
	}

	@Override
	public void cook() {
	 System.out.println("�丮");
		
	}
	
}

class ������ extends �ο�� {
	
	public void attack() {}
}

public class PatternTest {

}
