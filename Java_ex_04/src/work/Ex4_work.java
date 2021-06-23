package work;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {

		//키보드에서 정수를 입력받고, 입력받은 수가 소수인지 아닌지를 판단.


		System.out.println("정수 입력하세요");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count =0;

		for(int i = 1; i<=n ; i++ ) {

			int a = n%i   ;

			if (a == 0) {
				count ++;
			}

		}//for

		if(count == 2) {

			System.out.println("소수입니다");
		}

		else {System.out.println("소수가 아닙니다");
		}		





	}//m

}
