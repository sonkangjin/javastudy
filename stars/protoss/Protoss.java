package stars.protoss;

import stars.Behavior;

public abstract class Protoss implements Behavior {
	public void move() {
		System.out.println("�̵�");
	}

	public void repair() {
		System.out.println("���� ġ��");
	}

	// abstract public void attack();

	public static void upgrade() {
		Zealot.attack++;
		Dragoon.attack++;
		System.out.println("�����佺 ���׷��̵� �Ϸ�");
	}
}
