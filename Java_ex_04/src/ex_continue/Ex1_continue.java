package ex_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		//continue�� : �ݺ��� ������ Ư�� ������� ������ �ǳʶٰ��� �� ��
		for( int i =1; i<=2; i++) {
			
			for(int j = 1; j<=5; j++) {
				
				if( j %2 == 0) {
					continue; //�Ʒ������� ���� x  ���� �����ϰ� �ִ� ���� ����� �ݺ����� ���������� �ö�(j++)
				}            //������ ������� �� ���� ���ǹ����� ��
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
		
			
			
		}//outer
		
		System.out.println("---------------------------------");
		
		int n = 0;
		while(n<10) {
			
			n++;
			if(n %2 ==0) {
				continue; //���ϰ�� �Ʒ� ���� x
			}
			
			System.out.println(n);
			
		}//while
		
		
		
		
		
		
	}//m

}
