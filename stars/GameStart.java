package stars;

//다크템플러 DarkTempler ,리버 River

class DarkTempler {
	final String NAME;
	int hp;
	static int attack = 50;

	public DarkTempler(String name) {
		this.NAME = name;
		this.hp = 100;

	}

}

class River {
	final String NAME;
	int hp;
	static int attack = 70;

	public River(String name) {
		this.NAME = name;
		this.hp = 100;

	}

}

class Zealot {
	final String NAME; // 변경안되는건 final로 ! 이름은 대문자로!!
	int hp;
	static int attack = 10;

	public Zealot(String name) {
		this.NAME = name;
		this.hp = 100;

	}

}

class Dragoon {
	final String NAME;
	int hp;
	static int attack = 15;

	public Dragoon(String name) {
		this.NAME = name;
		this.hp = 100;

	}

}

public class GameStart {

	// 질럿이 드라군 어택
	static void attack(Zealot u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 드라군이 질럿 어택
	static void attack(Dragoon u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 질럿이 질럿 어택
	static void attack(Zealot u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 드라군이 드라군 어택
	static void attack(Dragoon u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 다크템이 다크템 어택
	static void attack(DarkTempler u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 리버가 리버 어택
	static void attack(River u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 다크템이 질럿 어택
	static void attack(DarkTempler u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 질럿이 다크템 어택
	static void attack(Zealot u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 질럿이 리버 어택
	static void attack(Zealot u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 리버가 질럿 어택
	static void attack(River u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 드라군이 리버 어택
	static void attack(Dragoon u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 리버가 드라군 어택
	static void attack(River u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 드라군이 다크템 어택
	static void attack(Dragoon u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 다크템이 드라군 어택
	static void attack(DarkTempler u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 다크템이 리버 어택
	static void attack(DarkTempler u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 리버가 다크템 어택
	static void attack(River u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	public static void main(String[] args) {
		// 공격 업그레이드 하기
		Zealot.attack++;
		// 질럿 생성하기
		Zealot z1 = new Zealot("1번질럿");
		System.out.println(Zealot.attack);

		Zealot z2 = new Zealot("2번질럿");
		System.out.println(Zealot.attack);

		Dragoon d1 = new Dragoon("1번 드라군");
		System.out.println(Dragoon.attack);

		Dragoon d2 = new Dragoon("2번 드라군");
		System.out.println(Dragoon.attack);

		DarkTempler dt1 = new DarkTempler("1번 다크템");
		System.out.println(Dragoon.attack);

		DarkTempler dt2 = new DarkTempler("2번 다크템");
		System.out.println(Dragoon.attack);

		River r1 = new River("1번 리버");
		System.out.println(Dragoon.attack);

		River r2 = new River("2번리버");
		System.out.println(Dragoon.attack);

		// 공격하기
		attack(z1, d1);
		attack(z2, dt1);
		attack(d1, r2);
		attack(d2, z2);
		attack(dt1, d2);
		attack(dt2, r2);
		attack(r1, dt2);
		attack(r2, d2);

	}

}
