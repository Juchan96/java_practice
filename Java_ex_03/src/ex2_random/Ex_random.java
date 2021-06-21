package ex2_random;

import java.util.Random;

public class Ex_random {
	public static void main(String[] args) {
		
		//난수발생
		//예) 1~10사이의 난수
		// new Random().nextInt( 발생범위 ) + 시작수;
		//  new Random().nextInt( 큰수 - 작은수 +1 ) + 시작수;
		int num = new Random().nextInt( 19750-1330 +1 ) + 1330;    // 1330 ~19750 까지 범위
		System.out.println(num);
		
		
		//알파벳 대문자 A~Z중 하나를 랜덤으로 출력하세요
		int alphabet = new Random().nextInt('Z'-'A'+1) + 'A';
		System.out.printf("%c\n" , alphabet);
		System.out.println((char)alphabet);
	}//main
}
