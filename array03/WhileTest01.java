package array03;

public class WhileTest01 {

	public static void main(String[] args) {
		int destination = 11271; // 11271미터 거리에 목적지가 있습니다.
		int speed = 3; // 당신의 자동차는 초당 3미터를 달립니다.
		int car = 0;
		// 당신의 자동차가 얼마만에 목적지에 도착하는지 알아봅시다.
		int i = 1;
		while (destination != car) { // desticantion과 car가 같지 않으면 계속 수행
			car = car + speed;
			i++;
		} // while문이 한번 돌때 마다 1초가 지나는 것입니다. 60번 돌면 1분이 지나겠죠?
		System.out.println(i + "번"); // 3758번 while문을 수행했습니다. 분으로 환산해 보겠습니다.
		int min = i / 60;
		System.out.println(min + "분"); // 62분이 걸렸네요. 시간으로 환산해보겠습니다.
		int hour = min / 60;
		System.out.println(hour + "시간"); // int는 정수형이라서 소수점이 나오지 않습니다.

		double time = min;
		System.out.println(time / 60 + "시간"); // 소수점으로 출력해도 원하는 값이 나오지 않습니다.

		// 자바에서는 나머지를 구하는 연산자가 있습니다. 바로 % 입니다.
		int real_min = min % 60;
		System.out.println(real_min + "분"); // 분을 구했습니다.
		// 그럼 아까 구했던 시간 hour을 이용하여 깔끔하게 출력해 보겠습니다.

		System.out.println(hour + "시간" + real_min + "분"); // 완성입니다.

	}

}
