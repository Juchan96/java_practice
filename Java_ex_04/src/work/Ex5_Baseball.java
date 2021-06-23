package work; 

import java.util.Random;
import java.util.Scanner;

public class Ex5_Baseball {
	public static void main(String[] args) {

		//컴퓨터가 안겹친다는 조건하에 1~9사이의 난수 설정
		//com: 256
		//me: 123
		//0s , 1ball
		//일치하는 수 but 다른 자리:1ball
		//일치하는수 and 같은 자리: 1strike
		//전부 다르면 out
		//첫번째 : 5
		//두번쨰 : 2
		//세번쨰 : 6
		//out!


		Scanner scan = new Scanner(System.in);

		//컴퓨터가 발생 시킬 난수
		/*int c1 = 0, c2 = 0 , c3 = 0;




		do {
			//1~9사이의 중복되지않는 난수 생성
			c1 = new Random().nextInt(9-1+1) + 1;
			c2 = new Random().nextInt(9-1+1) + 1;
			c3 = new Random().nextInt(9-1+1) + 1;*/

		int [ ] com = new int[3];

		do {

			for(int i = 0; i< com.length; i ++) {
				com[i] = new Random().nextInt(9-1+1) + 1;

			}



		}while( com[0] == com[1] || com[0] == com[2] || com[1] == com[2]);
		System.out.println("치트 : " +com[0]+com[1]+com[2]);  //여기까지 컴퓨터 랜덤 점수 생성
		//사용자가 입력받은 값
		int [ ] user = new int[3];

		int count = 0;
		while(true) {
			System.out.println("세자리 수를 입력하세요. (예:123) : ");
			int number = scan.nextInt();
int strike =0;
int ball = 0;
			//사용자가 입력받은 세자리 수를 백,십,일의 자리로 끊어서 user배열에 저장
			user[0] = number / 100;
			user[1] = number % 100 / 10;
			user[2] = number % 100 % 10; 
			//경우의 수
			for(int i = 0; i < user.length; i++) {
				
				for(int j = 0; j < user.length; j++ ) {
					
					if( i == j ) {
						if( com[i] == user[j] ) {
							strike ++;
							//자리도 같은데 숫자도 같은 경우
						}
						
					}else {
						if(com[i] ==user[j]) {
							ball++;  //자리는 다른데 숫자가 같은 경우
						}
						
					}
					
				}//inner
				
			}//outer


			System.out.println("스트라이크 :"+strike);
			System.out.println("볼 : "+ball);
			count ++;
			if (strike ==0 && ball ==0) {
				System.out.println("아웃!");


			}
			if (strike == 3) {
				System.out.println("시도횟수:"+ count);
				break;
			}

		}//while
		System.out.println("승리");


	}//m

}
