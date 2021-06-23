package work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {


		//1부터 입력받은 값까지의 합을 계산하여 출력
		//정수:5
		//결과:15
	


		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요");	
		int n = sc.nextInt();
		int result = 0;


		for (int i = 1; i<=n; i++ ) {

			result = result + i;


		}
		System.out.println("결과 : "+result);

	



	}//m

}
