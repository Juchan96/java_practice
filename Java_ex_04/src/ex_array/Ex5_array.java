package ex_array;

import java.util.Scanner;

public class Ex5_array {
	public static void main(String[] args) {

		//배열의 길이?: 3
		//ABC
		//배열길이 5 --> ABCDE

		Scanner scan = new Scanner(System.in);
		System.out.println("방 갯수 설정 : ");
		int n = scan.nextInt();


		int[ ] arr = new int[n];
		for(int i = 0; i< arr.length; i++ ) {


			System.out.print((char)(arr[i] = 'A'+i));

		}//for
		System.out.println();
		System.out.println("---------------강사님 방법----------------------");
		System.out.println("방 갯수 설정 : ");
		int n1 = scan.nextInt();

		char[ ] ch = new char[n1];
		char c2 = 'A';

		for(int i = 0; i<ch.length; i ++) {

			ch[i] = c2++;
			System.out.print(ch[i]);
		}

	}//m
}
