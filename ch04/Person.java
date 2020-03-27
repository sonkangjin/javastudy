package ch04;

//상태와 행동
public class Person {

	String name;
	String job;
	int age;
	char gender;
	String bloodType;

	// 클래스 이름이랑 똑같은 애 ,
	// 디폴트 생성자(매개변수가 없는 애) = 초기화
	public Person() {

	}

	// 오버로딩
	public Person(String name, String job, int age, char gender, String bloodType) {

		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
	}

}
