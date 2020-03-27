package ch02;

public class VarEx02 {

	public static void main(String[] args) {
		double myNum = 10.5; //8byte 단위
		System.out.println(myNum);
		
		int num1 =(int)myNum;
		System.out.println(num1);//다운캐스팅하면 소수점 다 사라짐
		int num2 = 10;
		double num3 = num2;
		System.out.println(num3);//업캐스팅 되면서 타입이 더블로 돼서 소수점까지 나타남
		
	}

}
