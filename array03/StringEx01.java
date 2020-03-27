package array03;

public class StringEx01 {

	public static void main(String[] args) {
		String s1 = new String("나무");
		String s2 = new String("나무");
		System.out.println(s1 == s2);

		String s3 = "나무";
		String s4 = "나무";
		System.out.println(s3 == s4);

		System.out.println(s1 == s4);

		System.out.println(s1.equals(s4)); // 다른 공간이지만 문자가 같은지를 비교하려면 equals가 안전!
	}

}
