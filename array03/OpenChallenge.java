package array03;

import java.util.Random;
import java.util.Scanner;

public class OpenChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			Random r = new Random();
			int k = r.nextInt(100);

			System.out.println("수를 결정하였습니다. 맞추어 주세요 0~99");
			int i = 1;
			int b = 0;
			if (b > 0) {
				break;
			}
			while (true) {
				int num = sc.nextInt();

				if (num > k) {
					System.out.println(i + " >> " + num);
					System.out.println("더 낮게");
					i++;

				} else if (num < k) {
					System.out.println(i + " >> " + num);
					System.out.println("더 높게");
					i++;
				} else {
					System.out.println(i + " >> " + num);
					System.out.println("맞았습니다.");
					System.out.println("다시 하시겠습니까 (Y or N) 입력");
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
