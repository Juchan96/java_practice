package ex_control_statement;

public class Ex5_switch {

		public static void main(String[] args) {
			
			char set = '수';
			String result = "";
			
			switch (set) {
			case '수':  //케이스 쪽에서도 캐릭터 타입인 '수'로 해줘야함
				result = "90~100";
				break;
			case '우':
			    result = "80~89";
			    break;
			case '미':
			    result = "70~79";
			    break;
			case '양':
			    result = "60~69";
		        break;
			case '가':
			    result = "59점 이하";
		        break;

			default:
				result = "성적을 올바르게 입력하세요";
				break;
			}
			System.out.println(result);
			
			
		}//main
	
}
