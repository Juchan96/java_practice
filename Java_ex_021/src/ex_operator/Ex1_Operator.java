package ex_operator;

public class Ex1_Operator {
	
public static void main(String[] args) {
		
		/*
		 1. 최고연산자 : ..()
		 2. 증감연산자 : ++,--
		 3. 산술연산자 : +,-,*,/,%
		 4. 시프트연산자 : >>,<<
		 5. 비교연산자 : > , < , >= ,<= , == , !=
		 6. 비트연산자 : &, | , ^ , ~ 
		 7. 논리연산자 : &&, || , !
		 8. 조건여(삼항)연산자: ? , :
		 9. 대입연산자: =, *= , /= , %= , += , -=
		 */
		
		//산술연산자
		//산술연산자는 4칙연산과 나머지 값을 구하는 나머지연산자로 나뉜다.
		int n1 = 20;
		int n2 = 0;
		int n3 = 0; //값을 집어넣는것을 초기화라고 한다.
		
		n1 = 20;
		n2 = 7;
		n3 = n1 + n2;
		System.out.println("n3:"+n3);
		
		n3 = n1 / n2;
		System.out.println("n3:"+n3); //몫
		
		n3 = n1 % n2;
		System.out.println("n3:" +n3); //나머지
		
		System.out.println("---------------------------------------");
		
		//대입 연산자
		//특정 값을 변수에 전달하여 기억시킬 떄 사용하는 연산자
		int i1 = 10;
		int i2 = 7;
		int i3 = i1 += i2 ;  //i1 = i1 +i2
		System.out.println("+=연산자:" + i3);
		
		i3= i1-= i2;  //i1 = i1 - i2
		System.out.println("-=연산자:" + i3);
		
		i3 = i1 %= i2;  //i1 = i1 % i2
		System.out.println("%=연산자:" + i3);
		
		System.out.println("---------------------------------------");
		
		//비교연산자
		//변수나 상수의 값을 비교하여 참.거짓을 판단하는 연산자
		int a1 = 10;
		int a2 = 20;
		boolean result = a1 < a2;   //boolean 중요!!!
		System.out.println("a1 < a2 :"+result);
		
		result = a1 == a2;
		System.out.println("a1 == a2:"+ result);
		
		result = a1 != a2;   //java에서 !는 not의 의미
		System.out.println("a1 != a2:" + result);
		
	}//main

}
