package java_20240124;

public class ex4 {

	public static void main(String[] args) {
	/*
	 * 1 + (-2) + 3 + (-4) + ... 과 같은 식으로 계속 더해나갈 때 몇까지 더해야 총합이 100이상이 되는지 구하시오
	 */
		int n=1;
		int sum=0;
		while(sum<100) {

			if(n%2==1) {
				sum += n;
			}
			else {
				sum -= n;
			}
			
		++n;
			
		}
		n -= 1;
		System.out.println(n);
		
	}
}
