package java_20240124;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		/*
		 * 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라
		 * 단, 가능한 적은 수의 동전으로 거슬러 주어야 한다
		 */
		int[] coinUnit = {500, 100, 50, 10};
		int money =2680;
		int[] count = new int[coinUnit.length];
		System.out.println("money="+money);
		for(int i=0; i<coinUnit.length; i++) {
			int a = money;
			for(int j=0; j<i; j++) {
				a = money%coinUnit[j];
			}

			count[i] = a/coinUnit[i];
		}
			System.out.println("500원:"+count[0]);
			System.out.println("100원:"+count[1]);
			System.out.println("50원:"+count[2]);
			System.out.println("10원:"+count[3]);
		
	}
}
