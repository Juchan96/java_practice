package work; 

import java.util.Random;
import java.util.Scanner;

public class Ex5_Baseball {
	public static void main(String[] args) {

		//��ǻ�Ͱ� �Ȱ�ģ�ٴ� �����Ͽ� 1~9������ ���� ����
		//com: 256
		//me: 123
		//0s , 1ball
		//��ġ�ϴ� �� but �ٸ� �ڸ�:1ball
		//��ġ�ϴ¼� and ���� �ڸ�: 1strike
		//���� �ٸ��� out
		//ù��° : 5
		//�ι��� : 2
		//������ : 6
		//out!


		Scanner scan = new Scanner(System.in);

		//��ǻ�Ͱ� �߻� ��ų ����
		/*int c1 = 0, c2 = 0 , c3 = 0;




		do {
			//1~9������ �ߺ������ʴ� ���� ����
			c1 = new Random().nextInt(9-1+1) + 1;
			c2 = new Random().nextInt(9-1+1) + 1;
			c3 = new Random().nextInt(9-1+1) + 1;*/

		int [ ] com = new int[3];

		do {

			for(int i = 0; i< com.length; i ++) {
				com[i] = new Random().nextInt(9-1+1) + 1;

			}



		}while( com[0] == com[1] || com[0] == com[2] || com[1] == com[2]);
		System.out.println("ġƮ : " +com[0]+com[1]+com[2]);  //������� ��ǻ�� ���� ���� ����
		//����ڰ� �Է¹��� ��
		int [ ] user = new int[3];

		int count = 0;
		while(true) {
			System.out.println("���ڸ� ���� �Է��ϼ���. (��:123) : ");
			int number = scan.nextInt();
int strike =0;
int ball = 0;
			//����ڰ� �Է¹��� ���ڸ� ���� ��,��,���� �ڸ��� ��� user�迭�� ����
			user[0] = number / 100;
			user[1] = number % 100 / 10;
			user[2] = number % 100 % 10; 
			//����� ��
			for(int i = 0; i < user.length; i++) {
				
				for(int j = 0; j < user.length; j++ ) {
					
					if( i == j ) {
						if( com[i] == user[j] ) {
							strike ++;
							//�ڸ��� ������ ���ڵ� ���� ���
						}
						
					}else {
						if(com[i] ==user[j]) {
							ball++;  //�ڸ��� �ٸ��� ���ڰ� ���� ���
						}
						
					}
					
				}//inner
				
			}//outer


			System.out.println("��Ʈ����ũ :"+strike);
			System.out.println("�� : "+ball);
			count ++;
			if (strike ==0 && ball ==0) {
				System.out.println("�ƿ�!");


			}
			if (strike == 3) {
				System.out.println("�õ�Ƚ��:"+ count);
				break;
			}

		}//while
		System.out.println("�¸�");


	}//m

}
