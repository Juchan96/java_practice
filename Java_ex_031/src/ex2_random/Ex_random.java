package ex2_random;

import java.util.Random;

public class Ex_random {
	public static void main(String[] args) {
		
		//�����߻�
		//��) 1~10������ ����
		// new Random().nextInt( �߻����� ) + ���ۼ�;
		//  new Random().nextInt( ū�� - ������ +1 ) + ���ۼ�;
		int num = new Random().nextInt( 19750-1330 +1 ) + 1330;    // 1330 ~19750 ���� ����
		System.out.println(num);
		
		
		//���ĺ� �빮�� A~Z�� �ϳ��� �������� ����ϼ���
		int alphabet = new Random().nextInt('Z'-'A'+1) + 'A';
		System.out.printf("%c\n" , alphabet);
		System.out.println((char)alphabet);
	}//main
}
