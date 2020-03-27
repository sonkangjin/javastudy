package array03;

//남은 동전의 개수를 구하는 프로그램(500,100,50,10)
//2680
public class Coin {

	public static void main(String[] args) {
		int money = 34634;
		int count = 0;
		System.out.println("시작 금액 : " + money + "원");
		System.out.println("");

		int coin[] = { 500, 100, 50, 10, 1 };

		for (int i = 0; i < coin.length; i++) {
			count = money / coin[i];
			money = money % coin[i];

			System.out.println(coin[i] + "원 개수 : " + count + "개");
			System.out.println("잔돈 : " + money + "원");
		}

	}

}
