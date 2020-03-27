package array03;

public class StEx01 {

	public static void main(String[] args) {
		char arr[] = { '가', '나', '다', '라', '마' };

		// for문으로 역순 만들기
		char arr1[] = new char[5];
		int a = 4;
		for (int i = 0; i < arr1.length; i++) {
			arr1[a - i] = arr[i];
		}
		System.out.println(arr1);

	}

}
