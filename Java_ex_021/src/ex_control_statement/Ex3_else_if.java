package ex_control_statement;

public class Ex3_else_if {

public static void main(String[] args) {
		
		//����if��(else if) : �������� ���� �񱳰� �ʿ��� ��� ����ϴ� if
		//if(���ǽ�1){
		// ���ǽ�1�� ���϶� ����Ǵ� ����
		//}else if(���ǽ�2) {
		//���ǽ�2 �� ���϶� ����Ǵ� ����
	    //}
		// ��� ������ �����϶� ����Ǵ� ����
		
		int num = 45;
		String str = "�ȳ��ϼ���";
		
		if (num>= 90) {
			str = "��";
			
		}
		else if (num >= 80) {
			str = "��";
		} 
		else if (num >=70 ) {
			str = "��";
		}
		else if (num >= 60) {
			str = "��";
		}
		else if (num>=50) {
			str = "��";
		}
		else {
			str = "������Ⱑ �ƴϹ��ϴ�... �ִϸ��̾�";
		}
		
		System.out.println(str);
		
		
	
		
	}//main
	
}
