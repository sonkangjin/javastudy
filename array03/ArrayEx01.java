package array03;

public class ArrayEx01 {

	public static void main(String[] args) {

		int num = 1; 
		for (long i = 2L; i < 2000000000000000000L; i=i*2) {
			
			System.out.println("2��"+num+"�� : " + i);
			num ++;
		}
		
	}

}
