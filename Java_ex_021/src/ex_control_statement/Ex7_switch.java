package ex_control_statement;

import java.util.Scanner;

public class Ex7_switch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���.");
		
		int month = scan.nextInt(); //7���� 31�ϱ��� �ֽ��ϴ�.  
		//1~12�� ��������
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"���� 31�ϱ��� �ֽ��ϴ�. ");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"���� 30�ϱ��� �ֽ��ϴ�. ");
			break;
		
		case 2:
			System.out.println(month+"���� 328�ϱ��� �ֽ��ϴ�. ");
			break;

		default:
			System.out.println(month + "���� �������� �ʽ��ϴ�");
			break;
		}
		
	
		
		
	}//main
	
}
