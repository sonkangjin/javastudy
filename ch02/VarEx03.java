package ch02;

public class VarEx03 {

	public static void main(String[] args) {
		char s1 = '��';// 2byte
		System.out.println(s1);
		s1 = '��';
		System.out.println(s1);

		char c1 = '��';
		char c2 = '��';
		char c3 = '��';// ������ �޸� ������ ����
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3); // �̷��� ����ϸ� �� ��ȿ��

		char[] str = { '��', '��', '��' };// �ڿ��ӵȡ� ������ ����
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str);// ��½� ȿ��~
		// str[3]='��'; ������ ���� ������ ����
		str[0] = '��'; // �ִ� ������ �ٸ������� ������ ����!
		System.out.println(str);

	}

}
