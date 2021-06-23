package work;

import java.util.Scanner;

public class NumberMagic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int select = 0;
		int result = 0;  //최종결과

		System.out.println("1~30사이의 숫자를 생각하세요");
		System.out.println("04 05 06 07 12 \n13 14 15 20 21 \n22 23 28 29 30");

		System.out.println("생각한 숫자가 있습니까? 1|0 : ");
		select = sc.nextInt();

		if (select == 1) { result += 4;

		}
		else if(select == 0) {

		}
		else {
			System.out.println("오류발생");
		}
		System.out.println("-------------------------------------------------");

		System.out.println("16 17 18 19 20 \n21 22 23 24 25 \n26 27 28 29 30");

		System.out.println("생각한 숫자가 있습니까? 1|0 : ");
		select = sc.nextInt();

		if (select == 1) { result += 16;

		}
		else if(select == 0) {

		}
		else {
			System.out.println("오류발생");
		}
		System.out.println("-------------------------------------------------");

		System.out.println("01 03 05 07 09 \n11 13 15 17 19 \n21 23 25 27 29");

		System.out.println("생각한 숫자가 있습니까? 1|0 : ");
		select = sc.nextInt();

		if (select == 1) { result += 1;

		}
		else if(select == 0) {

		}
		else {
			System.out.println("오류발생");
		}
		System.out.println("-------------------------------------------------");


		System.out.println("08 09 10 11 12 \n13 14 15 24 25 \n26 27 28 29 30");

		System.out.println("생각한 숫자가 있습니까? 1|0 : ");
		select = sc.nextInt();

		if (select == 1) { result += 8;

		}
		else if(select == 0) {

		}
		else {
			System.out.println("오류발생");
		}
		System.out.println("-------------------------------------------------");
		


		System.out.println("02 03 06 07 10 \n11 14 15 18 19 \n22 23 26 27 30");

		System.out.println("생각한 숫자가 있습니까? 1|0 : ");
		select = sc.nextInt();

		if (select == 1) { result += 2;

		}
		else if(select == 0) {

		}
		else {
			System.out.println("오류발생");
		}

		System.out.println("당신이 생각한 숫자:"+ result + "입니다.");






	}//M

}
