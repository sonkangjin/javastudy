package ch05;

abstract class Food {
	abstract void standby();
	
	void eat() {
		System.out.println("À½½ÄÀ» ¸Ô¾ú½À´Ï´Ù. ³È³È");
	}

	abstract void cook();

	void auto() {
		standby();
		cook();
		eat();
	}
}

class ¶ó¸é extends Food {
	String name = "¶ó¸é";
	@Override
	void cook() {
		System.out.println("º¸±Ûº¸±Û ²úÀÎ´Ù.");

	}

	@Override
	void standby() {
		System.out.println("¶ó¸é°ú ³¿ºñ¸¦ ÁØºñ¾²");

	}

}

class »ï°ã»ì extends Food {
	String name = "»ï°ã»ì";
	@Override
	void cook() {
		System.out.println("ºÒÆÇ¿¡ ±Á´Â´Ù.");

	}

	@Override
	void standby() {
		System.out.println("»ï°ã»ì°ú ºÒÆÇÀ» ÁØºñ¾²");

	}

}

public class FoodEx02 {

	static void start(Food f) {
		f.auto();

	}

	public static void main(String[] args) {
		start(new ¶ó¸é());
		start(new »ï°ã»ì());
	}

}
