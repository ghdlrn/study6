package java_20240124;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		/*
		 * 1~100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추는 게임
		 * 사용자가 값을 입력하면 컴퓨터는 자신의 생각값과 비교하여 결과를 알려준다.
		 * 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇번만에 숫자를 맞췄는지 알려준다.
		 */
		int input, answer, count;
		input = answer = count = 0;
		
		
		answer = (int)(Math.random()*100)+1;  //1~100중 난수를 answer 대입
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1과 100사이의 정수를 입력하세요!!");
			
			input = sc.nextInt();
			
			count++;
			
			if(input > answer)
				System.out.println("더 작은 수 입력!!");
			else if (input < answer)
				System.out.println("더 큰 수 입력!!");
			
		}while(input != answer);
		
		System.out.println(count + "회" + input + "맞추었습니다.");
	}
}
