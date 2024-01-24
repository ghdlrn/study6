package java_20240124;

public class ex12 {

	public static void main(String[] args) {
		//배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼'*'을 찍어서 그래프를 그리는 프로그램을 완성하시오.
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++)
			switch (answer[i]) {
			case 1:
				counter[0] += 1;
				break;
			case 2:
				counter[1] += 1;
				break;
			case 3:
				counter[2] += 1;
				break;
			case 4:
				counter[3] += 1;
				break;
			}
		for(int i=0; i<counter.length; i++)
			System.out.println(counter[i]+"*".repeat(counter[i]));
		
		System.out.println();
		
		
	}

}
