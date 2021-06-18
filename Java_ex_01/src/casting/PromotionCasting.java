package casting;

public class PromotionCasting {
	
public static void main(String[] args) {
		
		//캐스팅(형변환)
		//1.프로모션 캐스팅: 큰 자료형에 작은 자료형이 대입되는 것(자동으로 이루어짐)
		double d = 100.5; //8byte
		int n = 200; //4byte
		
		d = n;  //d값에 n을 대입   더 큰 자료형에 작은 자료형이 대입
		System.out.println("d:"+d);
		
		char c ='A'; //2byte
		long l = 100; //8byte
		l = c; //아스키 코드로 변환됨
		System.out.println("l:"+l);
		
	}

}
