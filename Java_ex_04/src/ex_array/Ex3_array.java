package ex_array;

public class Ex3_array {
	public static void main(String[] args) {

		/*//�迭 ����
		int[ ] arr;

		//�迭 ����
		arr = new int[3];

		//�ʱ�ȭ
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30; */
		
		int[ ] arr = {10, 20, 30};

		for(int i =0; i< arr.length; i++ ) {
			System.out.println(arr[i]);
			
		}
		System.out.println("-----------------------------------");
		//������ ����
		for(int n : arr ) {
			System.out.println(n);
			}
			
		char[] ch = {'A','B','C'};
		for(char c : ch) {
			System.out.println(c);
			
	
			
		} //�ƿ� �迭 �ȿ� �ִ� ������� ���� ����ϱ� ���� �ڵ��� (����: �ε����� ���� �Ұ���)
		
		
		
		


	}//m

}
