package ex3_while;

import java.util.Random;

public class Ex2_doWhile {
	public static void main(String[] args) {

		//do-while : (선 처리, 후 비교)     while문과 비슷하지만 첫코드는 무조건 실행 ( 선 비교, 후 처리)
		//제어문 중 유일하게 세미콜론(;)으로 끝난다.
		//do{
		// 조건식이 참일때 반복되는 영역
		//}while( 조건식 );

		int i = 9;
		do { 

			System.out.println(i);
			i++;                 //처음의 한번을 무조건 실행한다 (선처리) 코드 절약할 수 있는 상황 발생

		}while( i <= 10  );    //그다음 비교한다. (false일 경우 더이상 실행x)

		System.out.println("--------------------------------------------");

		//java, jsp, android 의 시험을 봤다.
		//각 과목의 점수는 랜덤으로 0~130점을 발생.
		//시험성적은 100점이 최대치 이므로, 100을 초과하는 난수가 나온 경우 에는
		//0~ 100점의 범위가 나오도록 난수를 재발생.
		//이렇게 세 과목의 점수가 0~ 100사이의 난수로 발생되었다면
		//각 과목별 점수를 화면에 출력

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
