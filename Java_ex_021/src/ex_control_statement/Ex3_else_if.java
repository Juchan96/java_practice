package ex_control_statement;

public class Ex3_else_if {

public static void main(String[] args) {
		
		//다중if문(else if) : 여러개의 조건 비교가 필요한 경우 사용하는 if
		//if(조건식1){
		// 조건식1이 참일때 실행되는 영역
		//}else if(조건식2) {
		//조건식2 가 참일때 실행되는 영역
	    //}
		// 모든 조건이 거짓일때 실행되는 영역
		
		int num = 45;
		String str = "안녕하세요";
		
		if (num>= 90) {
			str = "수";
			
		}
		else if (num >= 80) {
			str = "우";
		} 
		else if (num >=70 ) {
			str = "미";
		}
		else if (num >= 60) {
			str = "양";
		}
		else if (num>=50) {
			str = "가";
		}
		else {
			str = "사람세기가 아니무니다... 애니멀이야";
		}
		
		System.out.println(str);
		
		
	
		
	}//main
	
}
