package java_20240124;

public class ex3 {

	public static void main(String[] args) {
/*
 * char ch = 'A';
		char lowerCase = (1) ? (2) : ch;
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		
		(1),(2)에 알맞은 코드를 넣어 ch에 저장된 문자가 대문자인 경우 소문자로 변경
 */
		char ch = 'A';
		char lowerCase = (int)ch < 97 ? (char)(ch+32): ch;
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		
	}

}
