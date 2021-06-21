package ex1_for;

import java.util.Scanner;

public class Ex1_for {
	public static void main(String[] args) {
		
		//반복문
		//특정 수행문을 여러번 반복할 수 있도록 해주는 제어문
		//for문: 특정 명령을 원하는 만큼 반복하고자 할 떄 사용
		//for(초기식;조건식;증감식){
		// 조건식이 참일때 실행되는 영역
		//}
		for( int i = 0; i <=3; i++ ) {     //1.초기화 시켜놓고 2.조건에 맞는지확인 3.프린트하고 4. i는 1증가 반복
			                               //다시 2로 조건 확인 3.프린트하고 4. i 1증가 반복
			System.out.println(i);
			
		}  // i 는 지역변수이다!!! for문 밖으로 벗어나면 i를 변수로 다시써도됨
		System.out.println("-----------------------------------------");
		
		for (int i1 = 10; i1 !=0; i1--) {
			
			System.out.println(i1);
		}
		System.out.println("-----------------------------------------");
		//1~100까지 3의 배수만 출력
		
		for (int i =0;  i<= 100  ; i++  ) {
			
			if (i %3 ==0 )  {
			System.out.println(i);
			
	     	}
		}
			
		System.out.println("-----------------------------------------");
		//키보드에서 정수를 입력받고.
		//입력받은 값에 해당하는 구구단을 출력
		//값:3
		//3x1 = 3
		// ....
		//3 x 9 = 27
		
        System.out.println("구구단 출력할 정수 입력");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println(num1+ "단");
		
		
		for (int i = 0; i<10 ; i++ ) {               //for문 방식 암기!!
			System.out.println(num1+"x"+i+"=" +(num1*i));
			System.out.printf("%d x %d = %d\n", num1 , i , num1*i);  //printf방식
			
			
		}
			
			
		
		
		
		
	}//main
}
