package site.metacoding.practice;

/**
 * 
 * @author User A
 * ������ ���� ����
 * initObject 1�� ����
 * initSetting 2�� ����
 * initListener 3�� ����(default)
 *
 */

public interface Init {
	
	void initObject(); //������
	void initSetting(); //������
	default void initListener() {}; //default�� ������ ��ü�� �ִ� �޼��带 ���� �� �ִ�. override �� �ʿ� ����
	
}
