package java_20240124;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		/*
		 * 1~9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어 내는 프로그램을 완성하시오
		 */
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		
		for(int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random()*ballArr.length);
			int temp = ballArr[0];
			ballArr[0] = ballArr[j];
			ballArr[j] = temp;
		}
			
		for(int i=0; i<ball3.length; i++) {
		ball3[i] = ballArr[i];
		System.out.print(ball3[i]);
		}
		
	}
}
