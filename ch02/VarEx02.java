package ch02;

public class VarEx02 {

	public static void main(String[] args) {
		double myNum = 10.5; //8byte ����
		System.out.println(myNum);
		
		int num1 =(int)myNum;
		System.out.println(num1);//�ٿ�ĳ�����ϸ� �Ҽ��� �� �����
		int num2 = 10;
		double num3 = num2;
		System.out.println(num3);//��ĳ���� �Ǹ鼭 Ÿ���� ����� �ż� �Ҽ������� ��Ÿ��
		
	}

}
