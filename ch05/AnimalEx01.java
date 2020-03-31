package ch05;

abstract class Animal {
	abstract String name();
}

class Mouse extends Animal {

	final String NAME = "ÂïÂïÀÌ";

	String name() {

		return NAME;
	}
}

class Dog extends Animal {
	final String NAME = "´ó´óÀÌ";

	String name() {
		return NAME;

	}

}

class Cat extends Animal {
	final String NAME = "³Ä¿ËÀÌ";

	String name() {

		return NAME;
	}
}

class Bird extends Animal {
	final String NAME = "Â±Â±ÀÌ";

	String name() {

		return NAME;
	}
}

public class AnimalEx01 {

	static void attack(Animal u1, Animal u2) {

		System.out.println(u2.name() + " °¡ " + u1.name() + " ¿¡°Ô °ø°İ ´çÇß½À´Ï´Ù");
	}

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Bird b1 = new Bird();
		Mouse m1 = new Mouse();

		System.out.println(d1.NAME + " Åº»ı");
		System.out.println(c1.NAME + " Åº»ı");
		System.out.println(b1.NAME + " Åº»ı");
		System.out.println(m1.NAME + " Åº»ı");
		// °­¾ÆÁö vs °í¾çÀÌ
		attack(d1, c1);
		// °­¾ÆÁö vs »õ
		attack(d1, b1);
		// °í¾çÀÌ vs »õ
		attack(c1, b1);
		//Áã vs »õ
		attack(m1,b1);
	}

}
