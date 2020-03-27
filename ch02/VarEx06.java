package ch02;

class Person {
	String name = "송민호";
	String email = "skj@naver.com";
	String phone = "01067074608";
	int age = 27;
	char gender = '남';
}

public class VarEx06 {

	public static void main(String[] args) {
		System.out.println("person 출력");
		
		Person a = new Person();
		System.out.println(a.name);
		System.out.println(a.email);
		System.out.println(a.gender);
		System.out.println(a.age);
		System.out.println(a.phone);
	}

}
