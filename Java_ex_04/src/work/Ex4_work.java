package work;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {

		//Ű���忡�� ������ �Է¹ް�, �Է¹��� ���� �Ҽ����� �ƴ����� �Ǵ�.


		System.out.println("���� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count =0;

		for(int i = 1; i<=n ; i++ ) {

			int a = n%i   ;

			if (a == 0) {
				count ++;
			}

		}//for

		if(count == 2) {

			System.out.println("�Ҽ��Դϴ�");
		}

		else {System.out.println("�Ҽ��� �ƴմϴ�");
		}		





	}//m

}
