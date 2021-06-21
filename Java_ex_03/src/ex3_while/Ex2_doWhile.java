package ex3_while;

import java.util.Random;

public class Ex2_doWhile {
	public static void main(String[] args) {

		//do-while : (�� ó��, �� ��)     while���� ��������� ù�ڵ�� ������ ���� ( �� ��, �� ó��)
		//��� �� �����ϰ� �����ݷ�(;)���� ������.
		//do{
		// ���ǽ��� ���϶� �ݺ��Ǵ� ����
		//}while( ���ǽ� );

		int i = 9;
		do { 

			System.out.println(i);
			i++;                 //ó���� �ѹ��� ������ �����Ѵ� (��ó��) �ڵ� ������ �� �ִ� ��Ȳ �߻�

		}while( i <= 10  );    //�״��� ���Ѵ�. (false�� ��� ���̻� ����x)

		System.out.println("--------------------------------------------");

		//java, jsp, android �� ������ �ô�.
		//�� ������ ������ �������� 0~130���� �߻�.
		//���輺���� 100���� �ִ�ġ �̹Ƿ�, 100�� �ʰ��ϴ� ������ ���� ��� ����
		//0~ 100���� ������ �������� ������ ��߻�.
		//�̷��� �� ������ ������ 0~ 100������ ������ �߻��Ǿ��ٸ�
		//�� ���� ������ ȭ�鿡 ���

		//java : 90
		//jsp : 76
		//android : 89

		int java = 0;
		int jsp = 0;
		int android = 0;

		do { java  = new Random().nextInt( 130- 1 + 1) + 1;
		jsp = new Random().nextInt( 130- 1 + 1) + 1;
		android = new Random().nextInt( 130- 1 + 1) + 1;

		}while (java >100 || jsp >100 || android > 100);

		System.out.println("java:" + java);
		System.out.println("jsp:" + jsp);
		System.out.println("android:" + android);



	}//main

}
