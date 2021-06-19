package ex_operator;

public class Ex2_Operator {

public static void main(String[] args) {
		
		//논리연산자
		//비교연산자를 통한 연산이 2개이상 필요할 떄 사용
		int age = 20;
		int limit = 25;
		
		//&&(and)연산 : 앞쪽의 연산이 false면 뒤쪽 연산을 수행하지 않는다. 중요!!!
		boolean result = limit - age >= 5 && age > 20;    
		//&&는 and 연산자! 양쪽 둘다 참이어야 참
		System.out.println("&&연산:" + result);
		
		int n1 = 10;
		int n2 = 20;
		// bar 2개 즉 ||은 or 연산자임!!
		result = (n1+=10) > 19 || n2 - 10 == 11;
		// 마찬가지로 ||는 앞쪽 연산이 참이면 뒷쪽 연산은 수행하지 않는다. 중요!!!
		System.out.println("||연산:"+result);
		
		//!(not)연산: true는 false로 false는 true로 변환
		System.out.println("!연산:" + !result);
		// !result 했다고 해서 result 결과가 앞으로 쭉바뀌는 것이아니다 (일시적임)
		// ! 가 붙어있을경우에만 결과가 바뀜
		
		
		
	}//main
	
}
