package ex_operator;

public class Ex2_Operator {

public static void main(String[] args) {
		
		//��������
		//�񱳿����ڸ� ���� ������ 2���̻� �ʿ��� �� ���
		int age = 20;
		int limit = 25;
		
		//&&(and)���� : ������ ������ false�� ���� ������ �������� �ʴ´�. �߿�!!!
		boolean result = limit - age >= 5 && age > 20;    
		//&&�� and ������! ���� �Ѵ� ���̾�� ��
		System.out.println("&&����:" + result);
		
		int n1 = 10;
		int n2 = 20;
		// bar 2�� �� ||�� or ��������!!
		result = (n1+=10) > 19 || n2 - 10 == 11;
		// ���������� ||�� ���� ������ ���̸� ���� ������ �������� �ʴ´�. �߿�!!!
		System.out.println("||����:"+result);
		
		//!(not)����: true�� false�� false�� true�� ��ȯ
		System.out.println("!����:" + !result);
		// !result �ߴٰ� �ؼ� result ����� ������ �߹ٲ�� ���̾ƴϴ� (�Ͻ�����)
		// ! �� �پ�������쿡�� ����� �ٲ�
		
		
		
	}//main
	
}
