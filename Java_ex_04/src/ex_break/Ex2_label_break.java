package ex_break;

public class Ex2_label_break { 
	public static void main(String[] args) {
		
		//label break, label continue
		//���� ����� �ϳ��� �ݺ��������� ������ ��ġ�� break, continue�� �޸�
		//�ѹ��� �� �� �̻��� �ݺ����� ������ �ִ� ��� (�̸�ǥ �̿�)
		
		//outer��� �̸�ǥ ������
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
