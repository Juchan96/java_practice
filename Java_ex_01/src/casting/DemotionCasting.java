package casting;

public class DemotionCasting {
	
public static void main(String[] args) {
		
		//디모션 캐스팅: 작은 자료형에 큰 자료형이 대입되는 형태
		char c = 'B'; // 2byte
		int n = c + 1; // 4byte
		//c = n;  2byte 에 4byte 값을 넣을 수 없다. 손실되는 값이 생길 수 있다. (오류발생)
		
		c = (char)n;  //굳이 이렇게 한다고 말해줍니다. 
		System.out.println("c:"+c);
		
		float f = 5.5f;
		System.out.println("f:"+f);
		n = 0;
		n = (int)f;  //소수점 날라가는 것 감수하면서 까지 실수 -->정수 변환
		System.out.println("n:"+n);
		
	}
}
