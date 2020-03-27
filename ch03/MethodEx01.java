package ch03;

public class MethodEx01 {
	
	//메서드(함수)는 클래스안에 작성할 수 있다.
	//***메서드(함수)안에 는 (함수)를 작성할 수 없다!!***
	
		
	public static void main(String[] args) {
		int num = Cal.add(5, 3);// !!!이렇게 하면 함수 코딩 자체가 int 값이 되어서 굳어짐
		System.out.println("더하기 : "+ num);
		
		int min = Cal.minus(5,3);
		System.out.println("빼기 : "+ min);
		
		int mul = Cal.multi(5,3);
		System.out.println("곱하기 : "+ mul);
		
		int div = Cal.divide(5,3);
		System.out.println("나누기 : "+ div);
				
	}

}
