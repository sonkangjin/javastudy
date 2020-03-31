package stars;

//추상클래스와 유사
//추상 메서드만 존재가능 , 동적바인딩의 통로 로만 사용
public interface Behavior {
	public abstract void move();

	void repair();

	void attack(Behavior unit);

}
