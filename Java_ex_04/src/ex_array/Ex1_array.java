package ex_array;

public class Ex1_array {
	public static void main(String[] args) {

		//�迭:
		//���� �ڷ������� ��Ƶδ� �ϳ��� ����
		//ȿ������ �ڷ������ ���� �ݵ�� �ʿ�
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//1) �迭 ����;
		int [] arr;
		
		//2) �迭 ����
		arr = new int[4];  //arr�̶� ����� heap�� ������� 4 ������ ���尡���� �� ���� �渶�� ��ȣ���� 0~3(index)
		
		//2.5) ����� ���������ÿ�
		//int[] arr = new int[4];
		
		//3) �迭 �ʱ�ȭ
		/* arr[0] = 100;
		 arr[1] = 200;
		 arr[2] = 300;
		 arr[3] = 400; */     //�巡�� �� ��Ʈ�� '/'�ϸ� ���� �ּ���  (��Ʈ�� ����Ʈ / �����ּ� - ����| ����)
		
		 for ( int i = 0; i< arr.length; i++) {
			arr[i] = (i +1)*100 ;
			 
			 
			 
			 System.out.println(arr[i]);
		 } //�氳�� ������ 0���� ��´�
			 
			 
			 
		
	}//m
}










