package ex_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
		
		//1���� �迭�� 2�� ���������� 2���� �迭
		//1���� �迭�� 3�� ���������� 3���� �迭
		int[][] test = new int[2][3];
		            //1�����迭�Ǽ�(ū��) | �� 1���� �迭�� index ��(������)
		
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;   //��� �� ���� �Ҵ�      || ���� ���� �濡�� ���� ä�� �� ���� || 3���� �̻���ʹ� ���� �������� ���°� ���ϴ�
		
		System.out.println(test[1][1]);
		System.out.println(test.length );
		
		for(int i = 0; i < test.length; i ++) {     //test.length : �迭 ū ���� �� !!!!!
			
			for(int j = 0; j< test[i].length; j++) {   // test[i].length : �迭 ���� ���� ��!!!
				
				System.out.print(test[i][j]+" ");
			}//inner
			
			System.out.println();  //�̰� ���� 
			
		}//outer
		
		
		
		
		
		
		
		
		
		
	}//m

}
