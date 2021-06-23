package ex_array;

public class Ex3_array {
	public static void main(String[] args) {

		/*//배열 선언
		int[ ] arr;

		//배열 생성
		arr = new int[3];

		//초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30; */
		
		int[ ] arr = {10, 20, 30};

		for(int i =0; i< arr.length; i++ ) {
			System.out.println(arr[i]);
			
		}
		System.out.println("-----------------------------------");
		//개선된 루프
		for(int n : arr ) {
			System.out.println(n);
			}
			
		char[] ch = {'A','B','C'};
		for(char c : ch) {
			System.out.println(c);
			
	
			
		} //아예 배열 안에 있는 내용들을 전부 출력하기 위한 코드임 (단점: 인덱스로 제어 불가능)
		
		
		
		


	}//m

}
