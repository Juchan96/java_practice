package ex_array;

import java.util.Random;

public class Ex6_array {
	public static void main(String[] args) {
		
		//���� money�� 10~5000������ ������ �߻����� �ִ´�.
		//��, 3450,2100�� ���� 1�� �ڸ����ڴ� ������ 0�� �Ǿ���Ѵ�.
		
		//�߻��� ���� money�� �������� �ٲ�����
		//500�� 100, 50,10��¥�� ������ ���� � �Ž��� �������� �Ǵ�.
		
		//��, ������ ���� ���� �������� �Ž��� �־�� �Ѵ�!!
		
		//�ݾ�:2590
		//500��:5
		//50��:1
		//10��:4
		
		
		
		
		/*int money = new Random().nextInt((500-1+1)+ 1)*10;
		
		System.out.println(money);
		int m500 = 0;
		int m100 = 0;
		int m50 = 0;
		int m10 = 0;
		
		int[] coin = {500, 100, 50, 10 };
		
		for (int i =0; i < coin.length; i++) {
		    if(i==0) {
			m500 = money / coin[i];
		    }
		    if(i==1) {
		    	m100 = money % 500 / coin[i];
		    }
		    if(i==2) {
		    	m50 = money % 100 / coin[i];
		    
		    }
		    if(i==3) {
		    	m10 = money % 50/ coin[i];
		    }
		    
		  
						
		}//for
		System.out.println("500�� : "+m500);
		System.out.println("100�� : "+m100);
		System.out.println("50�� : " +m50);
		System.out.println("10�� : "+m10);
		*/
		
		System.out.println("---------------����� ���----------------------------------");
		int money = new Random().nextInt((500-1+1)+ 1)*10;
		int[] coin = {500,100,50,10};
		
		
		System.out.println("�ݾ�: " + money);
		for(int i = 0; i<coin.length; i++) {
			
			int m =money / coin[i];
			if(m>0) {
				
				System.out.println(coin[i]+"�� :" +m);
				money %= coin[i]; //�ٽ�!!
			}
			
		}
		
	}//m

}
