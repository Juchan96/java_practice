package ex_control_statement;

public class Ex2_if_else {

public static void main(String[] args) {
		
		//if-else
		//if( ){
		//
		//} else{
		//
		//}           else���� ()�� ����. ���ǽ��� ������ �� ����Ǵ� ����

		
		int n = 45;
		String str = "" ; //ó���� ��Ʈ�� �̷��� ������� ����
		System.out.println(str);
		
		if( ++n >=50 ) {
			
			str= "50�̻��� ��" ;
			
		}
		else {
			
			str = "n�� 50�̸��� ��";
		}
		System.out.println(str);
		System.out.println("--------------------------------------------");
		//���� age�� ���̸� �����ϰ�, 30�� �̻��̸�
		//��Ǹ�ŭ ��̳׿�, �׷��� ������
		//�� ��ŵ� �ǰھ�並 ����ϰ�
		//���������� �����մϴ�. ��� ������ ���
		
		int age = 24 ;
		str = "" ;    //�̹� ������ String str �آZ�� ������ str ���ص� �˴ϴ�!
		
		if(age >= 30) {
			str = "���� ��Ǹ�ŭ ��̳׿�.";
			
		}
		else {
			str = "�� ��ŵ� �ǰھ��";
		}
		System.out.println(str);
		System.out.println("�����մϴ�");
		System.out.println("--------------------------------------------");
		//���� �ڵ带 ���׿����ڷ� �����ϼ���.  �߿�!!!!!!!!!
		
		age = 34;
		str = (age>=30 ) ? "���� ��Ǹ�ŭ ��̳׿�" : " �� ��ŵ�  �ǰھ��";
		System.out.println(str);
		System.out.println("�����մϴ�");
		
		
		
		
		
		
		
	}//main  ����ǥ��
	
}
