package ch03;

class Data {
	int num = 10;
}

public class MethodEX02 {
	// �������� ( ���ؾȿ� ������ �� ��������

	static int ����(int num) {
		num++;
		System.out.println(num);
		return num; // void ����� �����ϸ� ���� ����!
	}

	static void ����(Data d) {
		d.num--;
		System.out.println(d.num);
	}

	public static void main(String[] args) {
		// value passing
		int myNum = 100;
		myNum = ����(myNum);// �ٽ� ���̳����� �޾���
		System.out.println(myNum);

		// reference passing
		Data d = new Data();//Ŭ������ �� �ϸ� ������ƽ �ƴѰ� �޸𸮿� �� ��
		����(d);// �� �������� �����ϴ� ���̱⿡ ��ȯ�� �� �״��
		System.out.println(d.num);

	}

}
