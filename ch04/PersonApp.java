package ch04;

public class PersonApp {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "�ֽ���";
		p1.job = "�ǻ�";
		p1.gender = '��';
		p1.bloodType = "AB";
		p1.age = 45;

		Person p2 = new Person();
		p2.name = "�̹̳�";
		p2.job = "��������";
		p2.bloodType = "O";
		p2.gender = '��';
		p2.age = 28;

		Person p3 = new Person();
		p3.name = "��̳�";
		p3.job = "����";
		p3.gender = '��';
		p3.bloodType = "AB";
		p3.age = 47;

		System.out.println(p3.name);
		System.out.println(p3.job);
		System.out.println(p3.bloodType);
		System.out.println(p3.gender);
		System.out.println(p3.age);

		Person p4 = new Person("����ȣ", "����", 38, '��', "B");
		System.out.println(p4.name);
		System.out.println(p4.job);
		System.out.println(p4.bloodType);
		System.out.println(p4.gender);
		System.out.println(p4.age);
		
		

	}

}
