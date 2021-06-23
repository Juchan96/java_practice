package ex_array;

public class Ex1_array {
	public static void main(String[] args) {

		//배열:
		//같은 자료형끼리 모아두는 하나의 묶음
		//효율적인 자료관리를 위해 반드시 필요
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//1) 배열 선언;
		int [] arr;
		
		//2) 배열 생성
		arr = new int[4];  //arr이란 사람이 heap에 방사이즈 4 정수만 저장가능한 집 지음 방마다 번호있음 0~3(index)
		
		//2.5) 선언과 생성을동시에
		//int[] arr = new int[4];
		
		//3) 배열 초기화
		/* arr[0] = 100;
		 arr[1] = 200;
		 arr[2] = 300;
		 arr[3] = 400; */     //드래그 후 컨트롤 '/'하면 전부 주석됨  (컨트롤 쉬프트 / 다중주석 - 컨쉬| 해제)
		
		 for ( int i = 0; i< arr.length; i++) {
			arr[i] = (i +1)*100 ;
			 
			 
			 
			 System.out.println(arr[i]);
		 } //방개수 남으면 0으로 출력댐
			 
			 
			 
		
	}//m
}










