package ch02;

class ���� {
	String name = "����";
	String color = "���";
	int speed = 100;
	char gender = '��';

}

public class VarEx05 {
	static int num = 10; // �������� ���ڸ����� �������� static����

	public static void main(String[] args) {
		System.out.println("���� ���� �غ�");
		System.out.println(VarEx05.num);

		���� a = new ����();// ���� Ŭ������ static ���� ������ heap�� ��
		System.out.println(a.name);
		System.out.println(a.color);
		System.out.println(a.gender);
		System.out.println(a.speed); 
		// ���μ����� ����Ǹ� �� ���ư�~
		

	}

}
