package ch02;

class Person {
	String name = "�۹�ȣ";
	String email = "skj@naver.com";
	String phone = "01067074608";
	int age = 27;
	char gender = '��';
}

public class VarEx06 {

	public static void main(String[] args) {
		System.out.println("person ���");
		
		Person a = new Person();
		System.out.println(a.name);
		System.out.println(a.email);
		System.out.println(a.gender);
		System.out.println(a.age);
		System.out.println(a.phone);
	}

}
