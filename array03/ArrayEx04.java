package array03;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 1���� 100������ �� �߿��� 3�� ����� ���� ���Ͻÿ�.
		int sum = 0;
		for (int i = 3; i < 101; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.err.println(sum);

	}

}
