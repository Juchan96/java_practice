package ex_array;

import java.util.Random;

public class Ex6_array {
	public static void main(String[] args) {
		
		//변수 money에 10~5000사이의 난수를 발생시켜 넣는다.
		//단, 3450,2100과 같이 1의 자리숫자는 무조건 0이 되어야한다.
		
		//발생한 난수 money를 동전으로 바꿨을떄
		//500원 100, 50,10원짜리 동전이 각각 몇개 거슬러 지는지를 판단.
		
		//단, 가능한 적은 수의 동전으로 거슬러 주어야 한다!!
		
		//금액:2590
		//500원:5
		//50원:1
		//10원:4
		
		
		
		
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
		System.out.println("500원 : "+m500);
		System.out.println("100원 : "+m100);
		System.out.println("50원 : " +m50);
		System.out.println("10원 : "+m10);
		*/
		
		System.out.println("---------------강사님 방법----------------------------------");
		int money = new Random().nextInt((500-1+1)+ 1)*10;
		int[] coin = {500,100,50,10};
		
		
		System.out.println("금액: " + money);
		for(int i = 0; i<coin.length; i++) {
			
			int m =money / coin[i];
			if(m>0) {
				
				System.out.println(coin[i]+"원 :" +m);
				money %= coin[i]; //핵심!!
			}
			
		}
		
	}//m

}
