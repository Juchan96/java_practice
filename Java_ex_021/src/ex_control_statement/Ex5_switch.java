package ex_control_statement;

public class Ex5_switch {

		public static void main(String[] args) {
			
			char set = '��';
			String result = "";
			
			switch (set) {
			case '��':  //���̽� �ʿ����� ĳ���� Ÿ���� '��'�� �������
				result = "90~100";
				break;
			case '��':
			    result = "80~89";
			    break;
			case '��':
			    result = "70~79";
			    break;
			case '��':
			    result = "60~69";
		        break;
			case '��':
			    result = "59�� ����";
		        break;

			default:
				result = "������ �ùٸ��� �Է��ϼ���";
				break;
			}
			System.out.println(result);
			
			
		}//main
	
}
