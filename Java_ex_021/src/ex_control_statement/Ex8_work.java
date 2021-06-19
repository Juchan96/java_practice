package ex_control_statement;
	import java.util.Scanner;

	public class Ex8_work {
		public static void main(String[] args) {
			
			//키보드에서 정수 두개를 입력 받는다.
			//그리고 연산자를 입력 받는다. ( + - * / %)
			//입력받은 정수들과 연산자를 가지고 결과를 출력
			
			//수1 : 10
			//수2 : 5
			//연산자: +
			//결과 : 10 + 5 = 15
			
			System.out.println("수1:");
			Scanner scan = new Scanner(System.in);
			int num1 = scan.nextInt();
			
			
			System.out.println("수2:");
			int num2 = scan.nextInt();
			
			System.out.println("연산자:");
			String a1 = scan.next();
			
			int result = 0;   //result 값 정의해줘야한다!! 그냥 int result; 해놓으면 안됨
			
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
				System.out.println("오류");
				break;
			}//switch
			
			System.out.println("결과:" + result);	
			
			
			
			
		}//main
	
}
