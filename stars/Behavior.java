package stars;

//�߻�Ŭ������ ����
//�߻� �޼��常 ���簡�� , �������ε��� ��� �θ� ���
public interface Behavior {
	public abstract void move();

	void repair();

	void attack(Behavior unit);

}
