package ex_control_statement;
	import java.util.Scanner;

	public class Ex8_work {
		public static void main(String[] args) {
			
			//Ű���忡�� ���� �ΰ��� �Է� �޴´�.
			//�׸��� �����ڸ� �Է� �޴´�. ( + - * / %)
			//�Է¹��� ������� �����ڸ� ������ ����� ���
			
			//��1 : 10
			//��2 : 5
			//������: +
			//��� : 10 + 5 = 15
			
			System.out.println("��1:");
			Scanner scan = new Scanner(System.in);
			int num1 = scan.nextInt();
			
			
			System.out.println("��2:");
			int num2 = scan.nextInt();
			
			System.out.println("������:");
			String a1 = scan.next();
			
			int result = 0;   //result �� ����������Ѵ�!! �׳� int result; �س����� �ȵ�
			
			switch (a1) {
			case "+":
				result = num1 + num2 ;
				
				break;
			
			case "-":
				result = num1 - num2; 
				break;
			case "*":
				result = num1 * num2 ;
				break;
			case "/":
				result = num1 / num2; 
				break;
			case "%":
				result = num1 % num2 ;	
				break;
			
			

			default:
				System.out.println("����");
				break;
			}//switch
			
			System.out.println("���:" + result);	
			
			
			
			
		}//main
	
}
