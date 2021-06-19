package ex_control_statement;

public class Ex4_switch {

	public static void main(String[] args) {

		// switch-case
		// switch(비교값<조건식x>){
		// case 조건값;
		// 비교값과 조건값이 일치하면 실행되는 영역
		// break;
		// }

		int n = 0; // 준비해놓은 메뉴에 없을 경우 그냥 넘어감 (오류메세지 x)
		switch (n) { // 비교값
		case 0: // 조건값
			System.out.println("0.설정");
			break; //케이스와 브레이크는 세트다

		case 1:
			System.out.println("1.시작");
			break;

		case 2:
			System.out.println("2.정보");
			break;

		case 3:
			System.out.println("3.종료");
			break;

		default:
			// 비교값과 조건값이 한가지도 일치하지않을때 수행되는 영역
			System.out.println("잘못된 메뉴선택");
			break; 
		}// switch

	}// main
	
}
