package work;

import java.util.Scanner;

public class Ex3_HomeWork { 
	public static void main(String[] args) {
		
		//����1)
		//�Ǻ���ġ ����
		// ����:5
		//1 1 2 3 5    (�ڱ� �ٷ� �տ� ���� ���� ���� �ڿ� ����)
		//���� ������ŭ �Ǻ���ġ ���� ����� (swapȰ�� / temp)
		
		int temp = 0;
		int a = 0;
		int b = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("�Ǻ���ġ  ���� �� ���� �Է�");
		int n = scan.nextInt();
		System.out.print("1 ");
		
		for(int i = 1; i<n; i++) {
			
			temp = a + b;
			
			System.out.print(temp + " ");
			a = b;
			b = temp;


		
		}//for
		System.out.println();
		System.out.println("-----------------(����� ���)----------------------");
		
		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		System.out.println("�Ǻ���ġ �� ���� �Է�:");
		int count = scan.nextInt();
		
		for( int i = 0; i<count; i++) {
			
			num2 = num3;
			num3 = num1;
			num1 = num2 + num3;
			
			System.out.printf("%d ", num3);
		}
		
	
		
		
	}//m

}
