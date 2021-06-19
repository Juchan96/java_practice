package ex_control_statement;

import java.util.Scanner;

public class Ex7_switch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월을 입력하세요.");
		
		int month = scan.nextInt(); //7월은 31일까지 있습니다.  
		//1~12월 넣을꺼임
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"월은 31일까지 있습니다. ");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"월은 30일까지 있습니다. ");
			break;
		
		case 2:
			System.out.println(month+"월은 328일까지 있습니다. ");
			break;

		default:
			System.out.println(month + "월은 존재하지 않습니다");
			break;
		}
		
	
		
		
	}//main
	
}
