package ex_multi_array;

public class Ex4_multi_array {
	public static void main(String[] args) {
		//2���� �迭 arr�� ��� ��� ���� �հ� ��� ���ϱ�
		int[][] arr = { {1,3,5,7},
			        	{10,12,15,21},
				        {11,12,13,14,15},
			        	{22,17,13}};
		float sum = 0;
		float average = 0;
		float trial = 0;
	
		for(int i= 0; i< arr.length; i++) {
			
			for(int j =0; j< arr[i].length; j++) {
				
			   sum += arr[i][j]; 
				trial ++;
			}//inner
			
			
		}//outer
		
		System.out.println("���� : "+ sum);
		average = sum/trial;
		System.out.println("��� : " + average);
		
	}//m

}
