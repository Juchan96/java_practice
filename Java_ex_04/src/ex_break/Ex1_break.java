package ex_break;

public class Ex1_break {
	public static void main(String[] args) {
		
		//break��: �ݺ��� ������ ���������� ���� ����� �ݺ����� �������� �� ���
		for(int i = 1; i <=3; i ++  ) {
		
			for(int j =1; j<=10; j++) {
			
				
				if( j % 2 ==0) {
					break;//���� ����� �ݺ����� Ż��  (break�� �����ϴ� for�� Ż��)
				}
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("-------------------------------------------------");
		
		int n = 1;
		while(true) {
			
			System.out.println( n );
			n++;
			
			if( n > 5) {
				break;
			}
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
	}//m

}
