package ex_operator;

public class Ex4_Operator {

public static void main(String[] args) {
		
		//증감연산자
		//1씩 증가시키거나 1씩 감소시키는 연산자
		//선행증감과 후행증감의 차이점을 구별
		int a = 10;
		System.out.println("a:" + ++a);   //++가 a 앞에 있어서 선행증가 (그다음 프린트)
		
		int b = 10;
		System.out.println("b:" + b++);  //++가 b 뒤에 있어서 프린트 우선 하고 후행증가
		System.out.println("b:" + b);
		
		System.out.println("a:" + a--);  // --가 a뒤에 있어서 프린트 우선하고 후행감소
		System.out.println("a:" + a);
		
		++a;
		++a;
		a--;
		a++;
		--a;
		System.out.println("a:"+ ++a); // ++++a 이런것 존재 x 증감연산자는 무조건 1씩밖에 증가,감소
		                               // 2씩 증감하고 싶으면 a += 2 or a -= 2 이런식으로 해야함
		
		System.out.println("-------------------------------------------");
		
		//삼항연산자
		//하나의 조건에 대한 결과가 참일때와 거짓일때
		//두 결과에 대한 하나의 답을 얻기위해 사용하는 연산자
		int num1 = 10;
		int num2 = 15;
		boolean result = ++num1 >= num2 ? true : false;  // ? 나오면 무조건 3항연산자 , ? 앞에 나오는 항은 무조건 참or 거짓이어야함
		System.out.println(result);
		
		num1 = 10;
		num2 = 20;
		char result2 = (num1 += num1) == num2 ? 'O' : 'X' ;
		System.out.println(result2);
		
		System.out.println("-------------------------------------------");
		
		
		int age = 27;
		//25세 이상 ~ 30세 미만의 알바생을 뽑으려 한다.
		//조건에 만족하면 합격, 만족하지 않으면 불합격 출력
		char result3 = (age>= 25 && age <30 ) ? '합' : '불' ;
		System.out.println(result3);
		
		System.out.println("-------------------------------------------");
		
		a = 10;
		b = 12;
		result = ++a >= b || 2+7 <= b && 13 - b>= 0 && (a+=b) - (a % b) > 10;
		System.out.println(result);
		//제일 앞에있는 연산부터 하나하나 차근차근 해나가면 된다.
		//    x  or    o     and  o  and o
		//중요 ! 특정 조건 and 앞 false 경우 뒤는 생각 x
		
	}//main
	
	
}
