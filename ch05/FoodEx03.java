package ch05;

//�߻�Ŭ������ ������� �뵵�� ��밡��
abstract class Į{
	abstract void kill();
	abstract void cook();
	abstract void repair();	
}
abstract class �丮������ extends Į{
	@Override
	void kill() {}
	@Override
	void repair() {}
}
class ������ extends �丮������{

	@Override
	void cook() {
			
	}

}
public class FoodEx03 {

	public static void main(String[] args) {
		

	}

}
