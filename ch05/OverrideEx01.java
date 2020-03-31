package ch05;

class A {

	void run() {
		System.out.println("A �޸���.");
	}
}

class B extends A {

	void run() {

		System.out.println("B �޸���.");
	}
}

class C extends B {
	String name = "C";

	void run() {

		System.out.println(name + " �޸���.");
	}
}

public class OverrideEx01 {

	public static void main(String[] args) {
		A a = new B();
		B b = new C();
		C c = new C();

		a.run();
		System.out.println();
		b.run();
	}

}
