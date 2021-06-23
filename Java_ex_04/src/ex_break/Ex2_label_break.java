package ex_break;

public class Ex2_label_break { 
	public static void main(String[] args) {
		
		//label break, label continue
		//가장 가까운 하나의 반복문에서만 영향을 미치는 break, continue와 달리
		//한번에 두 개 이상의 반복문에 영향을 주는 제어문 (이름표 이용)
		
		//outer라고 이름표 지어줌
		outer : for(int i = 1; i<= 3; i++) {
			
			for(int j = 1; j<=10; j ++) {
				
				if(j%2 ==0) {
					break outer;
				}
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
			
		}//outer
		
		
	}//m

}
