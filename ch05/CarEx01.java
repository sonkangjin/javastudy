package ch05;

class Car {
	void run() {
		System.out.println("�ٽ� Ÿ�� �������� �ڵ������ε���");
	}
}

class Sonata extends Car {
	// �θ���� ��ȿȭ
	void run() {
		super.run();// �θ𲨸� �ٽ� �� �����ȿ��� �ҷ��� ��
		System.out.println(" �Ÿ���� ������");
	}
}

public class CarEx01 {

	public static void main(String[] args) {
		Car s1 = new Sonata();
		s1.run();
	}

}
