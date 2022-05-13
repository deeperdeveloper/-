package sec02.verify.exam05;

public class for_twice {

	public static void main(String[] args) {
		
		// * 를 직각삼각형으로 (4 by 4) 출력하는 코드
		
		for(int i=1; i<=4 ; i++) {
			for (int j=1; j<=i ; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
