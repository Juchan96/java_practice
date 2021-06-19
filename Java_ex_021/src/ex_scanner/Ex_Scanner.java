package ex_scanner;

import java.util.Scanner;

public class Ex_Scanner {
	public static void main(String[] args) {
		
		
		//키보드의 값을 입력받기 위한 Scanner 클라스
		Scanner scan = new Scanner( System.in);  //스캐너 객체를 만든다
		//암기하기  키보드에서 값 받을  수 있음
	    System.out.println("정수:");
		
		int n = scan.nextInt();  //넥스트 인트에서 받아서 엔터를 받으면 int n으로 줌
	    System.out.println("입력받은 값:"+n);
	    
	    System.out.println("문장:");
	    String str = scan.next(); //정수 이외에 값을 입력받는 것이 next()임
	    System.out.println("입력받은 값:" + str);
	    
	    System.out.println("문장:");
	    Scanner scan2 = new Scanner(System.in);  //스캐너값을 새로받는다
	    str = scan2.nextLine();   //이 파트 집에서 열공!! nextLine 경우에만 좀 헷갈림
	    System.out.println("값:"+ str);
	    
	    
	
	}//main
}