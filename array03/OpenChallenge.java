package array03;

import java.util.Random;
import java.util.Scanner;

public class OpenChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			Random r = new Random();
			int k = r.nextInt(100);

			System.out.println("���� �����Ͽ����ϴ�. ���߾� �ּ��� 0~99");
			int i = 1;
			int b = 0;
			if (b > 0) {
				break;
			}
			while (true) {
				int num = sc.nextInt();

				if (num > k) {
					System.out.println(i + " >> " + num);
					System.out.println("�� ����");
					i++;

				} else if (num < k) {
					System.out.println(i + " >> " + num);
					System.out.println("�� ����");
					i++;
				} else {
					System.out.println(i + " >> " + num);
					System.out.println("�¾ҽ��ϴ�.");
					System.out.println("�ٽ� �Ͻðڽ��ϱ� (Y or N) �Է�");
					Scanner s = new Scanner(System.in);
					String text = s.next();
					if (text.equals("N")) {
						b++;
					} else {

						break;
					}

				}
			}
		}
	}

}
