package work;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {

		//1~45������ �ߺ����� �ʴ� ������ �߻�����
		//�ζǹ�ȣ �����⸦ ���弼��.
		int[ ] lotto = new int[6];
		/*	int a = 0;

		for(int i =0; i< lotto.length; i++) {

			while(true) {
				a = new Random().nextInt(45)+1;

				if(a != lotto[0]&&
						a != lotto[1]&&
						a != lotto[2]&&
						a != lotto[3]&&
						a != lotto[4]&&
						a != lotto[5]
						) {
					lotto[i] = a;
					break;

				}//if

			}//while
			System.out.print(lotto[i]+" ");
		}//for
		 */

		System.out.println("-------------------����� ���----------------------");

		outer : for(int i = 0; i< lotto.length; ) {

			lotto[i] = new Random().nextInt(6) +1;
			
			//�ߺ��� ��
			for(int j = 0; j<i; j ++) {
				
				if(lotto[i] == lotto[j]) {
					continue outer;
					
				}//if
				
				
			}//inner
			System.out.print(lotto[i]+" ");
			i++;
			
		}//outer







	}//m

}
