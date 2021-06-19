package ex_printf;

public class Ex_printf {
	
public static void main(String[] args) {
		
		System.out.printf("%d + %d = %d", 5 ,5,10);  //"%d",  의미: 반드시 정수가 들어와야합니다.
		System.out.println();
		
		System.out.printf("%02d" , 7);  //2자리 이하일때는 앞에 0을 붙여 2자리로 출력해준다
		
		System.out.println();
		
		System.out.printf("%03d" , 7);  //3자리 이하일때는 앞에 0을 붙여 3자리로 출력해준다.
		
		System.out.printf("\n");  // won표시 + n     ==> 줄바꿈 printf 코드

		System.out.printf("%f : %f\n ", 10.2 , 3.14);   // "%f" 는 실수입력 타입 
		System.out.printf("%.2f\n", 3.141592);   // %에다가 . (점) 찍고 2 f 하면 소숫점 두자리 까지 표시
		
		System.out.printf("%s-%s", "홍" , "길동");  //%s는 문자열타입
		System.out.printf("\n");
		
		//%d: 정수타입
		  // %f: 실수타입
		   //%s: 문자열타입 (쌍따옴표)
		   //%c: 문자타입  (홑따옴표)

		String str = String.format("%d %s %c", 10, "홍길동" , '요');  //출력하고 싶은 폼을저장해놓는 용도!!
		                                                            //str에 위 폼을 저장
		
		System.out.printf(str);
		
		
		
	}//main

}
