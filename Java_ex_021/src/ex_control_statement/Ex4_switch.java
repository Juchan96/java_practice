package ex_control_statement;

public class Ex4_switch {

	public static void main(String[] args) {

		// switch-case
		// switch(�񱳰�<���ǽ�x>){
		// case ���ǰ�;
		// �񱳰��� ���ǰ��� ��ġ�ϸ� ����Ǵ� ����
		// break;
		// }

		int n = 0; // �غ��س��� �޴��� ���� ��� �׳� �Ѿ (�����޼��� x)
		switch (n) { // �񱳰�
		case 0: // ���ǰ�
			System.out.println("0.����");
			break; //���̽��� �극��ũ�� ��Ʈ��

		case 1:
			System.out.println("1.����");
			break;

		case 2:
			System.out.println("2.����");
			break;

		case 3:
			System.out.println("3.����");
			break;

		default:
			// �񱳰��� ���ǰ��� �Ѱ����� ��ġ���������� ����Ǵ� ����
			System.out.println("�߸��� �޴�����");
			break; 
		}// switch

	}// main
	
}
