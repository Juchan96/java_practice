package ex1_for;

import java.util.Scanner;

public class Ex1_for {
	public static void main(String[] args) {
		
		//�ݺ���
		//Ư�� ���๮�� ������ �ݺ��� �� �ֵ��� ���ִ� ���
		//for��: Ư�� ����� ���ϴ� ��ŭ �ݺ��ϰ��� �� �� ���
		//for(�ʱ��;���ǽ�;������){
		// ���ǽ��� ���϶� ����Ǵ� ����
		//}
		for( int i = 0; i <=3; i++ ) {     //1.�ʱ�ȭ ���ѳ��� 2.���ǿ� �´���Ȯ�� 3.����Ʈ�ϰ� 4. i�� 1���� �ݺ�
			                               //�ٽ� 2�� ���� Ȯ�� 3.����Ʈ�ϰ� 4. i 1���� �ݺ�
			System.out.println(i);
			
		}  // i �� ���������̴�!!! for�� ������ ����� i�� ������ �ٽýᵵ��
		System.out.println("-----------------------------------------");
		
		for (int i1 = 10; i1 !=0; i1--) {
			
			System.out.println(i1);
		}
		System.out.println("-----------------------------------------");
		//1~100���� 3�� ����� ���
		
		for (int i =0;  i<= 100  ; i++  ) {
			
			if (i %3 ==0 )  {
			System.out.println(i);
			
	     	}
		}
			
		System.out.println("-----------------------------------------");
		//Ű���忡�� ������ �Է¹ް�.
		//�Է¹��� ���� �ش��ϴ� �������� ���
		//��:3
		//3x1 = 3
		// ....
		//3 x 9 = 27
		
        System.out.println("������ ����� ���� �Է�");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println(num1+ "��");
		
		
		for (int i = 0; i<10 ; i++ ) {               //for�� ��� �ϱ�!!
			System.out.println(num1+"x"+i+"=" +(num1*i));
			System.out.printf("%d x %d = %d\n", num1 , i , num1*i);  //printf���
			
			
		}
			
			
		
		
		
		
	}//main
}
