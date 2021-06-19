package ex_control_statement;

public class Ex2_if_else {

public static void main(String[] args) {
		
		//if-else
		//if( ){
		//
		//} else{
		//
		//}           else에는 ()가 없다. 조건식이 거짓일 떄 실행되는 영역

		
		int n = 45;
		String str = "" ; //처음에 스트링 이렇게 비워놓고 시작
		System.out.println(str);
		
		if( ++n >=50 ) {
			
			str= "50이상의 수" ;
			
		}
		else {
			
			str = "n은 50미만의 수";
		}
		System.out.println(str);
		System.out.println("--------------------------------------------");
		//변수 age에 나이를 대입하고, 30세 이상이면
		//드실만큼 드셨네요, 그렇지 않으면
		//더 드셔도 되겠어요를 출력하고
		//마지막으로 감사합니다. 라는 문장을 출력
		
		int age = 24 ;
		str = "" ;    //이미 위에서 String str 해줫기 때문에 str 만해도 됩니다!
		
		if(age >= 30) {
			str = "나이 드실만큼 드셨네요.";
			
		}
		else {
			str = "더 드셔도 되겠어요";
		}
		System.out.println(str);
		System.out.println("감사합니당");
		System.out.println("--------------------------------------------");
		//위의 코드를 삼항연산자로 변경하세요.  중요!!!!!!!!!
		
		age = 34;
		str = (age>=30 ) ? "나이 드실만큼 드셨네요" : " 더 드셔도  되겠어요";
		System.out.println(str);
		System.out.println("감사합니당");
		
		
		
		
		
		
		
	}//main  메인표시
	
}
