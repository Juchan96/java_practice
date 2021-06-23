package work;

import java.util.Scanner;

public class Ex3_HomeWork { 
	public static void main(String[] args) {
		
		//문제1)
		//피보나치 수열
		// 정수:5
		//1 1 2 3 5    (자기 바로 앞에 것을 더한 값이 뒤에 찍힘)
		//정수 개수만큼 피보나치 수열 만들기 (swap활용 / temp)
		
		int temp = 0;
		int a = 0;
		int b = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("피보나치  수열 항 갯수 입력");
		int n = scan.nextInt();
		System.out.print("1 ");
		
		for(int i = 1; i<n; i++) {
			
			temp = a + b;
			
			System.out.print(temp + " ");
			a = b;
			b = temp;


		
		}//for
		System.out.println();
		System.out.println("-----------------(강사님 방법)----------------------");
		
		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		System.out.println("피보나치 항 갯수 입력:");
		int count = scan.nextInt();
		
		for( int i = 0; i<count; i++) {
			
			num2 = num3;
			num3 = num1;
			num1 = num2 + num3;
			
			System.out.printf("%d ", num3);
		}
		
	
		
		
	}//m

}
