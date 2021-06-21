package work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {


		//숫자마술 게임 만들기
		int count = 0;
		System.out.println("1~30숫자중에서 한가지 숫자를 생각하세요");
		System.out.println();
		System.out.println("04 05 06 07 12 13 14 15 20 21 22 23 28 29 30");
		System.out.println("이 중에서 당신이 생각한 숫자가 있습니까? 있으면 1 엔터, 없으면 0 엔터를 누르세요");

		Scanner scan = new Scanner( System.in);
		int n = scan.nextInt();

		if(n == 1) { count = count + 4;

		}
		else if(n == 0) { 

		}
		else { 
			System.out.println("오류");
		}

		System.out.println("16 17 18 19 20 21 22 23 24 25 26 27 28 29 30");
		System.out.println("이 중에서 당신이 생각한 숫자가 있습니까? 있으면 1 엔터, 없으면 0 엔터를 누르세요");

		int n1 = scan.nextInt();

		if(n1 == 1) { count = count + 16;

		}
		else if(n1 == 0) { 

		}
		else { 
			System.out.println("오류");
		}

		System.out.println("01 03 05 07 09 11 13 15 17 19 21 23 25 27 29");
		System.out.println("이 중에서 당신이 생각한 숫자가 있습니까? 있으면 1 엔터, 없으면 0 엔터를 누르세요");

		int n2 = scan.nextInt();

		if(n2 == 1) { count = count + 1;

		}
		else if(n2 == 0) { 

		}
		else { 
			System.out.println("오류");
		}

		System.out.println("08 09 10 11 12 13 14 15 24 25 26 27 28 29 30");
		System.out.println("이 중에서 당신이 생각한 숫자가 있습니까? 있으면 1 엔터, 없으면 0 엔터를 누르세요");

		int n3 = scan.nextInt();

		if(n3 == 1) { count = count + 8;

		}
		else if(n3 == 0) { 

		}
		else { 
			System.out.println("오류");

		}

		System.out.println("02 03 06 07 10 11 14 15 18 19 22 23 26 27 30");
		System.out.println("이 중에서 당신이 생각한 숫자가 있습니까? 있으면 1 엔터, 없으면 0 엔터를 누르세요");

		int n4 = scan.nextInt();

		if(n4 == 1) { count = count + 2;

		}
		else if(n4 == 0) { 

		}
		else { 
			System.out.println("오류"); 

		}

		System.out.println("당신이 생각한 숫자:" + count);













	}//main

}
