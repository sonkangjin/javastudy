package array03;

public class GuessNum {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		try {
			for (int i = 0; i < 4; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (Exception e) {// ������ ó���ϴ°� !
			System.out.println("�迭�� ũ�⸦ �Ѿ���ϴ�");
		}

	}

}
