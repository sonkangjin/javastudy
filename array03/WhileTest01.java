package array03;

public class WhileTest01 {

	public static void main(String[] args) {
		int destination = 11271; // 11271���� �Ÿ��� �������� �ֽ��ϴ�.
		int speed = 3; // ����� �ڵ����� �ʴ� 3���͸� �޸��ϴ�.
		int car = 0;
		// ����� �ڵ����� �󸶸��� �������� �����ϴ��� �˾ƺ��ô�.
		int i = 1;
		while (destination != car) { // desticantion�� car�� ���� ������ ��� ����
			car = car + speed;
			i++;
		} // while���� �ѹ� ���� ���� 1�ʰ� ������ ���Դϴ�. 60�� ���� 1���� ��������?
		System.out.println(i + "��"); // 3758�� while���� �����߽��ϴ�. ������ ȯ���� ���ڽ��ϴ�.
		int min = i / 60;
		System.out.println(min + "��"); // 62���� �ɷȳ׿�. �ð����� ȯ���غ��ڽ��ϴ�.
		int hour = min / 60;
		System.out.println(hour + "�ð�"); // int�� �������̶� �Ҽ����� ������ �ʽ��ϴ�.

		double time = min;
		System.out.println(time / 60 + "�ð�"); // �Ҽ������� ����ص� ���ϴ� ���� ������ �ʽ��ϴ�.

		// �ڹٿ����� �������� ���ϴ� �����ڰ� �ֽ��ϴ�. �ٷ� % �Դϴ�.
		int real_min = min % 60;
		System.out.println(real_min + "��"); // ���� ���߽��ϴ�.
		// �׷� �Ʊ� ���ߴ� �ð� hour�� �̿��Ͽ� ����ϰ� ����� ���ڽ��ϴ�.

		System.out.println(hour + "�ð�" + real_min + "��"); // �ϼ��Դϴ�.

	}

}
