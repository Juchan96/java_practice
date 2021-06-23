package ex_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		//continue문 : 반복문 내에서 특정 문장들을 강제로 건너뛰고자 할 때
		for( int i =1; i<=2; i++) {
			
			for(int j = 1; j<=5; j++) {
				
				if( j %2 == 0) {
					continue; //아래쪽으로 진행 x  나를 포장하고 있는 가장 가까운 반복문의 증감식으로 올라감(j++)
				}            //증감식 없을경우 그 옆의 조건문으로 들어감
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
		
			
			
		}//outer
		
		System.out.println("---------------------------------");
		
		int n = 0;
		while(n<10) {
			
			n++;
			if(n %2 ==0) {
				continue; //참일경우 아래 실행 x
			}
			
			System.out.println(n);
			
		}//while
		
		
		
		
		
		
	}//m

}
