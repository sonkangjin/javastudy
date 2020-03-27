package ch02;

public class VarEx03 {

	public static void main(String[] args) {
		char s1 = '가';// 2byte
		System.out.println(s1);
		s1 = '나';
		System.out.println(s1);

		char c1 = '가';
		char c2 = '나';
		char c3 = '다';// 각각의 메모리 공간에 저장
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3); // 이렇게 출력하면 쌉 비효율

		char[] str = { '가', '나', '다' };// ★연속된★ 공간에 저장
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str);// 출력시 효율~
		// str[3]='라'; 공간이 없기 떄문에 오류
		str[0] = '라'; // 있는 공간에 다른것으로 대입은 가능!
		System.out.println(str);

	}

}
