package valueType;

public class Ex1_valueType {
public static void main(String[] args) {
		
    	//자료형( 기본자료형 )
    	/*
    	 논리형: boolean - 1bit
    	 문자형: char - 2byte
    	 정수형: byte - 1byte ........ -128 ~ 127
    	      short - 2byte ....... -32768 ~ 32767
    	      int - 4byte ......... -21억 ~ 21억
    	      long - 8byte ........ -900경~ 900경
    	 실수형: float - 4byte
    	      double - 8byte
    	 */
    	
    	//변수 : 개발에 사용할 값을 저장할 속성
    	//변수 선언 규칙
    	//자료형 변수명; (선언)
    	//변수명 =값;(대입)
    	//자료형 변수명 = 값;(초기화)
    	
    	//변수의 표기법
    	//[카멜 표기법] (각 단어의 첫 ->대문자)
    	//int typeName = 100;
    	//boolean backColor = true;
    	
    	//[헝가리안 표기법] (앞에 자료형 첫글자 표시)
    	//int nTest = 100;
    	//short sTest = 100;
    	//float fTest = 3.14;
    	
    	//[ 파스칼 표기법] (의도적으로 첫글자 대문자 <클라스 등의 구별에 활용>)
    	//BackColor, TypeName ....
    	
    	//[ 스네이크 표기법] (언더바를 이용하여 구분하는 작성법)
    	//type_name, back_color ....
    	
    	//논리형 boolean
    	//논리형은 true, false 즉, 참과 거짓의 두 가지 값만 저장할 수 있다.
    	//boolean b =100; <-- 자료형의 타입이 일치하지 않으므로 오류
    	boolean b = true;
    	System.out.println("b의 값:"+b);
    	
    	b = false;
    	System.out.println("b의 값:"+b);
    	//변수명은 중복이 되면 안됩니다. (boolean b = false ;  (x) )
    	
    	//문자형 char
    	//문자형은 홑따옴표 안에 넣어야하며, 무조건 한글자
    	char c = 'A';
    	System.out.println("c의 값:" + c);
    	
    	char c2 = 65+ 1 ;
    	System.out.println("c2의 값:" + c2);
    	
    	//정수형
    	//byte by = 128; <-- byte 자료형의 표현범위를 넘어가는 값이므로 오류
    	byte by = 127;
    	short s = 32767;
    	int num = 2100000000;
    	long num2 = 2200000000L;  //인트범위를 벗어나는 long의 경우 뒤에 L(l) 넣어줘야함
    	
    	System.out.println("num:" + num);
    	System.out.println("num2:" + num2);
    	
    	//실수형
    	float f =3.14F;
    	double d = 3.14; // float의 값에는 뒤에 F(f)를 붙여야함
    	System.out.println("f:"+f);
    	System.out.println("d:"+d);
    	
    	f = 100f;
    	d = 100;
    	System.out.println("f:"+f);
    	System.out.println("d:"+d);
    	
    	
    	
	}
}
