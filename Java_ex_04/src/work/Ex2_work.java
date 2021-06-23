package work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		//키보드에서 정수 n1, n2를 받는다.
		//n1 부터 n2까지의 합을 출력
		//예를 들어 2와 5를 받았다면.. 2+ 3+ 4+ 5
		
		//정수1: 2
		//정수2: 5
		//결과:14
		
		//정수 1: 5
		//정수 2: 2
		//결과: 14  어떤걸 먼저받든지 입력받은 숫자 총합은 같음
		
		int result = 0;
		int n3= 0;
		int n4 =0;
		Scanner scan = new Scanner(System.in); //하나면 충분
		
		System.out.println("정수 1 입력");
		int n1 = scan.nextInt();
		System.out.println("정수 2 입력");
		int n2 = scan.nextInt();
		
		if (n2 > n1) {
			n3 = n2; //큰놈
			n4 = n1;
		}
		else if (n1 > n2) {
			n3 = n1; //큰놈
			n4 = n2;
		}
		
		for(int i = n4 ; i<= n3; i ++) {
			
			result += i;
			
		}//for
		System.out.println(result);
		
		
		
		//변수 두개 값을 바꾸는 방법 (temp) 이용
		//if (n1>n2){
		// int n3 = n1;
		// n1 = n2;
		// n2 = n3;}
			
			
		
		
		
		
		
		
	}//m

}
