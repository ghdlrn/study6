package java_20240124;

public class ex6 {

	public static void main(String[] args) {
		/*
		 * 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
		 */
		int num = 0;
		
		for(int i = 0; i<6; i++) {
			for(int j = 0; j<6; j++) {
				if (i+j==6) {
					num += 1;
				}
			}
		}
		
		System.out.println(num);
		
	}
}
