package work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		//Ű���忡�� ���� n1, n2�� �޴´�.
		//n1 ���� n2������ ���� ���
		//���� ��� 2�� 5�� �޾Ҵٸ�.. 2+ 3+ 4+ 5
		
		//����1: 2
		//����2: 5
		//���:14
		
		//���� 1: 5
		//���� 2: 2
		//���: 14  ��� �����޵��� �Է¹��� ���� ������ ����
		
		int result = 0;
		int n3= 0;
		int n4 =0;
		Scanner scan = new Scanner(System.in); //�ϳ��� ���
		
		System.out.println("���� 1 �Է�");
		int n1 = scan.nextInt();
		System.out.println("���� 2 �Է�");
		int n2 = scan.nextInt();
		
		if (n2 > n1) {
			n3 = n2; //ū��
			n4 = n1;
		}
		else if (n1 > n2) {
			n3 = n1; //ū��
			n4 = n2;
		}
		
		for(int i = n4 ; i<= n3; i ++) {
			
			result += i;
			
		}//for
		System.out.println(result);
		
		
		
		//���� �ΰ� ���� �ٲٴ� ��� (temp) �̿�
		//if (n1>n2){
		// int n3 = n1;
		// n1 = n2;
		// n2 = n3;}
			
			
		
		
		
		
		
		
	}//m

}
