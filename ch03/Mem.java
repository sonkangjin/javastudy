package ch03;

public class Mem {

	int num = 10;// ��������

	static String name = "ȫ�浿";

	void test() {
		int num = 5;// ��������
	}

	public static void main(String[] args) {
		int sum = 100;
		System.out.println(sum);
		Mem m = new Mem();
		m.test();
		System.out.println("��ȣ : " + m.num);
		System.out.println(1);
		System.out.println(2);
		System.out.println("���α׷� ����");

	}

}
