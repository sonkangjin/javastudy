package ch03;

public class MethodEx01 {
	
	//�޼���(�Լ�)�� Ŭ�����ȿ� �ۼ��� �� �ִ�.
	//***�޼���(�Լ�)�ȿ� �� (�Լ�)�� �ۼ��� �� ����!!***
	
		
	public static void main(String[] args) {
		int num = Cal.add(5, 3);// !!!�̷��� �ϸ� �Լ� �ڵ� ��ü�� int ���� �Ǿ ������
		System.out.println("���ϱ� : "+ num);
		
		int min = Cal.minus(5,3);
		System.out.println("���� : "+ min);
		
		int mul = Cal.multi(5,3);
		System.out.println("���ϱ� : "+ mul);
		
		int div = Cal.divide(5,3);
		System.out.println("������ : "+ div);
				
	}

}
