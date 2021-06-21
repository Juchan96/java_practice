package ex1_for;

public class Ex2_multi_for {
	public static void main(String[] args) {

		//다중 for문 : for문 안에 for문이 있는 경우
		for( int i = 0 ; i <=2 ; i++ ) {  //Y축  바깥쪽 for 문이 세로방향

			for( int j = 1; j <3 ; j++  ) { //X축 안쪽 for 문이 가로방향

				System.out.printf("%d " , j);

			}//inner			

			System.out.println();

		}//outer


		//1 2 3 4    가로 4줄  세로 3줄
		//1 2 3 4
		//1 2 3 4

		for(int a = 1; a <=3 ; a ++) { 

			for(int b=1; b<=4 ; b++) {
				System.out.printf("%d " , b);

			}//inner
			System.out.println();

		}//outer


		System.out.println("---------------------------------------");

		//01 02 03 04
		//05 06 07 08
		//09 10 11 12
		int count = 0;

		for(int i = 1; i<=3 ; i ++ ) {

			for (int j =1 ; j <= 4  ;j ++ ) {

				System.out.printf("%02d ", ++count);



			}//inner

			System.out.println();


		}//outer


		System.out.println("---------------------------------------");

		//A B C D
		//E F G H
		//I J K L
		char ch = 'A';                //아스키 코드!! char로 정의하고 printf에서 "%c"
		for (int i = 1; i<= 3 ; i ++) {

			for(int j= 1; j <=4 ; j++) {
				System.out.printf("%c ", ch++);
			}//inner

			System.out.println();


		}//outer

		System.out.println("---------------------------------------");

		//*
		//* *
		//* * *
		//* * * *

		for (int i = 1; i<= 4 ; i ++) {

			for(int j =1; j<=i ; j++) {
				System.out.printf("* ");

			}//inner
			System.out.println();


		}//outer

		System.out.println("---------------------------------------");
		//    *
		//   ***
		//  *****
		// *******
		//*********  


		for (int i = 0; i<5; i ++) {

			for(int j = 0 ; j < 5+ i ; j++) {

				if(i+j>3) {

					System.out.print("* ");}
				else {
					System.out.print("  ");

				}
			}//inner

			System.out.println();

		}//outer

		System.out.println("---------------------------------------");

		int c =0;

		for (int i=1 ; i<=10 ; i ++) {
			c= i;
			for(int j= 1; j<=10 ; j ++) {

               
				
				if(c>10) { 
					c = 1;
				}

				System.out.printf("%d " , c);
				c += 1 ;

			}//inner

			System.out.println();


		}//outer

		


	}//main

}
